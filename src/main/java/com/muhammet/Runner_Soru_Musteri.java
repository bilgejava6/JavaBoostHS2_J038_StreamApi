package com.muhammet;

import com.muhammet.entity.Musteri;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner_Soru_Musteri {
    private static  List<Musteri> musteriList = new ArrayList<>();
    public static void main(String[] args) {
        init();
        /**
         * Sorular
         * 1- Aynı ilde olan kişileri listeleyin (örn: Ankara) filter
         * 2- Aynı ilde olan kişileri gruplayıp Map oluşturun.
         * 3- Her ilde ikamet eden kişi sayınısın ekrana yazdırın. (örn:Ankara: 5, İzmir: 3 .... )
         * 4- Ankara da ikamet eden ve yaşı 40 tan fazla olan müşterilerin listesi. filter
         * 5- Müşterilerin yaş ortalaması nedir?
         *
         */
        musteriList.stream().filter(musteri -> musteri.getIlAdi().equals("Ankara")).forEach(System.out::println);
        Map<String,List<Musteri>> ilList = musteriList.stream().collect(Collectors.groupingBy(Musteri::getIlAdi));
        System.out.println(ilList);
        ilList.forEach((k,v)->{
            System.out.println(k+ " : "+ v.size());
        });
        musteriList.stream().filter(musteri -> musteri.getIlAdi().equals("Ankara") && musteri.getYas()>40).forEach(System.out::println);
        double ortalama = musteriList.stream().collect(Collectors.averagingDouble(Musteri::getYas));
        System.out.println("Ortalama....: "+ ortalama);

    }

    private static void init(){
        // burada 15 adet müşteri tanımlıyorsunuz. // en 6 farklı il olsun. aynı ilde olanlar mutlaka olsun. listeye ekleyin.
        musteriList.add(new Musteri("Murat",34,"Ankara"));
        musteriList.add(new Musteri("Murat",34,"İzmir"));
        musteriList.add(new Musteri("Murat",34,"Bursa"));
        musteriList.add(new Musteri("Murat",34,"Hatay"));
        musteriList.add(new Musteri("Murat",34,"Samsun"));
        musteriList.add(new Musteri("Murat",34,"Trabzon"));
        musteriList.add(new Musteri("Murat",34,"Van"));
        musteriList.add(new Musteri("Murat",34,"Erzurum"));
        musteriList.add(new Musteri("Murat",34,"Antalya"));
        musteriList.add(new Musteri("Murat",34,"Konya"));
        musteriList.add(new Musteri("Murat",34,"Sivas"));
        musteriList.add(new Musteri("Murat",34,"Kayseri"));
        musteriList.add(new Musteri("Murat",34,"İzmir"));
        musteriList.add(new Musteri("Murat",34,"Bursa"));
        musteriList.add(new Musteri("Murat",34,"Samsun"));
        musteriList.add(new Musteri("Murat",34,"Ankara"));

    }
}
