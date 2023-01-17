package okulYonetimPlatformu;

public class Kisi {

    private String ad,sAd,tcNo;
    private int yas;

    public Kisi(String ad, String sad, String tcNo, int yas) {
        this.ad = ad;
        this.sAd = sad;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSad() {
        return sAd;
    }

    public void setSad(String sad) {
        this.sAd = sad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "===KİŞİ BİLGİLERİ===\n"+
                " İSİM= " + ad + "\n" +
                " SOY İSİM= " + sAd + "\n" +
                " TC KİMLİK NO= " + tcNo + "\n" +
                " YAŞ= " + yas;
    }
}
