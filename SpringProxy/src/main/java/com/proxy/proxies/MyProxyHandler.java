package com.proxy.proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxyHandler implements InvocationHandler {

    private Object target;

    public MyProxyHandler(Object target){
        this.target = target;
    }

    public void beforeMethod(){
        System.out.println("Before Method");
    }

    public void afterMethod(){
        System.out.println("After Method");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        method.invoke(target,args);
        afterMethod();
        return null;
    }
}
