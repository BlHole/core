package com.huaxu.core.middleware.spring.paramBind;

import com.huaxu.core.middleware.spring.paramBind.CustomMethodArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.OrderComparator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
 
import javax.annotation.Resource;
import java.util.List;
 
/**
 * @author jianglinzou
 * @date 2019/4/13 上午2:41
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Resource
    private CustomMethodArgumentResolver customMethodArgumentResolver;
 
    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(customMethodArgumentResolver);
        OrderComparator.sort(argumentResolvers);
    }
}