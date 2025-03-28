package com.grepp.greppcat.a_tcp.servlet;

import com.grepp.greppcat.a_tcp.exception.ServletInitializeException;
import java.util.Map;

public class ServletStorage {

    private final Map<String, Servlet> servlets;

    private static ServletStorage instance;

    public static ServletStorage getInstance(){
        if(instance == null)
            throw new ServletInitializeException("ServletStorage not initialized");

        return instance;
    }

    public static ServletStorage init(Map<String, Servlet> servlets){
        if(instance == null){
            instance = new ServletStorage(servlets);
        }
        return instance;
    }

    private ServletStorage(Map<String, Servlet> servlets) {
        this.servlets = servlets;
    }

    public Servlet getServlet(String url){
        return servlets.get(url);
    }

}