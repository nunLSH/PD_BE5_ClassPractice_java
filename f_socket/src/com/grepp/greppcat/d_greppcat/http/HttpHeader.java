package com.grepp.greppcat.d_greppcat.http;

import com.grepp.greppcat.d_greppcat.util.MultiValueMap;
import java.util.List;
import java.util.Map.Entry;

public class HttpHeader extends MultiValueMap<String, String> {

    public HttpHeader add(String headerTxt){
        String[] token = headerTxt.split(":");
        super.add(token[0], token[1]);
        return this;
    }

    public HttpHeader add(String name, String value){
        super.add(name, value);
        return this;
    }

    public List<String> getHeader(String name){
        return super.get(name);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Entry<String, List<String>> entry : super.entrySet()){
            for(String value : entry.getValue()){
                sb.append(entry.getKey()).append(": ").append(value).append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}