package com.webSocket.controller;

import com.webSocket.request.ClientRequest;
import com.webSocket.response.ServerResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liaoyubo
 * @version 1.0 2017/12/28
 * @description 客户端请求controller
 */
@Controller
public class ClientRequestController {

    @RequestMapping(value = "/index")
    public void index(){

    }

    @MessageMapping("/connect")
    @SendTo("/subscribe/info")
    public ServerResponse connect(ClientRequest clientRequest){
        System.out.println(clientRequest.getMessage());
        return new ServerResponse("welcome " + clientRequest.getMessage());
    }
}
