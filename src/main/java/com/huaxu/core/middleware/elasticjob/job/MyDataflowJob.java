package com.huaxu.core.middleware.elasticjob.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

import java.util.Arrays;
import java.util.List;

public class MyDataflowJob implements DataflowJob {
    /**
     * 获取待处理数据.
     * @param shardingContext 分片上下文
     * @return 待处理的数据集合
     */
    @Override
    public List fetchData(ShardingContext shardingContext) {
        return Arrays.asList("1","2","3");
    }
    /**
     * 处理数据.
     * @param shardingContext 分片上下文
     * @param data 待处理数据集合
     */
    @Override
    public void processData(ShardingContext shardingContext, List data) {
        System.out.println("处理数据:" + data.toString());
    }
}