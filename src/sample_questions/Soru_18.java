package sample_questions;

import java.util.Scanner;

public class Soru_18 {
    public static void main(String[] args) {

        /*
        Soru 18-)
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Hızınızı girin: ");
        double hiz = scan.nextDouble();
        System.out.println("Kalan km giriniz: ");
        double km = scan.nextDouble();
        double kalanSure = varisSuresiHesapla(hiz,km);
        System.out.println(kalanSure+" saat");

    }
    public static double varisSuresiHesapla (double hiz, double km){

        return km/hiz;
    }
}
