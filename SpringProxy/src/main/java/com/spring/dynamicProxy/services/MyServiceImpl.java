package com.spring.dynamicProxy.services;

import com.spring.dynamicProxy.interfaces.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    public void doSomething() {
        System.out.println("Doing something");
    }
}