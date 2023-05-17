package com.softProject.web.servlet;

import com.alibaba.fastjson.JSON;
import com.softProject.pojo.User;
import com.softProject.service.LoginService;
import com.softProject.service.impl.LoginServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(urlPatterns = "/login/*")
public class LoginServlet extends BaseServlet {
    private final LoginService loginService = new LoginServiceImpl();

    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");

        InputStream inputStream = getServletContext().getResourceAsStream("./login.html");
        OutputStream outputStream = response.getOutputStream();

        byte[] buff = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buff)) != -1) {
            outputStream.write(buff, 0, bytesRead);
        }

        outputStream.close();
        inputStream.close();
    }

    public void selectById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();

        User user = JSON.parseObject(params, User.class);
        boolean flag = loginService.selectById(user);

        if (flag) {
            //使用session存储用户凭证
            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            //发送成功消息
            response.setContentType("text/text;charset=utf-8");
            response.getWriter().write("success");
        } else {
            response.setContentType("text/text;charset=utf-8");
            response.getWriter().write("fail");
        }
    }
}
