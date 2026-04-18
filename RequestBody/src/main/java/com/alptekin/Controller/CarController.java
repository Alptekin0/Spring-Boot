package com.alptekin.Controller;

import com.alptekin.Entity.Car;
import com.alptekin.Service.CarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
       this.carService = carService;
    }

    @PostMapping("/addCar")
    public Car addCar (@RequestBody Car newCar){
        return carService.addCar(newCar);
    }

    // PostMapping istemciden gelen Post isteğini yakalamak için kullanılan anatasyondur.
    // @PostMappin("/AddCar") ---> Bu URL’e POST isteği gelirse alttaki metodu çalıştır
    // @Requestbody gelen post isteği içindeki body'i kontrol eder ve javaya çevirir.
    // Veri oluşturma ve günceleme için @RequestBody kullanır.
    // yani gönderilen isteğin body kısmı varsa(post, put) RequestBody kullanılır.

}
