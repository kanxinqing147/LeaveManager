package com.softProject.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 放行登录页面
        String[] urls = {"/errorLogin.html", "/login.html", "/node_modules", "/js/util.js", "/login"};
        String url = req.getRequestURL().toString();

        for (String u: urls) {
            if (url.contains(u)) {
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
        }

        // 如果已登录则放行
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if (user != null) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            String contextPath = req.getContextPath();
            response.sendRedirect(contextPath + "/errorLogin.html");
        }
    }

    @Override
    public void destroy() {
    }
}
