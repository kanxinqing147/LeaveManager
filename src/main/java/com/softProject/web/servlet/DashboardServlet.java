package com.softProject.web.servlet;

import com.alibaba.fastjson.JSON;
import com.softProject.pojo.*;
import com.softProject.service.DashboardService;
import com.softProject.service.impl.DashboardServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

@WebServlet(urlPatterns = "/dashboard/*")
public class DashboardServlet extends BaseServlet{
    private DashboardService dashboardService = new DashboardServiceImpl();

    public void dashboard(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");

        InputStream inputStream = getServletContext().getResourceAsStream("./dashboard.html");
        OutputStream outputStream = response.getOutputStream();

        byte[] buff = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buff)) != -1) {
            outputStream.write(buff, 0, bytesRead);
        }

        outputStream.close();
        inputStream.close();
    }

    public void selectInNotifyByConditions(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));

        BufferedReader br = request.getReader();
        String params = br.readLine();
        params = new String(params.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        Notify notify = JSON.parseObject(params, Notify.class);

        PageBean<Notify> pageBean = dashboardService.selectByCondition(currentPage, pageSize, notify);
        String jsonString = JSON.toJSONString(pageBean);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    public void getUsername(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        Student student = dashboardService.selectByStudentId(user.getUserId());
        Teacher teacher = dashboardService.selectByTeacherId(user.getUserId());
        String username = "";
        if (student != null) {
            username = student.getStudentName();
        } else if (teacher != null) {
            username = teacher.getTeacherName();
        }

        response.setContentType("text/text;charset=utf-8");
        response.getWriter().write(username);
    }

    public void deleteSession(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.invalidate();
    }
}
