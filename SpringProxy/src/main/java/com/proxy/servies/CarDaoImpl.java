package com.proxy.servies;

import com.proxy.entities.Car;
import com.proxy.interfaces.CarDao;

public class CarDaoImpl implements CarDao {

    @Override
    public void createCar(Car car) {
        System.out.println("Car model is: " +car.getModel()+" Car color is: "+ car.getColor());
    }
}
