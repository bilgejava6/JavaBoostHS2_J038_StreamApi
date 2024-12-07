package com.muhammet.entity;

import java.util.UUID;

public class Musteri {
    private String id;
    private String ad;
    private Integer yas;
    private String ilAdi;

    public Musteri(String ad, Integer yas, String ilAdi) {
        this.id = UUID.randomUUID().toString();
        this.ad = ad;
        this.yas = yas;
        this.ilAdi = ilAdi;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musteri{");
        sb.append("id='").append(id).append('\'');
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", yas=").append(yas);
        sb.append(", ilAdi='").append(ilAdi).append('\'');
        sb.append('}');
        return sb.toString();
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

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public String getIlAdi() {
        return ilAdi;
    }

    public void setIlAdi(String ilAdi) {
        this.ilAdi = ilAdi;
    }
}
