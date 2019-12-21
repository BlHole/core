package com.huaxu.core.diy.tomcat.servlet;

import com.huaxu.core.diy.tomcat.request.Request;
import com.huaxu.core.diy.tomcat.response.Response;

public class FirstServlet extends AbstractServlet {

    @Override
    public void doGet(Request request, Response response) {
        response.setWrite("我的第一个Servlet");
    }

    @Override
    public void doPost(Request request, Response response) {
        this.doGet(request, response);
    }
}