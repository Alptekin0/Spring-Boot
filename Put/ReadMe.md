# 🚀 Spring Boot - @PutMapping Kullanımı

Bu projede, **Spring Boot** kullanılarak bir kaydın güncellenmesi işlemi gerçekleştirilmiştir. Güncelleme işlemi için `@PutMapping` anotasyonu kullanılmıştır.

## 📌 Proje Amacı

Belirli bir `id`'ye sahip kaydı güncellemek ve yeni verilerle değiştirmek.

## ⚙️ Kullanılan Teknolojiler

- Java
- Spring Boot
- Spring Web
- RESTful API

## 🔍 @PutMapping Nedir?

`@PutMapping`, RESTful servislerde **mevcut bir kaydı güncellemek** için kullanılan bir anotasyondur. Genellikle `PUT` HTTP metodu ile birlikte çalışır.

## 🧩 Kullanım Senaryosu

Bu örnekte:

- Güncellenecek kaydın `id` bilgisi → `@PathVariable` ile URL üzerinden alınır
- Güncellenecek yeni veriler → `@RequestBody` ile alınır

## 🧪 Örnek Controller Kullanımı

```java
@PutMapping(path = "/updateCar/{id}")
public Car updateCar(@PathVariable(name = "id") int id,
                     @RequestBody CarUpdate newCar){
    return carService.updateCar(id, newCar);
}
```
## 🧠 Notlar  
  PutMapping anatsayonu bir değeri güncellemek için kullanılır.  
  Burdaki örnekte PathVariable ile güncellenecek olan değerin id'si url'den alınır.  
  Güncelleme sonucu değişecek değerler ise RequestBody ile alındı.  
  PutMapping içindeki {id} @PathVariable'ın name değeri ile eşleşmelidir @PathVariable(name = "id")  
  Böylece url'den alınan değişken id'ye atılır.  
  Güncelencek değerler ise @RequestBody ile alınır.  