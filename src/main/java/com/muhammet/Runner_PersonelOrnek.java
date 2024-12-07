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

        personelList.add(new Personel("Ahmet", "TAŞ",600, bilgiIslem));
        personelList.add(new Personel("Hakan", "TAŞ",434, bilgiIslem));
        personelList.add(new Personel("Aynur", "TAŞ",234, bilgiIslem));
        personelList.add(new Personel("Bekir", "TAŞ",24, bilgiIslem));
        personelList.add(new Personel("Adnan", "TAŞ",657, bilgiIslem));
        personelList.add(new Personel("Emel", "TAŞ",34645, insanKaynaklari));
        personelList.add(new Personel("Tekin", "TAŞ",345, insanKaynaklari));
        personelList.add(new Personel("Murat", "TAŞ",7898, insanKaynaklari));
        personelList.add(new Personel("Nuri", "TAŞ",952, insanKaynaklari));
        personelList.add(new Personel("Jale", "TAŞ",2457, insanKaynaklari));
        personelList.add(new Personel("Kenan", "TAŞ",7895, insanKaynaklari));
        personelList.add(new Personel("Kubat", "TAŞ",6878, muhasebe));
        personelList.add(new Personel("Nahide", "TAŞ",8654, muhasebe));
        personelList.add(new Personel("Şakir", "TAŞ",2215, yonetim));
        personelList.add(new Personel("Şükran", "TAŞ",24556, yonetim));
        personelList.add(new Personel("Zeynep", "TAŞ",1685, yonetim));
        personelList.add(new Personel("Yunus", "TAŞ",8652, idariHizmetler));
        personelList.add(new Personel("Uğur", "TAŞ",345, idariHizmetler));
        personelList.add(new Personel("Fahriye", "TAŞ",674, idariHizmetler));
        personelList.add(new Personel("Yağmur", "TAŞ",467, idariHizmetler));
        personelList.add(new Personel("Gönül", "TAŞ",862, idariHizmetler));
        personelList.add(new Personel("Perihan", "TAŞ",345, idariHizmetler));




    }
}
