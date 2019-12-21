package com.huaxu.core.junit;

import com.huaxu.core.CoreApplication;
import com.huaxu.core.middleware.spring.transactional.config.DBConfig1;
import com.huaxu.core.middleware.spring.transactional.config.DBConfig2;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: com.huaxu.core.junit.BaseTest</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/09/27 14:08</p>
 * <p>创建用户：huaxu</p>
 */
@RunWith(SpringRunner.class)
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
@SpringBootTest(classes={CoreApplication.class})
public class BaseTest {

}