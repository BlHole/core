package com.huaxu.core.basic.aop.log.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: HttpRequestAspect</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/05 17:01</p>
 * <p>创建用户：huaxu</p>
 */
@Aspect
@Component
public class HttpRequestAspect {

    private static final Logger log = LoggerFactory.getLogger(HttpRequestAspect.class);

    private static long startTime;
    private static long endTime;
    private static Map<String, String> record;
    private static String REQUEST_URI = "requestURI";
    private static String REMOTE_ADDR = "remoteAddr";
    private static String REQUEST_METHOD = "requestMethod";
    private static String DECLARING_TYPE_NAME = "declaringTypeName";
    private static String METHOD_NAME = "methodName";
    private static String SPEED = "speed";
    private static String RESULT = "return";



    @Pointcut("execution(public * com.huaxu.core.basic.aop.log.controller..*(..))")
    public void execPoint() {}

    @Before("execPoint()")
    public void before(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
        parseSysParamRecord(joinPoint);
    }

    private void parseSysParamRecord(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        record = new ConcurrentHashMap<>(16);
        record.put(REQUEST_URI, request.getRequestURI());
        record.put(REMOTE_ADDR, request.getRemoteAddr());
        record.put(REQUEST_METHOD, request.getMethod());
        record.put(DECLARING_TYPE_NAME, joinPoint.getSignature().getDeclaringTypeName());
        record.put(METHOD_NAME, joinPoint.getSignature().getName());
    }

    @After("execPoint()")
    public void after() {
        endTime = System.currentTimeMillis();
    }

    @AfterReturning(pointcut = "execPoint()", returning = "object")
    public void getAfterReturn(Object object) {
        record.put(SPEED, String.valueOf(endTime - startTime)+"ms");
        record.put(RESULT, String.valueOf(object));
        log.info("调用日志：{}", record.toString());
    }
}