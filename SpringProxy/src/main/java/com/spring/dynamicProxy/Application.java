package com.spring.dynamicProxy;


import com.proxy.entities.Car;
import com.proxy.interfaces.CarDao;
import com.proxy.proxies.MyProxyHandler;
import com.proxy.servies.CarDaoImpl;
import com.spring.dynamicProxy.interfaces.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Proxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

        public static void main(String[] args) {

            ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
            MyService service = applicationContext.getBean(MyService.class);
            service.doSomething();



        }

}
