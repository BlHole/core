package com.huaxu.core.middleware.elasticjob.webJob;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnExpression("'${spring.elasticjob.serverList}'.length() > 0") //判断是否配置了zookeeper 地址
public class JobRegistryCenterConfig {

//    @Bean(initMethod = "init")
    public ZookeeperRegistryCenter regCenter(
            @Value("${spring.elasticjob.serverList}") final String serverList,
            @Value("${spring.elasticjob.namespace}") final String namespace) {
        return new ZookeeperRegistryCenter(new ZookeeperConfiguration(serverList, namespace));
    }
}