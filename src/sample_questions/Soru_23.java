package sample_questions;

public class Soru_23 {
    public static void main(String[] args) {

        /*

        Soru 23-)
        Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
        Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.

         */

        int sayi = 6;

        System.out.println(faktoriel(sayi));

    }
    public static int faktoriel (int sayi){

        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {

            sonuc = sonuc*i;

        }
        return sonuc;
    }

}
