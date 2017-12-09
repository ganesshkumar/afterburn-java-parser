package com.ganesshkumar.afterburn.parser;

public class Request {
    private Headers headers;
    private String body;

    public Request(Headers headers, String body) {
        this.headers = headers;
        this.body = body;
    }

    public Headers getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }
}
