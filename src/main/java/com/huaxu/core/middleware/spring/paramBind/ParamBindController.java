package com.huaxu.core.middleware.spring.paramBind;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: TestController</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/30 17:49</p>
 * <p>创建用户：huaxu</p>
 */
@RestController
public class ParamBindController {

    @RequestMapping(value="/index", produces="application/json;charset=UTF-8;application/x-www-form-urlencoded;")
    public Object index(@CustomParamBinding Account map) {
        return String.valueOf(map);
    }
}