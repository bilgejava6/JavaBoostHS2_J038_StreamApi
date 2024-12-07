package com.muhammet.entity;

import java.util.UUID;

public class Bolum {
     private String id;
     private String ad;

    public Bolum(String ad) {
        this.ad = ad;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bolum{");
        sb.append("id='").append(id).append('\'');
        sb.append(", ad='").append(ad).append('\'');
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
}
