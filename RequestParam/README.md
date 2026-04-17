# Spring Boot RequestParam Örneği 🚀

## 📌 Proje Açıklaması

Bu proje, Spring Boot içerisinde `@RequestParam` anotasyonunun kullanımını gösteren basit bir örnektir.  
Amaç, REST API üzerinden gelen query parametrelerini (sorgu parametreleri) alarak veriyi filtrelemeyi öğrenmektir.

Bu proje Spring Boot temellerini öğrenmek ve controller seviyesinde parametre yönetimini anlamak için hazırlanmıştır.

## ✨ Özellikler

- Spring Boot `@RequestParam` kullanımı
- Query parametrelerine göre veri filtreleme
- Basit REST API yapısı
- Katmanlı mimari (Controller - Service - Repository)
- Yeni başlayanlar için anlaşılır ve sade yapı

## 🛠️ Kullanılan Teknolojiler

- Java 17+
- Spring Boot
- Spring Web
- Lombok
- Maven

## 📡 Örnek Endpoint

http://localhost:8080/Employee/GetEmployeeParams?shift=Day Shift

## 📂 Projenin Amacı

Bu projenin amacı:  
@RequestParam kullanımını öğrenmek
Birden fazla query parametresi ile çalışma mantığını anlamak
Gelen isteğe göre dinamik filtreleme yapabilmek

## 👨‍💻 Notlar

// RequestParam url üzerinden gelen parametreleri almak için kullanılan bir anatasyondur.  
// Bir listedeki birden fazla değişkeni alıp onlara göre listeleme yapılabilir.  
// @RequestParam (name = "Salary") String Salary şeklinde kullanılır.  
// Url ise http://localhost:8080/Employee/GetEmployeeParams?Name=Mehmet şeklinde olur  
// Url'de soru işareti varsa muhtemelen request param değişkeni ile eşleşir. RequesParam Name'i ile url'deki bire bir eşleşmelidir.  