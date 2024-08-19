package com.spring.dynamicProxyImpl.interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Before method " + invocation.getMethod().getName());
        Object result = invocation.proceed();
        System.out.println("After method " + invocation.getMethod().getName());
        return result;
    }
}