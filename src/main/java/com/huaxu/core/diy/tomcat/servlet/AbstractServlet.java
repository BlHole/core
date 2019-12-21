package com.huaxu.core.diy.tomcat.servlet;

import com.huaxu.core.diy.tomcat.request.Request;
import com.huaxu.core.diy.tomcat.response.Response;

/**
 * @author zy
 */
public abstract class AbstractServlet {

    public abstract void doGet(Request request, Response response);

    public abstract void doPost(Request request, Response response);
}