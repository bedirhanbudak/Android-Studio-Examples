package models;

import android.graphics.drawable.Drawable;

public class Meyve {

    String ad;
    String fiyat;
    String stokAdedi;
    String aciklama;
    Integer image;



    public Meyve(String ad, String fiyat, String stokAdedi, String aciklama) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.stokAdedi = stokAdedi;
        this.aciklama = aciklama;
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(String stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
