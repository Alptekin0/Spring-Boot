package com.alptekin.Controller;


import com.alptekin.Entity.Car;
import com.alptekin.Entity.CarUpdate;
import com.alptekin.Service.CarService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class RestCarController {

    private CarService carService;

    public RestCarController(CarService carService) {
        this.carService = carService;
    }

    @PutMapping(path = "/updateCar/{id}")
    public Car updateCar(@PathVariable(name = "id") int id,
                         @RequestBody CarUpdate newCar){
        return carService.updateCar(id, newCar);
    }

    // PutMapping anatsayonu bir değeri güncellemek için kullanılır.
    // Burdaki örnekte PathVariable ile güncellenecek olan değerin id'si url'den alınır
    // Güncelleme sonucu değişecek değerler ise RequestBody ile alındı.
    // PutMapping içindeki {id} @PathVariable'ın name değeri ile eşleşmelidir @PathVariable(name = "id")
    //Böylece url'den alınan değişken id'ye atılır.
    // Güncelencek değerler ise @RequestBody ile alınır.

}