package com.muhammet;

public class StreamOdev {
    /**
     * Temel Sorular - Stream dönüşüm işlemleri
     * 	1.	Bir listeyi al ve içindeki tüm elemanları büyük harfe çevirerek yeni bir liste oluştur.
     * 	2.	Bir listeyi al ve yalnızca çift sayıları filtrele.
     * 	3.	Bir dizideki tüm elemanların toplamını hesapla.
     * 	4.	Bir listeyi ters sırayla sıralamak için bir stream işlemi kullan.
     * 	5.	Bir listede en büyük elemanı bul.
     *
     * Ara İşlemler (Intermediate Operations) - stream filter, reduce, collect v.s.
     * 	6.	Bir listedeki sayıları 2 ile çarp ve sonucu yeni bir liste olarak dön.
     * 	7.	Bir listedeki pozitif sayıları filtrele ve karelerini hesapla.
     * 	8.	Bir dizideki tekrar eden elemanları kaldır ve kalanları bir listeye dönüştür.
     * 	9.	Bir metin listesini uzunluklarına göre sıralayarak bir liste döndür.
     * 	10.	Bir listedeki elemanların ilk harflerini alarak bir liste oluştur.
     *
     * Son İşlemler (Terminal Operations) - sonuç bulma ekrana yazdırma işlemleri. sum, toList, forEach v.s.
     * 	11.	Bir listedeki tüm elemanların çarpımını hesapla.
     * 	12.	Bir listedeki elemanlardan herhangi bir tanesini al ve ekrana yazdır.
     * 	13.	Bir listedeki elemanları virgülle ayrılmış bir String’e dönüştür.
     * 	14.	Bir listedeki elemanlardan kaç tanesinin tek sayı olduğunu hesapla.
     * 	15.	Bir listedeki tüm elemanların toplamını yalnızca reduce kullanarak hesapla.
     *
     * Optional Kullanımı
     * 	16.	Bir listedeki en küçük elemanı bul ve sonucu ekrana yazdır. (Optional kullan)
     * 	17.	Bir listedeki elemanların ortalamasını hesapla ve Optional olarak döndür.
     * 	18.	Bir listedeki boş olmayan ilk metni döndür. Eğer hepsi boşsa “Bulunamadı” yazdır.
     * 	19.	Bir listedeki en uzun kelimeyi bul ve ekrana yazdır.
     * 	20.	Bir listedeki herhangi bir çift sayıyı döndür ve yoksa bir hata mesajı göster.
     *
     * 	Karmaşık Sorular
     * 	21.	Bir listedeki tüm sayıları filtrele, yalnızca pozitif olanları al ve toplamını hesapla.
     * 	22.	Bir String listesindeki her kelimeyi ters çevirerek yeni bir liste oluştur.
     * 	23.	Bir listedeki çift sayıların karesini al, küçükten büyüğe sırala ve ilk üçünü yazdır.
     * 	24.	Bir listedeki elemanları gruplara ayır (örneğin, 5’ten küçük ve 5’ten büyük olanlar).
     * 	25.	Bir listedeki elemanları topla, ardından ortalama değerin altındaki elemanları filtrele.
     *
     * Dönüşüm Soruları
     *
     *  26. Bir List<String> içindeki elemanları kendilerini Key tersten yazılmış hallerini Value olarak
     *  bir Map<String,String> dönüştren stream kodunu yazınız.
     *  27. Bir ürün satış listesinde ürünlerin listesi çıkartılmıştır. List<String> ürünAdları bu listeyi
     *  bir Set<String> benzersizUrunListesi ne dönüştürün.
     *
     * Gerçek Hayat Örneklerim:
     *
     * 1. Ürün Fiyatlandırması
     *
     * Bir mağaza, ürünlerin isimlerini ve fiyatlarını içeren bir List<Product> yapısı kullanıyor.
     * Aşağıdaki işlemleri gerçekleştirin:
     * 	•	Fiyatı 100 TL’den fazla olan ürünleri filtreleyin.
     * 	•	Ürünlerin sadece isimlerini içeren bir Set<String> oluşturun.
     * 	•	Fiyatı en düşük ürünü bulun.
     *
     * class Product {
     *     String name;
     *     double price;
     * }
     * List<Product> products = Arrays.asList(
     *     new Product("Laptop", 7500),
     *     new Product("Mouse", 250),
     *     new Product("Keyboard", 400),
     *     new Product("Pen", 50)
     * );
     *
     * 2. Çalışan Maaşları
     *
     * Bir şirkette çalışanların isimlerini ve maaşlarını içeren bir Map<String, Double> var. Aşağıdaki işlemleri gerçekleştirin:
     * 	•	Maaşı 10.000 TL’nin üzerinde olan çalışanların isimlerini bir List<String> olarak döndürün.
     * 	•	Maaşları sıralayarak bir TreeSet<Double> oluşturun.
     * 	•	Tüm çalışanların toplam maaşını hesaplayın.
     * 	Map<String, Double> employees = Map.of(
     *     "Ahmet", 12000.0,
     *     "Mehmet", 9500.0,
     *     "Zeynep", 11500.0,
     *     "Ayşe", 8000.0
     * );
     *
     * 3. Öğrenci Notları
     *
     * Bir sınıftaki öğrencilerin isimlerini ve sınav notlarını içeren bir List<Student> yapısı kullanılıyor.
     * Aşağıdaki işlemleri gerçekleştirin:
     * 	•	Notu 50’nin üzerinde olan öğrencileri filtreleyin.
     * 	•	Öğrenci isimlerini alfabetik sıraya göre bir TreeSet<String> oluşturun.
     * 	•	Her öğrencinin “İsim:Not” formatında bir Map<String, Integer> oluşturun.
     *class Student {
     *     String name;
     *     int grade;
     * }
     * List<Student> students = Arrays.asList(
     *     new Student("Ali", 45),
     *     new Student("Can", 75),
     *     new Student("Elif", 62),
     *     new Student("Derya", 85)
     * );
     *
     */
}
