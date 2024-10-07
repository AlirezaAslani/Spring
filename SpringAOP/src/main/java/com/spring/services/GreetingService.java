package com.spring.services;

import com.spring.aspect.pointcut.Loggable;
import com.spring.aspect.pointcut.LoggableAfter;
import com.spring.aspect.pointcut.LoggableBefore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;

    public GreetingService(){
        super();
    }


    @Loggable
    @LoggableAfter
    @LoggableBefore
    public String getGreeting(String name){
        return greeting + " " + name;
    }
}
