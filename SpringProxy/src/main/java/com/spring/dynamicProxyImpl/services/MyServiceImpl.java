package com.spring.dynamicProxyImpl.services;

import com.spring.dynamicProxyImpl.interfaces.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    public void doSomething() {
        System.out.println("Doing something");
    }
}