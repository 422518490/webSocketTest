package com.webSocket.controller;

import com.webSocket.response.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaoyubo
 * @version 1.0 2017/12/28
 * @description 服务端主动推送controller
 */
@RestController
public class ServerResponseController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @RequestMapping("/test")
    public String test(){
        //给订阅路径发送消息
        simpMessagingTemplate.convertAndSend("/subscribe/info",new ServerResponse("server send"));
        return "";
    }

}
