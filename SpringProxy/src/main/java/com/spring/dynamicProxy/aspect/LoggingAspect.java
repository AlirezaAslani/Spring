package com.spring.dynamicProxy.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.spring.dynamicProxy.interfaces.MyService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Executing LoggingAspect logBefore");
        LOGGER.info("Executing {}", joinPoint.getSignature().getName());
    }
}