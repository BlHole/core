package com.huaxu.core.middleware.zk.config;

import com.huaxu.core.middleware.zk.SimpleZkClientTest;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: ZkConfig</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/11 10:05</p>
 * <p>创建用户：huaxu</p>
 */
public class ZkConfig {

    private static final Logger logger = LoggerFactory.getLogger(SimpleZkClientTest.class);
    private static final String connectString = "192.168.10.75:2181,192.168.10.75:2182,192.168.10.75:2183";
    private static final int sessionTimeout = 2000;
    public ZooKeeper zkClient = null;

    @Before
    public void init() throws Exception {
        zkClient = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
            public void process(WatchedEvent watchedEvent) {
                //收到事件通知后的回调函数（应该是我们自己的事件处理逻辑）
                System.out.println("事件通知后的回调函数: " + watchedEvent.getType() + "---" + watchedEvent.getPath());
                try {
                    zkClient.getChildren("/", true);
                } catch (Exception e) {
                    logger.error(e.getMessage(), e);
                }
            }
        });
    }
}