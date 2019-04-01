package com.example.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.websocket.OnMessage;

/**
 * @author dbein
 */
@Component
public class WebSocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
    }

    // 连接 就绪时
    @Override
    public void afterConnectionEstablished(WebSocketSession session)
            throws Exception {
        System.out.println(session.getLocalAddress());
//        users.put(session.getId(), session);
    }

    // 处理信息
    @Override
    public void handleMessage(WebSocketSession session,
                              WebSocketMessage<?> message) throws Exception {
        System.err.println(session + "---->" + message + ":"+ message.getPayload().toString());
    }

    // 处理传输时异常
    @Override
    public void handleTransportError(WebSocketSession session,
                                     Throwable exception) throws Exception {

    }

    // 关闭 连接时
    @Override
    public void afterConnectionClosed(WebSocketSession session,
                                      CloseStatus closeStatus) {
//        logger.debug("用户： " + session.getRemoteAddress() + " is leaving, because:" + closeStatus);

    }

    //是否支持分包
    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

}
