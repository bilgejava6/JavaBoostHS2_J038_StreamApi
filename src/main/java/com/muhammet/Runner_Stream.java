package com.muhammet;

import com.muhammet.entity.Personel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Runner_Stream {
    public static void main(String[] args) {
        /**
         * Stream Oluşturmak
         */
        Stream<String> streamAmpty = Stream.empty(); // boş stream tanımlamak. conunt -> 0
        Stream<String> stream1 = Stream.of(" Muhammet HOCA"); // tek değer içeren bir stream conunt ->1
        Stream<Integer> stream2 = Stream.of(1, 2, 3,55,324234,24256); // çoklu değer içeren stream count -> 6
        // DİKKAT!!!! Generic yapılar sadece ve sadece Referans data type kabul eder.
        // Stream<boolean> YANLIŞ KULLANIM
        List<String> haftaninGunleri = List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar");

        // bir collections tan stream e dönüşün stream() methodu ile yapılır
        Stream<String> gunlerStream = haftaninGunleri.stream();
        /**
         * bir listeyi yazdırma şekliniz.
         * 1- klasik for => for(int i=0;i<gunler.size();i++)
         * 2- foreach => for(String gun : haftaninGunleri) - multi thread çalışır.
         * ancak bunlar dışında stream ile yapılabilen foreach döngüleri vardır ve daha performanslıdır
         * bellek kullanımı ve paralel işlem yeteneğine sahiptir. (yani çoklu çekirdek kullanımı)
         * ------
         * CPU -> 16 çekirdek - 1 çekirdek hızı (4.36GHZ) - 16 çekirdek (3.4GHZ * 16)
         * CPU -> klasik olarak kullanıcılar tek çekirdek ile işlemlerini yürütür. işletimsistemi kendi insiyatifi ile
         * diğer çekirdekleride işleme katabilir.
         *
         */
        //gunlerStream.forEach(System.out::println); // bu ne demek?
        /**
         * foreach, bir liste üzerinde sıra ile dolaşarak her seferinde listenin bir datasını döner
         * mesela bir isim listesi var ise her seferinde bir isim(String) okur.ve okuduğu bilgiyi
         * kendi gövdesine parametre olarak geçer.
         * System.out::println çalışma mantığı -> gövdeye gelen değer println() methoduna parametre olarak geçilir
         * aslında kod şöyledir.
         * String gelendata = "Pazartesi";
         * System.out.println(gelendata);
         * burada ki gelen data foreach in her döngüsünde listeden çektiği veriyi gösterir.
         * DİKKAT!!! Stream açılır ve kullanılıp kapanır.
         * bu nedenle bir kere işleme tabi tutulan stream bir kez daha kullanılamaz. kullanılırsa şu hata verir:
         * Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
         *
         */
        // gunlerStream.forEach(gelendata -> System.out.println(gelendata));

        gunlerStream.forEach(gelenData ->{
            System.out.println("Önce yapılacak işlemler");
            System.out.println(gelenData);
            System.out.println("---------------------");
        });

        /**
         *
         * Sonsuz Stream ler
         * Math.random() -> size 0 ile 1 arasında double bir sayı üretir.
         */
        Stream<Double> sonsuzStream_1 = Stream.generate(Math::random); // bu ben her okumak istediğim bir sayı dönecek.
        // şuan : {} -> empty
        /**
         * seed-> başlanma noktası
         * x-> kural
         * 100, n-> n+5
         * akış -> 100, 105, 110, 115 ...... sonsuz
         */
        Stream<Integer> sonsuzStream_2 = Stream.iterate(100, n -> n + 5);
        /**
         * seed -> başlama noktası
         * condition -> bitiş sonlanma kuralı
         * kural -> yeni değer üretme kuralı
         * akış -> 500, 530, 560 ..... 680 (n<700)
         */
        Stream<Integer> sonsuzStream_3 = Stream.iterate(500, ahmetAmcaDegeri-> ahmetAmcaDegeri<700, neeeee-> neeeee + 30 );

        sonsuzStream_3.forEach(number->{
            // okumak istediğiniz anda, generate rastgele sayı üreten sınıfı tetikler ve bir sayı alır
            System.out.println(number);
            try{
                Thread.sleep(100L);
            }catch (Exception ex){}

        });


        var kelimeBilgisi = new char[]{'M','u','h','a','m','m','e','t'};
        String ad = "";
        for(char c: kelimeBilgisi) {
           ad = ad.concat(c + "");
        }
        System.out.println("ad.....: "+ ad);

        Stream<String> adStream = Stream.of("M","u","r","a","t");
        /**
         * identity -> "" başlangıç verimiz.
         * kural(BinaryOperator) -> (s1: mevcut değer, s2: sıradaki değer) -> kural İşlem tanımla s1+s2;
         * Stream değeri : "M","u","r","a","t"
         * 1. adım:   s1 + s2
         * identity : "" + "M"
         * 2. adım
         * identity: "M" + "u"
         * 3. adım
         * identity: "Mu" + "r"
         */
        ad = adStream.reduce("",(s1,s2)-> s1 + s2);
        System.out.println("stream ad ....: "+ ad);
        /**
         * 2,4,8,50,23,47,99
         * i: 1 * 2
         * i: 2 * 4
         * i: 8 * 8
         * i: 64 * 50
         * i: 3200 * 23
         */
        Stream<Integer> sayiList = Stream.of(2,4,8,50,23,47,99);
        int carpim = sayiList.reduce(1, (ahmetAmca, cananTeyze)-> ahmetAmca * cananTeyze);
        System.out.println("tüm sayıların çarpımı....: "+carpim);

        /**
         * Optional nedir?
         * bir nesne değişkeni mutlakata bir adresi göstermek zorunda değildir. bazen içinde değer
         * olmayabilir. Bu nedenle var olmayan nesnelerin parametreleri hata fırlatacaktır.(NullPointerException)
         * kodlamaya bu tarz sorunlar tespit etmek için "null check" yapmak gereklidir, olursa unutulursa
         * uygulama çökebilir yada kullanılamayabilir.
         *
         */
        String ifade = "Muhammet HOCA";
        Optional<String> ifadeOptional = Optional.of(ifade); // ifade değişkenini kutuya koy.
        if (ifadeOptional.isPresent()) // kutunun içinde eğer bir değer var ise
            System.out.println(ifadeOptional.get().toUpperCase());

        /**
         * Stream ile filtreleme yapmak
         */
        List<String> isimler = List.of("Mehmet","Enes","Ali","Ayşe","Bahri","Zeynep");
        Stream<String> isimListesi = Stream.of("Mehmet","Enes","Ali","Ayşe","Bahri","Zeynep");
        System.out.println("""
                ******   Arama    ******
                """);
        System.out.println("Adında a harfi olanlar");
        //isimler.stream().filter(x-> x.contains("a")).forEach(System.out::println);
        isimListesi.filter(x-> x.contains("a")).forEach(System.out::println);
        System.out.println("-----------------");
        isimListesi = Stream.of("Mehmet","Enes","Ali","Ayşe","Bahri","Zeynep");
        System.out.println("adı A ile başlayanlar");
        isimListesi.filter(x-> x.startsWith("A")).forEach(System.out::println);
        System.out.println("-----------------");
        isimListesi = Stream.of("Mehmet","Enes","Ali","Ayşe","Bahri","Zeynep");
        System.out.println("adının uzunluğu 4 ve daha kısa olanlar");
        isimListesi.filter(x-> x.length()<=4).forEach(System.out::println);
        isimListesi = Stream.of("Mehmet","Enes","Ali","Ayşe","Bahri","Zeynep");
        System.out.println("Adında i ve a harfi olanlar");
        isimListesi.filter(x-> x.contains("i") && x.contains("a") ).forEach(System.out::println);

        /**
         * Entity ile çalışmak ve stream kullanımı
         *
         */
        List<Personel> personelListesi = new ArrayList<>();
        personelListesi.add(new Personel("Murat","TAŞ",590));
        personelListesi.add(new Personel("Deniz","KAŞIK",9000));
        personelListesi.add(new Personel("Ayhan","BEDİR",543));
        personelListesi.add(new Personel("Kenan","EZGİ",980));
        personelListesi.add(new Personel("Eylem","ATEŞ",2380));
        personelListesi.add(new Personel("Yüksel","VARDIR",3442));
        System.out.println("""
                **    Personel Listesi    **
                """);
        personelListesi.stream()
                .filter(x-> x.getAd().contains("e") && x.getAd().contains("l"))
                .forEach(System.out::println);

        Integer toplamAvans = personelListesi.stream().mapToInt(Personel::getBorc).sum();



    }
}
