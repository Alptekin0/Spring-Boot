package com.alptekin.Service;


import com.alptekin.Entity.Car;
import com.alptekin.Repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {


    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car addCar (Car newCar) {
        return carRepository.addCar(newCar);
    }


}
