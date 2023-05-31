# Compose Crypto

Bu, Jetpack Compose kütüphanesini kullanarak geliştirilen bir uygulamadır. Uygulama, yeni nesil uygulamalarda UI geliştirmek için Compose kütüphanesini baştan sona kullanır. Veriler gerçek bir API yerine GitHub üzerindeki statik bir dosyadan alınmaktadır.

## Kullanılan Teknolojiler

- Retrofit & Coroutine: HTTP isteklerini yapmak ve verileri almak için kullanılan bir kütüphane ve asenkron işlemleri yönetmek için Coroutine kullanılır.
- MVVM (Model-View-ViewModel): Uygulama mimarisi olarak MVVM kullanılır. Bu mimaride veri kaynağı (Model), kullanıcı arayüzü (View) ve iş mantığı (ViewModel) ayrı ayrı ele alınır.
- Jetpack Compose: Android'in yeni UI toolkit'i olan Jetpack Compose kullanılarak uygulama UI'si oluşturulmuştur.

## Kurulum

1. Bu depoyu yerel makinenize klonlayın.
2. Android Studio'yu açın ve projeyi içe aktarın.
3. Gerekli bağımlılıkları indirmek için Gradle Sync'i çalıştırın.

## Kullanım

1. Uygulamayı çalıştırın.
2. Uygulama içinde çeşitli kripto para birimlerinin fiyatlarını görüntüleyin.
3. Uygulama içindeki farklı ekranlara gezinin ve verilerin doğru şekilde görüntülendiğini doğrulayın.

## Örnek Kullanım Kodu

Uygulama içinde Retrofit ile GitHub üzerindeki statik dosyadan veriler alınır. Örnek kullanım kodu aşağıdaki gibi olabilir:

```kotlin
// Retrofit servisini oluşturun
val retrofit = Retrofit.Builder()
    .baseUrl("https://raw.githubusercontent.com/username/repo/main/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val service = retrofit.create(ApiService::class.java)

// Verileri almak için bir istek yapın
val response = service.getData()

// İstek sonucunu işleyin ve verileri kullanarak UI'yi güncelleyin
response.enqueue(object : Callback<DataResponse> {
    override fun onResponse(call: Call<DataResponse>, response: Response<DataResponse>) {
        if (response.isSuccessful) {
            val data = response.body()
            // Verileri kullanarak UI'yi güncelleyin
            // ...
        }
    }

    override fun onFailure(call: Call<DataResponse>, t: Throwable) {
        // Hata durumunda işlemleri ele alın
        // ...
    }
})
```
## Görseller

![Görsel 1](https://github.com/fatihCetiner/ComposeCrypto/assets/53433157/323b5135-4e39-4e6a-816b-e8cabe33b0a2)

- API'den gelen veriler ana sayfada listelenir

![Görsel 2](https://github.com/fatihCetiner/ComposeCrypto/assets/53433157/c3619686-d615-4a01-8619-7e698ced27f4)

- Arama kutusunu kullanarak istediğiniz para birimini listeletebilirsiniz

![Görsel 3](https://github.com/fatihCetiner/ComposeCrypto/assets/53433157/dc3536b7-e44e-4dc5-89b4-b9bce196e079)

- Seçilen para biriminin detay sayfası

## Katkıda Bulunma
Eğer bu projeye katkıda bulunmak isterseniz, lütfen CONTRIBUTING.md dosyasını inceleyin ve pull request göndermeden önce geliştirme adımlarını takip edin.

## Teşekkürler
Bu uygulamanın geliştirilmesinde aşağıdaki kaynaklardan yararlanılmıştır:

Jetpack Compose Ekibi: Jetpack Compose'in geliştirilmesindeki emekleri ve bu yeni nesil UI kütüphanesini bizlerle buluşturmaları için Jetpack Compose ekibine teşekkür ederiz.
GitHub ve Statik Dosyalar: Uygulama verileri, GitHub üzerindeki statik dosyalar aracılığıyla sağlanmıştır. GitHub ve statik dosyaları sağlayan tüm geliştiricilere teşekkür ederiz.
Ayrıca, projeye katkıda bulunan tüm geliştiricilere ve destek verenlere teşekkür ederiz.
