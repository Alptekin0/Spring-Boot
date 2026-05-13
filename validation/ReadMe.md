# 🌱 Spring Boot Validation Öğrenme Projesi

Bu proje, **Spring Boot** ortamında veri doğrulama (validation) işlemlerinin nasıl yapıldığını öğrenmek ve pratik etmek amacıyla geliştirilmiş sade bir uygulamadır.

## 🎯 Projenin Amacı
Bir REST API'ye gelen isteklerin (request) veritabanına kaydedilmeden önce belirli kurallara göre nasıl kontrol edileceğini (Jakarta Validation) anlamak hedeflenmiştir. Projede, "Öğrenci (Student) Ekleme" senaryosu üzerinden temel doğrulama kuralları test edilmiştir.

## 🛠️ Kullanılan Teknolojiler
* **Java 17 & Spring Boot**
* **Spring Boot Validation:** `@Valid`, `@NotNull`, `@Email`, `@Pattern`, `@Length`, `@Max` gibi anotasyonların pratik kullanımı.
* **PostgreSQL & Spring Data JPA:** Veritabanı modellemesi ve kayıt işlemleri.
* **MapStruct:** Entity ve DTO (Data Transfer Object) nesneleri arasındaki dönüşümleri güvenli ve temiz bir şekilde yönetmek için.
* **Lombok:** Boilerplate (tekrar eden) kodları azaltmak için.

## 🚀 Öne Çıkan Özellikler (Neler Denendi?)
* **Katmanlı Mimari:** Controller, Service ve Repository katmanları ayrılmıştır.
* **DTO Kullanımı:** İstemciden gelen veriler `DtoStudentRequest` ile alınmış, kurallardan geçtikten sonra şifre gibi hassas veriler gizlenerek `DtoStudentResponse` ile geriye dönülmüştür.
* **Gelişmiş Doğrulama:** * Özel RegEx formatı kontrolü (Örn: Numaranın sadece 11 haneli rakamlardan oluşması).
    * Min/Max uzunluk ve değer sınırlandırmaları (Örn: Şifre uzunluğu, maksimum not ortalaması).
---
*Not: Bu proje tamamen kişisel öğrenme ve gelişim amacıyla hazırlanmıştır.*