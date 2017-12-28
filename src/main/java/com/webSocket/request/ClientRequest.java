package com.webSocket.request;

/**
 * @author liaoyubo
 * @version 1.0 2017/12/28
 * @description 客户端请求构造类
 */
public class ClientRequest {

    private String message;

    public ClientRequest() {
    }

    public ClientRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
