# Spring Boot Global Exception Handling & Validation Study 🚀

Bu proje, bir **Spring Boot** uygulamasında merkezi hata yönetimi (Global Exception Handling), bean validation (doğrulama) ve DTO (Data Transfer Object) desenlerinin profesyonel standartlarda nasıl uygulanacağını öğrenmek amacıyla geliştirilmiştir.

## 📝 Proje Amacı
Uygulama içerisinde oluşabilecek çalışma zamanı hatalarını (Runtime Exceptions) ve veri doğrulama hatalarını yakalayıp, son kullanıcıya veya istemciye (client) standart, anlaşılır ve yapılandırılmış bir JSON formatında geri bildirim dönmektir.

## ✨ Temel Özellikler
* **Merkezi Hata Yönetimi:** `@RestControllerAdvice` ve `@ExceptionHandler` kullanılarak uygulamanın herhangi bir katmanında fırlatılan hataların tek bir merkezden yakalanması.
* **Gelişmiş Veri Validasyonu:** `jakarta.validation` anotasyonları (`@NotNull`, `@Size` vb.) ile kullanıcı girdilerinin kontrol edilmesi.
* **Özel İstisna (Custom Exception):** Uygulamaya özgü `ResourceNotFoundException` gibi hata sınıflarının oluşturulması.
* **Nesne Dönüşümü (Mapping):** **MapStruct** kütüphanesi kullanılarak Entity ve DTO sınıfları arasında performanslı ve temiz dönüşüm yapılması.
* **Lombok Entegrasyonu:** Boilerplate kodları (getter, setter, constructor) azaltmak için Lombok kullanımı.

## 🛠️ Kullanılan Teknolojiler
* **Java 17**
* **Spring Boot 3.5.14**
* **Spring Data JPA** (Veri erişimi için)
* **PostgreSQL** (Veritabanı sürücüsü)
* **MapStruct 1.6.3** (Mapping için)
* **Lombok**
* **Jakarta Validation**

## 📂 Proje Yapısı
```text
com.alptekin
├── Controller   -> RestUserController: API uç noktalarını yönetir.
├── Service      -> IUserService & UserServiceImpl: İş mantığını yürütür.
├── Repository   -> UserRepository: Veritabanı işlemlerini gerçekleştirir.
├── Entity       -> User: Veritabanındaki 'users' tablosunu temsil eder.
├── Dto          -> DtoUserRequest & DtoUserResponse: Veri taşıma nesneleri.
├── Mapper       -> UserMapper: Entity/DTO dönüşüm arayüzü.
└── Handler      -> GlobalExceptionHandler: Hataları yakalayan merkezi sınıf.