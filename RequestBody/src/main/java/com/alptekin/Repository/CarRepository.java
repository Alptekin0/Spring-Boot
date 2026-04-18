package com.alptekin.Repository;


import com.alptekin.Entity.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CarRepository {

    ArrayList<Car> carList = new ArrayList<>();

    public Car addCar(Car newCar) {
        carList.add(newCar);
        return newCar;
    }



}
