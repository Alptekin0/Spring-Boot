# Spring Boot - Delete İşlemi Örneği

Bu proje, Spring Boot ve REST API konseptlerini öğrenme ve pratik yapma amacıyla geliştirilmiş **basit bir eğitim uygulamasıdır**. 

Projenin temel amacı, Spring Data JPA kullanılarak bir veritabanından verilerin nasıl silineceğini (HTTP DELETE metodu) kavramaktır.

## 📌 Proje Hakkında
* Tamamen **öğrenme amaçlı** yapılmıştır.
* Spring Boot yapısında Controller, Service ve Repository katmanlarının nasıl haberleştiğini gösterir.
* `Student` (Öğrenci) varlığı (entity) üzerinden silme işlemi senaryolaştırılmıştır.

## 🛠️ Kullanılan Teknolojiler
* Java
* Spring Boot
* Spring Web (RESTful API)
* Spring Data JPA

## 📂 Proje Mimarisi
* **Controller (`RestStudentController`)**: Kullanıcıdan (veya Postman gibi bir istemciden) gelen HTTP `DELETE` isteklerini karşılar.
* **Service (`StudentService`)**: Silme işlemi öncesinde gerekli iş kurallarının yazıldığı katmandır.
* **Repository (`StudentRepository`)**: Veritabanına bağlanıp silme sorgusunu yürüten arayüzdür.
* **Entity (`Student`)**: Veritabanındaki öğrenci tablosunu temsil eden model sınıfıdır.
