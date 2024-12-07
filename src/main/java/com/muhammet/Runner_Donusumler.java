package com.muhammet;

import com.muhammet.entity.Personel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Runner_Donusumler {
    public static void main(String[] args) {
        String isimListesi = "deniz, hakan, elif, bayhan, türkan";
        String[] dizi = isimListesi.split(",");
        List<String> isimler = List.of("Zeynel","Kenan","Eyyüp","Behiye","Hayriye");
        String birlesmisIsimListesi = isimler.stream().collect(Collectors.joining(";"));
        System.out.println(birlesmisIsimListesi);

        List<Personel> personeller = new ArrayList<>();
        personeller.add(new Personel("Ayhan","TAŞ", 300));
        personeller.add(new Personel("Hakan","TAŞ", 850));
        personeller.add(new Personel("Taşkın","TAŞ", 160));
        personeller.add(new Personel("Aşkın","TAŞ", 240));
        /**
         * Normal çözüm şekli
         */
        double ortalama = 0, toplamBorc=0;
        for(Personel personel : personeller) { // foreach
            toplamBorc += personel.getBorc();
        }
        ortalama = toplamBorc / personeller.size();
        System.out.println("Ortalama borç....: "+ ortalama);
        /**
         * Stream ile çözüm şekli
         */
        Double ortalamaStream = personeller.stream().collect(Collectors.averagingDouble(Personel::getBorc));
        System.out.println("Ortalama stream....: "+ ortalamaStream);

        /**
         * List to Map
         */
        isimler = List.of("Zeynel","Kerim","Kenan","Eyyüp","Eylül","Behiye","Hayriye", "Canan", "İlkay", "Kenan", "Demet");
        // uzunluklarına göre isimleri map olarak dönüştürün.
        // Map<Key, Value> Key aynı olamaz
        Map<String, Integer> isimUzunluk = isimler.stream() // stream e dönüştür
                                                .distinct() // değerleri tekilleştir.
        //                                        .collect(Collectors.toMap(isim-> isim,isim-> isim.length()));
                                               .collect(Collectors.toMap(s->s, String::length));

        System.out.println(isimUzunluk);

        // uzunlukları ayın olanlar için key uzunluk value ise isim listesi olsun
        Map<Integer,List<String>> uzulukIsimListesi = isimler.stream().distinct()
                                .collect(Collectors.groupingBy(String::length));
        System.out.println(uzulukIsimListesi);

        TreeMap<String, List<String>> basharfListesi = isimler.stream().distinct()
                .collect(Collectors.groupingBy(
                        s-> s.substring(0,1), //string değişkeninin ilk harfini alıyoruz
                        TreeMap::new,
                        Collectors.toList()
                ));
        System.out.println(basharfListesi);

    }
}
