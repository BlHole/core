package com.huaxu.core.basic.aop.retry;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: RetryController</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/13 11:41</p>
 * <p>创建用户：huaxu</p>
 */
@RestController
public class RetryController {

    private static final Logger log = LoggerFactory.getLogger(RetryController.class);

    @Autowired
    private RetryAopService helloService;

    @RequestMapping("/aop/retry/hello")
    public void helloAOP(){
        String hello = helloService.hello();
        log.info("hello:{}", hello);
    }
}