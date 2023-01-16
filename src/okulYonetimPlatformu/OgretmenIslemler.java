package okulYonetimPlatformu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler{
    static int sicilNo = 1000;
    Scanner scan = new Scanner(System.in);
    ArrayList<Ogretmen> ogretmenList = new ArrayList<>();
    void ogrtMenu(){

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
                } default:
                    System.out.println("HATALI SEÇİM!!!");
                    ogrtMenu();
            }
        }catch (InputMismatchException e){
            String secim = scan.next();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu = new AnaMenu();
                anaMenu.menu();
            }else {
                System.out.println("HATALI GİRİŞ YAPILDI");
                ogrtMenu();
            }
        }
    }


    @Override
    public void ekleme() {
        System.out.println("ÖĞRETMENİN ADINI GİRİNİZ: ");
        scan.nextLine();
        String ad = scan.nextLine();
        System.out.println("ÖĞRETMENİN SOYADINI GİRİNİZ: ");
        String sAd = scan.nextLine();
        System.out.println("ÖĞRETMENİN TC NO SUNU GİRİNİZ: ");
        String tcNo = tcNoKontrol(scan.next());
        scan.nextLine();
        System.out.println("ÖĞRETMENİN YAŞINI GİRİNİZ: ");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.println("ÖĞRETMENİN BÖLÜMÜNÜ GİRİNİZ: ");
        String bolum = scan.nextLine();
        Ogretmen ogretmen = new Ogretmen(ad,sAd,tcNo,yas,bolum,sicilNo++);
        ogretmenList.add(ogretmen);
        ogrtMenu();

    }

    private String tcNoKontrol(String tcNo) {
        String[] tcNoArr = tcNo.replace(" ","").split("");
        boolean kontrol = true;
        for (String each: tcNoArr) {
            if (!Character.isDigit(each.charAt(0))){
                kontrol = false;
            }
        }
        if (!kontrol){
            System.out.println("TC NO HATALI TEKRAR DENEYİN!!!");
            tcNoKontrol(scan.next());
        }
        return tcNo;
    }

    @Override
    public void arama() {
        System.out.println("ARAMAK İSTEDİĞİNİZ ÖĞRETMEN TC'SİNİ GİRİNİZ: ");
        String tc = scan.next();
        for (Ogretmen each:ogretmenList){
            if (tc.equals(each.getTcNo())){
                System.out.println(each);
                ogrtMenu();
            }else {
                System.out.println("ÖĞRETMEN BULUNAMADI VE/VEYA GİRDİĞİNİZ TC HATALI!!");
                ogrtMenu();
            }
        }
    }

    @Override
    public void listeleme() {

        for (Ogretmen each: ogretmenList) {
            System.out.println(each);
            System.out.println();
            ogrtMenu();
        }
    }


    @Override
    public void silme() {

    }
}
