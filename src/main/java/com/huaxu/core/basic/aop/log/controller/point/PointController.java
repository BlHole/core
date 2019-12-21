package com.huaxu.core.basic.aop.log.controller.point;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: PointController</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/05 17:44</p>
 * <p>创建用户：huaxu</p>
 */
@RestController
@RequestMapping("/point")
public class PointController {

    @RequestMapping("/index")
    public Object index(){
        return new String("aaaa");
    }
}