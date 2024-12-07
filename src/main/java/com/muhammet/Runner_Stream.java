package com.muhammet;

import java.util.List;
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
        gunlerStream.forEach(gelendata -> System.out.println(gelendata));

        
    }
}
