package com.muhammet;

import com.muhammet.entity.Bolum;
import com.muhammet.entity.Personel;

import java.util.ArrayList;
import java.util.List;

public class Runner_PersonelOrnek {
    private static List<Personel> personelList = new ArrayList<>();
    public static void main(String[] args) {
        init();
    }

    private static void init(){
        Bolum bilgiIslem = new Bolum("Bilgi İşlem");
        Bolum insanKaynaklari = new Bolum("İnsan Kaynaklari");
        Bolum muhasebe = new Bolum("Muhasebe");
        Bolum yonetim = new Bolum("Yönetim");
        Bolum idariHizmetler = new Bolum("İdari Hizmetler");




    }
}
