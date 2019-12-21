package com.huaxu.core.middleware.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @HystrixCommand(fallbackMethod = "onError",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"),
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
                    // 至少有3个请求才进行熔断错误比率计算
                    /**
                     * 设置在一个滚动窗口中，打开断路器的最少请求数。
                     比如：如果值是20，在一个窗口内（比如10秒），收到19个请求，即使这19个请求都失败了，断路器也不会打开。
                     */
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2"),
                    // 熔断器工作时间，超过这个时间，先放一个请求进去，成功的话就关闭熔断，失败就再等一段时间
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000")},
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "5"),
//                    @HystrixProperty(name = "maximumSize", value = "5"),
                    @HystrixProperty(name = "maxQueueSize", value = "10")
            })
    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, " + name;
    }

    @HystrixCommand
    @RequestMapping("/sayHi")
    public String sayHi(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new RuntimeException("name不能为空");
        }
        return "Good morning, " + name;
    }

    /**
     * 如果fallback方法的参数和原方法参数个数不一致，则会出现FallbackDefinitionException: fallback method wasn't found
     */
    public String onError(String name) {
        return "Error!!!" + name;
    }
}