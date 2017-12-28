package com.webSocket.response;

/**
 * @author liaoyubo
 * @version 1.0 2017/12/28
 * @description 服务端返回构造类
 */
public class ServerResponse {

    private String respMessage;

    public ServerResponse() {
    }

    public ServerResponse(String respMessage) {
        this.respMessage = respMessage;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }
}
