# 🎓 Spring Boot Data JPA - Student Management API

Bu proje, **Spring Boot** ve **Spring Data JPA** kullanılarak geliştirilmiş basit bir öğrenci kayıt (CRUD başlangıcı) uygulamasıdır. Proje kapsamında, PostgreSQL veritabanına öğrenci ekleme işlemi gerçekleştirilmektedir.

## 🚀 Proje Amacı

Bu projenin amacı:
- Spring Boot ile RESTful API geliştirmeyi öğrenmek
- Spring Data JPA ile veritabanı işlemlerini yönetmek
- Katmanlı mimariyi (Controller - Service - Repository) uygulamak

## 🛠️ Kullanılan Teknolojiler

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Lombok

## 📌 API Endpoint

### ➕ Öğrenci Ekleme

**Endpoint:**

**Request Body (JSON):**
```json
{
  "name": "Ahmet",
  "surname": "Yılmaz",
  "studentNumber": 123456,
  "department": "Computer Engineering",
  "gpa": "3.50",
  "gender": "Male"
}
```
