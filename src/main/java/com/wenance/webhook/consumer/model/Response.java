package com.wenance.webhook.consumer.model;

public class Response {

    private String response;

    public Response () {}

    public Response(String response){
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
