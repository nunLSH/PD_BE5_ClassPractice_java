package com.grepp.greppcat.http.response;

public class ResponseBody {

    private byte[] body;

    public ResponseBody() {
        this.body = new byte[0];
    }

    public ResponseBody addBody(byte[] bytes){
        this.body = bytes;
        return this;
    }

    public byte[] getBody() {
        return body;
    }
}