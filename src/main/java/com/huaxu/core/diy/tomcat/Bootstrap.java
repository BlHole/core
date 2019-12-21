package com.huaxu.core.diy.tomcat;

import com.huaxu.core.diy.tomcat.core.Tomcat;
import com.huaxu.core.diy.tomcat.socket.SocketProcess;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/04 11:21
 */
public class Bootstrap {

    /**
     * 设置端口号
     */
    private static final int PORT = 8080;
    /**
     * 控制服务器启动关闭
     */
    public boolean tomcatStarBool = true;


    public static void main(String[] args) {
        new Bootstrap().start();
    }


    private void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Tomcat 服务已启动，地址：localhost ,端口：" + PORT);

            Tomcat.init();
            //持续监听
            do {
                Socket socket = serverSocket.accept();
                //处理任务
                Thread thread = new SocketProcess(socket);
                thread.start();
            } while (tomcatStarBool);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}