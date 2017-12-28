package com.webSocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @author liaoyubo
 * @version 1.0 2017/12/28
 * @description 配置基础接入信息
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {


    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        //用于创建一个endpoint节点，使用SockJS的接入
        stompEndpointRegistry.addEndpoint("/webSocketPush").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //用于订阅的地址起始路径
        registry.enableSimpleBroker("/subscribe");
        //用于客户端发送数据给服务端后，服务端返回信息给客户端的起始路径
        registry.setApplicationDestinationPrefixes("/send");
    }
}
