package okulYonetimPlatformu;

public class Ogretmen extends Kisi{

    private String bolum;

    private int sicilNo;

    public Ogretmen(String ad, String sad, String tcNo, int yas, String bolum, int sicilNo) {
        super(ad, sad, tcNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                " BÖLÜM= " + bolum + "\n" +
                " SİCİL NO= " + sicilNo+ "\n";
    }
}
