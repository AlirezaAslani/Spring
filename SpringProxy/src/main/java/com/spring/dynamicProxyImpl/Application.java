package com.spring.dynamicProxyImpl;



import com.spring.dynamicProxyImpl.interceptors.MyInterceptor;
import com.spring.dynamicProxyImpl.interfaces.MyService;
import com.spring.dynamicProxyImpl.services.MyServiceImpl;
import org.springframework.aop.framework.ProxyFactory;


public class Application {

        public static void main(String[] args) {

            MyService target =  new MyServiceImpl();
            MyInterceptor interceptor = new MyInterceptor();
            ProxyFactory factory = new ProxyFactory(target);
            factory.addAdvice(interceptor);
            MyService proxy = (MyService) factory.getProxy();
            proxy.doSomething();

        }

}
