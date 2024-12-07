package com.muhammet.entity;

import java.util.UUID;

public class Personel {
    private String id;
    private String ad;
    private String soyad;
    private Integer borc;
    private Bolum bolum;

    public Personel(String ad, String soyad, Integer borc, Bolum bolum) {
        this.id  = UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.borc = borc;
        this.bolum = bolum;
    }

    public Personel(String ad, String soyad, Integer borc) {
        this.id  = UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.borc = borc;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personel{");
        sb.append("id='").append(id).append('\'');
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Bolum getBolum() {
        return bolum;
    }

    public void setBolum(Bolum bolum) {
        this.bolum = bolum;
    }

    public Integer getBorc() {
        return borc;
    }

    public void setBorc(Integer borc) {
        this.borc = borc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
