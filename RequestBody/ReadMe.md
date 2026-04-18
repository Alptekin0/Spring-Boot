# 🚀 Spring Boot - @RequestBody Kullanımı

Bu projede, **Spring Boot** içerisinde `@RequestBody` anotasyonunun nasıl kullanıldığını göstermek amacıyla basit bir örnek geliştirilmiştir. API üzerinden gönderilen JSON verisinin backend tarafında nasıl karşılandığı ve işlendiği uygulamalı olarak gösterilmektedir.

## 📌 Proje Amacı

Bu çalışmanın amacı:

- `@RequestBody` anotasyonunun mantığını anlamak
- HTTP isteklerinde gelen JSON verisini Java nesnesine dönüştürmek
- Basit bir REST API oluşturmak

## ⚙️ Kullanılan Teknolojiler

- Java
- Spring Boot
- Spring Web
- RESTful API
- JSON

## 🧠 @RequestBody Nedir?

`@RequestBody`, istemciden (client) gelen HTTP request body'sindeki JSON verisini otomatik olarak Java nesnesine dönüştürmek için kullanılır.

Örneğin, client tarafından gönderilen JSON:

```json
{
  "licensePlate": "BMW",
  "model": "X5",
  "productionYear" : "18/12/2015"
}
```
Spring Boot tarafından otomatik olarak bir Car nesnesine çevrilir.  


## 👨‍💻 Notlar

PostMapping istemciden gelen Post isteğini yakalamak için kullanılan anatasyondur.  
@PostMappin("/AddCar") ---> Bu URL’e POST isteği gelirse alttaki metodu çalıştır  
@Requestbody gelen post isteği içindeki body'i kontrol eder ve javaya çevirir.  
Veri oluşturma ve günceleme için @RequestBody kullanır.  
yani gönderilen isteğin body kısmı varsa(post, put) RequestBody kullanılır.  