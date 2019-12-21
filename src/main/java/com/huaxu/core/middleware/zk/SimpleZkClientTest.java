package com.huaxu.core.middleware.zk;

import com.huaxu.core.middleware.zk.config.ZkConfig;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Test;

import java.util.List;

public class SimpleZkClientTest extends ZkConfig {


    //创建数据节点到zk中
    @Test
    public  void testCreate() throws Exception{
        //参数1，要创建的节点的路径 参数2：节点数据 参数3：节点的权限 参数4：节点的类型
        String node = zkClient.create("/idea", "hellozk".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        //上传的数据可以是任何类型，但都要转成byte[]
        System.out.println(node);
    }
 
    //判断znode是否存在
    @Test
    public void testExist() throws Exception{
        Stat stat = zkClient.exists("/idea", false);
        System.out.println(stat == null ? "not exist": "exist");
    }
 
    //获取子节点
    @Test
    public void getChildren() throws Exception{
        List<String> children = zkClient.getChildren("/", true);
        for (String child: children){
            System.out.println(child);
        }
        Thread.sleep(Long.MAX_VALUE);//真正运行时可以注释
    }
 
    //获取znode的数据
    @Test
    public void getData() throws Exception{
        byte[] data = zkClient.getData("/idea",false, null);
        System.out.println(new String(data));
    }
 
    //删除znode的数据
    @Test
    public void deleteZnode() throws Exception{
        //参数2：指定要删除的版本，-1表示删除所有版本
        zkClient.delete("/huaxu", -1);
    }
 
    //设置znode
    @Test
    public void setData() throws Exception{
        zkClient.setData("/idea","哈哈哈哈哈哈哈哈哈我呢啊 u 呃百威".getBytes(), -1);
        byte[] data = zkClient.getData("/idea", false, null);
        System.out.println(new String(data));
    }
}
