package com.huaxu.core.middleware.zk;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.util.ArrayList;
import java.util.List;

public class DistributedClient {
 
    private static final String connectString = "localhost:2181";
    private static final int sessionTimeout = 2000;
    private static final String parentNode = "/servers";
    private volatile List<String> serverList;
    private ZooKeeper zk = null;
 
    /**
     * 创建到zk的客户端连接
     * @throws Exception
     */
    public void getConnect() throws Exception{
        zk = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
            public void process(WatchedEvent watchedEvent) {
                //收到事件通知后的回调函数（应该是我们自己的事件处理逻辑）
                try {
                    getServerList();
                } catch (Exception e) {
                }
            }
        });
    }
 
    /**
     * 获取服务器信息列表
     * @throws Exception
     */
    public void getServerList() throws Exception{
        //获取服务器子节点信息，并且对父节点进行监听
        List<String> children = zk.getChildren(parentNode, true);
        List<String> servers = new ArrayList<String>();
        for (String child: children){
            byte[] data = zk.getData(parentNode + "/" + child, false, null);
            servers.add(new String(data));
        }
        serverList = servers;
        System.out.println(serverList);
    }
 
    /**
     * 业务功能
     * @throws Exception
     */
    public void handleBusiness() throws Exception{
        System.out.println("client start working......");
        Thread.sleep(Long.MAX_VALUE);
    }
 
 
    public static void main(String[] args) throws Exception {
 
        //获取zk连接
        DistributedClient client = new DistributedClient();
        client.getConnect();
 
        //获取servers的子节点信息（并监听），从中获取服务器信息列表
        client.getServerList();
 
        //启动业务功能
        client.handleBusiness();
    }
}