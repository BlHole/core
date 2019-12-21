package com.huaxu.core.middleware.spring.transactional.config;
 
import org.springframework.boot.context.properties.ConfigurationProperties;
 
import lombok.Data;

@Data
@ConfigurationProperties(prefix = "mysql.datasource.db2")// 注意这个前缀要和application.properties文件的前缀一样
public class DBConfig2 {
 
	private String url;
	// 比如这个url在properties中是这样子的mysql.datasource.test1.username = root
	private String username;
	private String password;
	private int minPoolSize;
	private int maxPoolSize;
	private int maxLifetime;
	private int borrowConnectionTimeout;
	private int loginTimeout;
	private int maintenanceInterval;
	private int maxIdleTime;
	private String testQuery;
}