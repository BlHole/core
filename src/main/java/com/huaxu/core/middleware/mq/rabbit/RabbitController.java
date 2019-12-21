package com.huaxu.core.middleware.mq.rabbit;

import com.huaxu.core.middleware.mq.rabbit.normal.NormalMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: TestController</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/08 14:37</p>
 * <p>创建用户：huaxu</p>
 */
@RestController
public class RabbitController {

    @Autowired
    private NormalMQProducer product;

    @RequestMapping("/send")
    public String helloTest(){
        product.send();
        return "success";
    }
}