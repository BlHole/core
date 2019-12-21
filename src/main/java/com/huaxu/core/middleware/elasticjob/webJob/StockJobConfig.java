package com.huaxu.core.middleware.elasticjob.webJob;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//@Configuration
public class StockJobConfig {

    @Autowired
    private JobRegistryCenterConfig jobRegistryCenterConfig;
    @Autowired
    private ZookeeperRegistryCenter regCenter;

    public StockJobConfig() {
    }

//    @Bean(initMethod = "init")
    public JobScheduler simpleJobScheduler(final StockSimpleJob simpleJob,
                                           @Value("${stockJob.cron}") final String cron,
                                           @Value("${stockJob.shardingTotalCount}") final int shardingTotalCount,
                                           @Value("${stockJob.shardingItemParameters}") final String shardingItemParameters) {
        return new SpringJobScheduler(simpleJob, regCenter, simpleJobConfigBuilder(simpleJob.getClass(), cron, shardingTotalCount, shardingItemParameters));
    }


    private LiteJobConfiguration simpleJobConfigBuilder(final Class<? extends SimpleJob> jobClass,
                                                        final String cron,
                                                        final int shardingTotalCount,
                                                        final String shardingItemParameters) {
        return LiteJobConfiguration
                .newBuilder(
                        new SimpleJobConfiguration(
                                JobCoreConfiguration.newBuilder(
                                        "huaxu-pay-center-job", cron, shardingTotalCount)
                                        .shardingItemParameters(shardingItemParameters).jobParameter("job")
                                        .build()
                                , jobClass.getCanonicalName()
                        )
                )
                .overwrite(true)
                .build();
    }

    /**
     * 动态添加
     *
     * @param jobClass
     * @param cron
     * @param shardingTotalCount
     * @param shardingItemParameters
     */
    public void addSimpleJobScheduler(final Class<? extends SimpleJob> jobClass,
                                      final String cron,
                                      final int shardingTotalCount,
                                      final String shardingItemParameters) {
        JobCoreConfiguration coreConfig = JobCoreConfiguration.newBuilder(jobClass.getName(), cron, shardingTotalCount).shardingItemParameters(shardingItemParameters).build();
        SimpleJobConfiguration simpleJobConfig = new SimpleJobConfiguration(coreConfig, jobClass.getCanonicalName());
        JobScheduler jobScheduler = new JobScheduler(regCenter, LiteJobConfiguration.newBuilder(simpleJobConfig).build());
        jobScheduler.init();
    }
}