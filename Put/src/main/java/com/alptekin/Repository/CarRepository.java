package com.alptekin.Repository;

import com.alptekin.Entity.Car;
import com.alptekin.Entity.CarUpdate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CarRepository {

    ArrayList<Car> carList = new ArrayList<>();

    public CarRepository(){
        carList.add(new Car(1, "Audi", "White"));
        carList.add(new Car(2, "Mercedes", "White"));
        carList.add(new Car(3, "Mazda", "Blue"));
        carList.add(new Car(4, "Porsche", "White"));
        carList.add(new Car(5, "Aston Martin", "Black"));
    }

    public Car updateCar(int id, CarUpdate newCar) {

        for (Car cars : carList) {
            if (cars.getId() == id) {
                cars.setModel(newCar.getModel());
                cars.setColor(newCar.getColor());
                return cars;
            }
        }
        return null;
    }


}
