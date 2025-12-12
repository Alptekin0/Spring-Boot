# Spring Boot Katmanlı Mimari ve API Öğrenme Projesi 🚀

Bu proje, **API isteğinin nasıl çalıştığını anlamak** ve **katmanlı mimariyi öğrenmek** amacıyla geliştirilmiş basit bir Spring Boot uygulamasıdır.  
Proje; Controller, Service, Repository, Data ve Model katmanlarının birbiriyle nasıl iletişim kurduğunu pratik bir şekilde göstermeyi hedefler.

## 📌 Proje Açıklaması
Bu demo uygulama, basit bir REST API üzerinden kullanıcı listesini döndürmektedir.  
Amaç, veri akışının katmanlar arasında nasıl ilerlediğini ve Spring Boot’un yapı taşlarını öğrenmektir.

Katmanlar şu şekilde düzenlenmiştir:

- **Controller Katmanı** → API isteklerini karşılar  
- **Service Katmanı** → İş mantığını barındırır  
- **Repository Katmanı** → Veri erişim işlemlerini yürütür  
- **Data Katmanı** → Test amacıyla in-memory veri sağlar  
- **Model Katmanı** → Veri yapısını temsil eder  

## 📁 Özellikler
- Temel Spring Boot proje yapısı  
- Constructor Injection kullanımı  
- In-memory kullanıcı verisi  
- `/getUsers` uç noktası(end-point) ile kullanıcı listesi döndürme  
- Temiz ve anlaşılır katmanlı mimari

## 📦 Kullanılan Teknolojiler
- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Maven**

##  🚀 Projenin Çalıştırılması  
1-) Projeyi klonlayın.  
2-) IntelliJ, Eclipse veya VS Code ile açın.  
3-) JDK 17 veya üzerinin kurulu olduğundan emin olun.  
4-) DemoApplication dosyasını çalıştırın.  
5-) Aşağıdaki URL’ye tarayıcı veya Postman üzerinden istek gönderin: GET http://localhost:8080/getUsers  
