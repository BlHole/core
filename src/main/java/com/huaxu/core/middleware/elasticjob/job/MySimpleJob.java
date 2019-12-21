package com.huaxu.core.middleware.elasticjob.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MySimpleJob implements SimpleJob {
    /**
     * 执行作业.
     */
    @Override
    public void execute(ShardingContext context) {
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                + " 分片项 : "+context.getShardingItem()
                + " 总片数 : " + context.getShardingTotalCount());

    }
}