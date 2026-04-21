# 📚 Spring Boot Data JPA - Get Student By ID API

Bu proje, **Spring Boot** ve **Spring Data JPA** kullanılarak geliştirilmiş bir REST API örneğidir.  
Bu versiyonda, veritabanından **tek bir öğrenciyi ID bilgisine göre çekme işlemi** gerçekleştirilmiştir.

## 🚀 Proje Açıklaması

Bu uygulamada:

- PostgreSQL veritabanına bağlanılır
- `students` tablosundan **belirli bir ID’ye sahip öğrenci** getirilir
- `@PathVariable` kullanılarak URL üzerinden parametre alınır
- Katmanlı mimari (Controller - Service - Repository) uygulanır
- Service katmanı **interface** olarak tasarlanmıştır

## 🧩 Kullanılan Teknolojiler

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok