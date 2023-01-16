package ogrenciYonetimPlatformu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    static int numara =1000;

    ArrayList<Ogrenci> ogrList = new ArrayList<>();

    void islemler(){
        System.out.println(" ============= İŞLEMLER =============\n"+
        "\t\t 1-EKLEME \n" +
        "\t\t 2-ARAMA \n" +
        "\t\t 3-LİSTELEME \n" +
        "\t\t 4-SİLME \n" +
        "\t\t Q-ÇIKIŞ \n" + "\n"+
        "\t SEÇİMİNİZ:");

        try {
            int secim = scan.nextInt();
            switch (secim){
                case 1 : {
                    ekleme();
                }
                case 2 : {
                    System.out.println("ARANACAK TC NO GİRİNİZ: ");
                    arama(scan.next());
                }
                case 3 : {
                    listeleme();
                    islemler();
                }
                case 4 : {
                    silme();
                } default:{
                    System.out.println("Hatalı deger girdiniz!!!");
                    islemler();
                }

            }

        }catch (InputMismatchException e){

            String islem = scan.next();
            if (islem.equalsIgnoreCase("q")){
                System.out.println("******SİSTEMDEN ÇIKILIYOR******");
                System.exit(0);
            }else {
                System.out.println("Hatalı giriş yapıldı !!!");
                islemler();
            }
        }
    }

    private void silme() {
        System.out.println("SİLİNECEK TC NO'YU GİRİNİZ: ");
        String tcNo = scan.next();
        boolean kontrol = true;
        for (int i = 0; i < ogrList.size(); i++) {
            if (ogrList.get(i).getTcNo().equals(tcNo)){
                ogrList.remove(i);
                kontrol = false;
                listeleme();
                islemler();
            }
        }
        if (kontrol){
            System.out.println("BU TC NO'YA AİT ÖĞRENCİ BULUNAMADI!!!");
            islemler();
        }
    }

    private void listeleme() {
        for (Ogrenci each:ogrList) {
            System.out.println(each);
            System.out.println();
        }
    }

    private void arama(String tcNo) {

        for (Ogrenci each:ogrList) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println("ARANAN ÖĞRENCİ= \n" +each);
                islemler();
            }
        }
        System.out.println("BU TC NO'YA AİT ÖĞRENCİ BULUNAMADI!!!");
        islemler();
    }

    private void ekleme() {
        scan.nextLine();
        System.out.println("ÖĞRENCİ ADI: ");
        String ad= scan.nextLine();
        System.out.println("ÖĞRENCİNİN SOYADI: ");
        String sAd = scan.nextLine();
        System.out.println("ÖĞRENCİ TC NO: ");
        String tcNo = tcNoKontrol(scan.next());
        System.out.println("ÖĞRENCİNİN YAŞI: ");
        int yas = scan.nextInt();
        System.out.println("ÖĞRENCİ SINIFI: ");
        String sinif = scan.next();
        Ogrenci ogrenci = new Ogrenci(ad,sAd,tcNo,yas,++numara,sinif);
        ogrList.add(ogrenci);

        islemler();
        listeleme();

    }

    private String tcNoKontrol(String tcNo) {
        String[] tcNoArr = tcNo.split("");
        boolean kontrol = true;
        for (String each: tcNoArr) {
            if (!Character.isDigit(each.charAt(0))){
                kontrol = false;
            }
        }
        if (!kontrol){
            System.out.println("TC NO HATALI!!!");
            tcNoKontrol(scan.next());
            //menu();
        }
        return tcNo;
    }
}
