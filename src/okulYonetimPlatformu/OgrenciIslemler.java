package okulYonetimPlatformu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciIslemler implements IIslemler{
    static int numara = 1000;
    Scanner scan = new Scanner(System.in);
    static ArrayList<Ogrenci> ogrenciList = new ArrayList<>();

    void ogrenciMenu(){
        System.out.println("============= İŞLEMLER =============\n" +
                "       1-EKLEME\n" +
                "       2-ARAMA\n" +
                "       3-LİSTELEME\n" +
                "       4-SİLME\n" +
                "       Q-ÜST MENÜ");

        try {
            int secim = scan.nextInt();
            switch (secim){
                case 1:{
                    ekleme();
                }
                case 2:{
                    arama();
                }
                case 3:{
                    listeleme();
                }
                case 4:{
                    silme();
                } default:{
                    System.out.println("HATALI SEÇİM!!!");
                    ogrenciMenu();
                }
            }
        }catch (InputMismatchException e){
            String secim = scan.next();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu = new AnaMenu();
                anaMenu.menu();
            }else {
                System.out.println("HATALI GİRİŞ YAPILDI");
                ogrenciMenu();
            }
        }
    }

    @Override
    public void ekleme() {

        scan.nextLine();
        System.out.println("ÖĞRENCİNİN ADINI GİRİNİZ: ");
        String ad = scan.nextLine();
        System.out.println("ÖĞRENCİNİN SOYADINI GİRİNİZ: ");
        String sAd = scan.nextLine();
        System.out.println("ÖĞRENCİNİN TC NO'SUNU GİRİNİZ: ");
        String tcNo = scan.next();
        System.out.println("ÖĞRENCİNİN YAŞINI GİRİNİZ: ");
        int yas = scan.nextInt();
        System.out.println("ÖĞRENCİNİN SINIFINI GİRİNİZ: ");
        String sinif = scan.next();
        Ogrenci ogrenci = new Ogrenci(ad,sAd,tcNo,yas,++numara,sinif);
        ogrenciList.add(ogrenci);
        listeleme();
        ogrenciMenu();
    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.println("ARAMAK İSTEDİĞİNİZ ÖĞRENCİNİN TC VEYA SİCİL NO'SUNU GİRİNİZ: ");
        String giris = scan.nextLine();
        for (Ogrenci each:ogrenciList){
            if (giris.equals(each.getTcNo()) || Integer.parseInt(giris) == each.getNumara()){
                System.out.println("\n====ÖĞRENCİ "+each.getNumara()+"====\n"+each);
                ogrenciMenu();
            }
        }
        System.out.println("ÖĞRENCİ BULUNAMADI VE/VEYA GİRDİĞİNİZ TC HATALI!!");
        ogrenciMenu();
    }

    @Override
    public void listeleme() {
        for (Ogrenci each:ogrenciList) {
            System.out.println(each);
        }
        System.out.println();
        ogrenciMenu();
    }

    @Override
    public void silme() {
        scan.nextLine();
        System.out.println("SiSTEMDEN SİLMEK İSTEDİĞİNİZ ÖĞRENCİNİN TC VEYA ÖĞRENCİ NO'SUNU GİRİN: ");
        String kontrol = scan.nextLine();
        for (Ogrenci each:ogrenciList) {
            if (Integer.parseInt(kontrol) == each.getNumara() || each.getTcNo().equals(kontrol)) {
                ogrenciList.remove(each);
                System.out.println("SİLME İŞLEMİ BAŞARI İLE GERÇEKLEŞTİRİLDİ");
                ogrenciMenu();
            }
        }
        System.out.println("GİRDİĞİNİZ TC VEYA ÖĞRENCİ NO'YA UYAN BİR KAYIT BULUNAMADI!!");
        ogrenciMenu();
    }
}
