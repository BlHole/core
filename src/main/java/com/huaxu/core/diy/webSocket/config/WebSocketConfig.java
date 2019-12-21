package com.huaxu.core.diy.webSocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/25 09:56</p>
 * <p>author：huaxu</p>
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}