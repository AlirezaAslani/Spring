package com.spring;

import com.spring.services.GreetingService;
import com.spring.services.OutputService;
import com.spring.services.TimeService;

public class ApplicationWithoutIOC {

    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new GreetingService("Hello");
        TimeService timeService = new TimeService(true);
        OutputService outputService = new OutputService(greetingService, timeService, "Alireza");

        for (int i=0;i<5;i++){
            outputService.generateOutput();
            Thread.sleep(5000);
        }
    }
}
