# Spring Boot DTO

Bu proje, Spring Boot kullanarak katmanlı mimari (Layered Architecture) yapısını ve **DTO (Data Transfer Object)** desenini öğrenmek amacıyla geliştirilmiş başlangıç seviyesi bir çalışmadır.

## 🎯 Projenin Amacı
Veritabanı varlıklarını (Entity) doğrudan dış dünyaya açmak yerine, DTO'lar aracılığıyla sadece gerekli verilerin transfer edilmesini ve katmanlar arasındaki veri akışını yönetmeyi deneyimlemek.

## 🛠 Kullanılan Teknolojiler
* **Java  
* **Spring Boot  
* **Spring Data JPA** (Veritabanı işlemleri için)
* **PostgreSQL** (Veri saklama)
* **Lombok**   
* **Maven** (Bağımlılık yönetimi)

## 🏗 Proje Mimarisi
Proje dört temel katmandan oluşmaktadır:
1. **Controller:** API uç noktalarını (endpoints) tanımlar.
2. **Service:** İş mantığının (Business Logic) yürütüldüğü ve DTO dönüşümlerinin yapıldığı katman.
3. **Repository:** Veritabanı sorgularını yöneten arayüz.
4. **Entity & DTO:** Veritabanı modelleri ve veri taşıma nesneleri.

## 🚀 API Endpoints
| Metot | Uç Nokta | Açıklama |
|---|---|---|
| POST | `/user/addUser` | Yeni bir kullanıcı kaydeder (Request DTO kullanır). |
| GET | `/user/getAllUsers` | Tüm kullanıcıları listeler (Response DTO listesi döner). |
