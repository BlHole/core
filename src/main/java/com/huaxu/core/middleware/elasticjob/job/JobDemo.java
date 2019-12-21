package com.huaxu.core.middleware.elasticjob.job;

import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.reg.base.CoordinatorRegistryCenter;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;

public class JobDemo {
    public static void main(String[] args) {
        //作业调度器初始化作业
        new JobScheduler(createRegistryCenter(), createJobConfiguration()).init();
    }

    //注册中心
    private static CoordinatorRegistryCenter createRegistryCenter() {
        //ZookeeperConfiguration构造方法两个参数，serverLists(连接Zookeeper服务器的列表，包括IP地址和端口号，，多个地址用逗号分隔)和namespace(命名空间)
        CoordinatorRegistryCenter registryCenter = new ZookeeperRegistryCenter(new ZookeeperConfiguration("192.168.10.72:2181", "pay-job-putGet"));
        registryCenter.init();
        return registryCenter;
    }

    //配置SimpleJob
    private static LiteJobConfiguration createJobConfiguration() {
        //创建简单作业配置构建器，三个参数为：jobName(作业名称)，cron（作业启动时间的cron表达式），shardingTotalCount(作业分片总数)
        JobCoreConfiguration simpleCoreConfig = JobCoreConfiguration.newBuilder("mySimpleJob", "0/30 * * * * ?", 1).build();
        //简单作业配置，第二个参数为jobClass
        SimpleJobConfiguration simpleJobConfig = new SimpleJobConfiguration(simpleCoreConfig, MySimpleJob.class.getCanonicalName());
        //创建Lite作业配置构建器，参数jobConfig（作业配置）
        LiteJobConfiguration simpleJobRootConfig = LiteJobConfiguration.newBuilder(simpleJobConfig).build();
        return simpleJobRootConfig;
    }

    //配置DataflowJob
    private static void setUpDataflowJob(final CoordinatorRegistryCenter registryCenter) {
        JobCoreConfiguration coreConfiguration = JobCoreConfiguration.newBuilder("myDataflowJob", "0/10 * * * * ?", 2).build();
        //数据流作业配置，第三个参数为streamingProcess（是否为流式处理）
        DataflowJobConfiguration dataflowJobConfiguration = new DataflowJobConfiguration(coreConfiguration, MyDataflowJob.class.getCanonicalName(), true);
        new JobScheduler(registryCenter, LiteJobConfiguration.newBuilder(dataflowJobConfiguration).build()).init();

    }
}