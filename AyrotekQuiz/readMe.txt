Bu proje RestFul API projesidir.

Hizmette yeni ürün oluşturulabilir.
Hizmette ürünler değiştirilebilir.
Hizmette ürünler silinebilir.
Hizmetteki tüm ürünleri görülebilir.

Bu projede Spring boot framework kullanılmıştır. 
Monolitik mimarde kodlanmıştır  6 katman bulunmaktadır. 
Model katmanında varlıklar bulunmaktadır. 
Repository katmanında database'e olan iletişim sağlanmakta, sorgular buradan database'e iletilmektedir. 
Business katmanında uygulamanın iş kodları bulunmaktadır. 
Controller katmanında ise rest servisleri kullanarak API'nin dış dünyayla bağlantısı sağlanmaktadır. 
Projede ayrı olarak dto yapı mantığı ile çalışılmıştır.
Request ve response modelleri vardır, dataların akışını daha rahat kontrol etmektedir. API'yi dış dünyaya açıldığından direkt olarak entity classları saklanmış olunur.
Ara katman olarak request ve response kullanılmaktadır. 
Database postgresql'dir.
