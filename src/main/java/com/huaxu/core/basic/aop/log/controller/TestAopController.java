package com.huaxu.core.basic.aop.log.controller;

import com.google.gson.Gson;
import com.huaxu.core.basic.aop.log.AopBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: TestAopController</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/05 17:14</p>
 * <p>创建用户：huaxu</p>
 */
@RestController
public class TestAopController {

    @RequestMapping("/aop")
    public Object aop(){
        return new Gson().toJson(new AopBean("tianshouye", "huaxu"));
    }

    @RequestMapping("/aop2")
    public Object aop2(){
        return new Gson().toJson(new AopBean("tianshouye2", "huaxu2"));
    }
}