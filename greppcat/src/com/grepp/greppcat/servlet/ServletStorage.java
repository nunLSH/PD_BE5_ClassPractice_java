package com.grepp.greppcat.servlet;

import com.grepp.greppcat.exception.ServletInitializeException;
import com.grepp.greppcat.servlet.annotation.RequestMapping;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ServletStorage {

    private final Map<String, Servlet> servlets;

    private static ServletStorage instance;

    public static ServletStorage getInstance(){
        if(instance == null)
            throw new ServletInitializeException("ServletStorage not initialized");

        return instance;
    }

    public static ServletStorage init(List<Servlet> servlets){
        if(instance == null){
            instance = new ServletStorage(servlets);
        }
        return instance;
    }

    private ServletStorage(List<Servlet> servlets) {
        this.servlets = registServlet(servlets);
    }

    private Map<String, Servlet> registServlet(List<Servlet> servlets) {
        Map<String, Servlet> servletMap = new LinkedHashMap<>();

        for(Servlet servlet : servlets){
            RequestMapping requestMapping = servlet.getClass().getAnnotation(RequestMapping.class);

            if(requestMapping == null)
                throw new ServletInitializeException(servlet.getClass().getCanonicalName()
                    +  " is not annotated with @RequestMapping");

            String url = requestMapping.url().replaceFirst("/", "");

            if(servletMap.containsKey(url))
                throw new ServletInitializeException(servlet.getClass().getCanonicalName()
                    + " : " + requestMapping.url() + " is already registered");
            servletMap.put(url, servlet);
        }


        return servletMap;
    }

    public Servlet getServlet(String url){
        return servlets.get(url.split("/")[0]);
    }

}