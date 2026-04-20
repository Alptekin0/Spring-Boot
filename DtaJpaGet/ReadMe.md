# 📚 Spring Boot Data JPA - GET Students API

Bu proje, **Spring Boot** ve **Spring Data JPA** kullanılarak oluşturulmuş basit bir REST API örneğidir.  
Amaç, veritabanında bulunan öğrenci kayıtlarını **GET isteği** ile çekmektir.

## 🚀 Proje Açıklaması

Bu uygulamada:

- PostgreSQL veritabanına bağlanılır
- `students` tablosundaki veriler çekilir
- Katmanlı mimari (Controller - Service - Repository) kullanılır
- Service katmanı **interface** üzerinden yönetilir

## 🧩 Kullanılan Teknolojiler

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok

## 📌 API Endpoint

### Öğrencileri Getir

📥 Response:
```json
[
  {
    "id": 1,
    "name": "Ahmet",
    "surname": "Yılmaz",
    "department": "Computer Engineering",
    "gender": "Male",
    "gpa": "3.50",
    "student_number": 123456
  }
]
```

## 📂 Proje Yapısı
com.alptekin  
├── Controller  
│   └── RestStudentController  
├── Service  
│   ├── IStudentService  
│   └── StudentServiceImpl  
├── Repository  
│   └── StudentRepository  
├── Entity  
│   └── students  
└── DtaJpaGetApplication  

## 👨‍💻 Notlar
Service katmanının interface olarak yazılması, bağımlılığı azaltır ve test edilebilirliği artırır  
Sadce StudentService şeklinde service sınıfı oluştursaydık, service içinde yazdığımız iş mantığı kodlarında  
hata çıkması Controller katmanını da patlatırdı. Fakat IStudentService(interface) StudentServiceImpl(implement sınıfı)  
Şeklinde oluşturulan yapı da Controller interface'e bağlanır ve interface içinde sadece kullancağımız metodlar bulunur.  
Bu nedenle iş mantığı StudentServiceImpl içinde yapılır ve iş mantığı kodlarında çıkan bir hata Controller'ı etkilemez.  
Bu Service katmanında interface kulanmamızın sebeblerinden sadece biridir.  
JpaRepository sayesinde ekstra SQL yazmadan veri çekme işlemi yapılır  
@GetMapping ile veri çekme işlemi gerçekleştirilir  