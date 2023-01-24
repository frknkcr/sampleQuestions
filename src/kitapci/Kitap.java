package kitapci;

public class Kitap {

    private String kitapAdi;
    private String yazar;
    private int fiyat;

    public Kitap(String kitapAdi, String yazar, int fiyat) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    public Kitap() {
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return
                "\nkitapAdi =" + kitapAdi +
                        "\nyazar =" + yazar +
                        "\nfiyat =" + fiyat
                ;
    }
}
