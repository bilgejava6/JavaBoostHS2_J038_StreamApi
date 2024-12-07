package com.muhammet;

import java.util.List;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        /**
         *  ***  Stream API ***
         * stream nedir?
         * Bir dere(stream) gibi düşünürsek sürekli akış halindeki suyun içerisinden ihtiyaç duyulan
         * balık ağaç gibi şeyler toplanabilir, ayıklanabilir.
         * List, Map, Set interface leri üzerinden türetilen datalarımız birer Göl ya da Baraj olsun
         * bu su birikintisinden ihtiyaç duyulduğu kadar suyu almak istiyorsak bir hat, ark yada
         * boru açarız ki suyun ihtiyaç duyduğumuz kısmını alabilelim.
         */
        List<Integer> sayiListesi = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> sayiStream = sayiListesi.stream(); // orjinal veriye dokunmadan hat açar.
        Stream<Integer> ciftSayilar = sayiStream.filter(num-> num % 2 == 0);// 2 ye bölünenleri ayıkla
        // buraya kadar işlem tanımı yaptığım hiç bir yapı işleme tabi değildir
        // sadece stream için kuralları belirler. Ne zaman ki kullanırız o zaman aktif olurlar.
        int toplam = ciftSayilar.mapToInt(Integer::intValue).sum(); // tüm sayıları topla
        System.out.println("toplam = " + toplam);
        System.out.println(sayiListesi);
        //sayiListesi = ciftSayilar.toList();
    }
}
