package com.huaxu.core.diy.webSocket.server;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;
import com.huaxu.core.diy.webSocket.model.BarrageMessage;
import com.huaxu.core.middleware.zk.SimpleZkClientTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@ServerEndpoint("/websocket/{sid}")
@Component
public class WebSocketServer {

    private static final Logger log = LoggerFactory.getLogger(SimpleZkClientTest.class);

    private static AtomicInteger onlineCount = new AtomicInteger(0);
    private static CopyOnWriteArraySet<WebSocketServer> webSocketSet = new CopyOnWriteArraySet<>();

    private Session session;
    private String sid = "";

    /**
     * 连接建立成功调用的方法*/
    @OnOpen
    public void onOpen(Session session, @PathParam("sid") String sid) {
        this.session = session;
        this.sid = sid;
        webSocketSet.add(this);

        addOnlineCount();
        log.info("有新窗口开始监听:" + sid + ",当前在线人数为" + getOnlineCount());
        try {
            sendMessage(new BarrageMessage("弹幕通道开启！"));
        } catch (IOException e) {
            log.error("websocket IO异常");
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);
        subOnlineCount();
        log.info("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("收到来自窗口" + sid + "的信息:"+message);
        //群发消息
        for (WebSocketServer item : webSocketSet) {
            try {
                item.sendMessage(new BarrageMessage(message));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发生错误");
        webSocketSet.remove(session);
        error.printStackTrace();
    }

    /**
     * 实现服务器主动推送
     */
    public void sendMessage(BarrageMessage message) throws IOException {
        this.session.getBasicRemote().sendText(new Gson().toJson(message));
    }


    /**
     * 群发自定义消息
     * */
    public static void sendInfo(BarrageMessage message, String sid) {
        log.info("推送消息到窗口" + sid + "，推送内容:"+message);
        for (WebSocketServer item : webSocketSet) {
            try {
                if (sid == null) {
                    item.sendMessage(message);

                } else if (item.sid.equals(sid)) {
                    item.sendMessage(message);
                }
            } catch (IOException e) {
                continue;
            }
        }
    }

    public static int getOnlineCount() {
        return WebSocketServer.onlineCount.get();
    }

    public static void addOnlineCount() {
        WebSocketServer.onlineCount.incrementAndGet();
    }

    public static void subOnlineCount() {
        WebSocketServer.onlineCount.decrementAndGet();
    }
}

