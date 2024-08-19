package com.proxy;


import com.proxy.entities.Car;
import com.proxy.interfaces.CarDao;
import com.proxy.proxies.MyProxyHandler;
import com.proxy.servies.CarDaoImpl;

import java.lang.reflect.Proxy;

public class Application {


    public static void main(String[] args) throws Exception {

        CarDao carDao = new CarDaoImpl();
        MyProxyHandler handler = new MyProxyHandler(carDao);

        Car car = new Car();
        car.setColor("red");
        car.setModel("AMG");

        CarDao proxy = (CarDao) Proxy.newProxyInstance(carDao.getClass().getClassLoader(),
                new Class[] {CarDao.class},
                handler);

        proxy.createCar(car);



    }
}
