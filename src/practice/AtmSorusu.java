package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AtmSorusu {
    static String kartNo = "123";
    static String sifre = "1234";
    static int bakiye = 500;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean kontrol = true;
        while (kontrol) {

            System.out.print("Kart numarasini giriniz: ");
            String kartNumarasi = scan.next().replace(" ", ""); // Aralardaki bosluklar silinir
            if (kartNumarasi.equals(kartNo)){
                System.out.print("Sifrenizi giriniz: ");
                String inputSifre = scan.next();
                if (inputSifre.equals(sifre)){
                    menu();
                    kontrol = false;
                }else {
                    System.out.println("Sifre hatalı lütfen tekrar deneyiniz\n");
                }
            }else {
                System.out.println("Kart no hatalı lütfen tekrar deneyiniz\n");
            }
        }
    }

    private static void menu() {
        List<String> islemler=new ArrayList<>(Arrays.asList("1-Bakiye Sorgula","2-Para Yatırma","3-Para Cekme","4-Para Gonderme",
                "5-Sifre Degistirme","6-Cıkıs"));
        boolean kontrol = true;
        String yanit;
        int tutar;

        do {
            System.out.println("\nHoşgeldiniz lütfen menüden yapmak istediğiniz işlemi seçin"+"\n=======MENU======");
            for (String s:islemler) {
                System.out.println(s+" ");
            }
            int islem = scan.nextInt();
            if (islem<=6 && islem>=1) {
                switch (islem) {
                    case 1:
                        System.out.println("=== Mevcut bakiye: "+bakiye+" ===");
                        System.out.println("\nYapmak istediğiniz başka bir işlem var mı ? E/H");
                        yanit = scan.next();
                        if (!(yanit.equalsIgnoreCase("E"))){
                            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
                            kontrol = false;
                        }
                        break;
                    case 2:
                        System.out.println("Yatırmak istediğiniz tutarı girin: ");
                        tutar = scan.nextInt();
                        bakiye += tutar;
                        System.out.println("\nYeni bakiye:"+bakiye);
                        System.out.println("\nYapmak istediğiniz başka bir işlem var mı ? E/H");
                        yanit = scan.next();
                        if (!(yanit.equalsIgnoreCase("E"))){
                            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
                            kontrol = false;
                        }
                        break;
                    case 3:
                        System.out.println("=== Mevcut Bakiyeniz : "+bakiye+" ==="+" \nLütfen çekmek istediğiniz tutarı girin : ");
                        tutar = scan.nextInt();
                        if (tutar>bakiye){
                            System.out.println("Yetersiz bakiye ! ");
                        } else if (tutar<0) {
                            System.out.println("Hatalı giriş");
                        } else {
                            bakiye -= tutar;
                            System.out.println("Çekilen tutar : "+tutar+"\nKalan bakiye : "+bakiye);
                        }
                        System.out.println("\nYapmak istediğiniz başka bir işlem var mı ? E/H");
                        yanit = scan.next();
                        if (!(yanit.equalsIgnoreCase("E"))){
                            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
                            kontrol = false;
                        }
                        break;
                    case 4:
                        System.out.println("Para göndermek istediğiniz iban numarasını girin");
                        String iban = scan.next();
                        iban = iban.toUpperCase();
                        if (iban.startsWith("TR") && iban.length()==26){
                            System.out.println("Göndermek istediginiz tutarı girin : ");
                            tutar = scan.nextInt();
                            if (!(tutar>bakiye)) {
                                bakiye -= tutar;
                                System.out.println("Kalan bakiye : " + bakiye);
                            }else {
                                System.out.println("Yetersiz bakiye");
                            }
                        }else {
                            System.out.println("Eksik veya hatalı iban girdiniz tekrar deneyin");
                        }
                        System.out.println("\nYapmak istediğiniz başka bir işlem var mı ? E/H");
                        yanit = scan.next();
                        if (!(yanit.equalsIgnoreCase("E"))){
                            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
                            kontrol = false;
                        }
                        break;
                    case 5:
                        System.out.println("Mevcut şifrenizi giriniz");
                        String inputSifre = scan.next();
                        if (inputSifre.equals(sifre)){
                            System.out.println("Dört haneli yeni bir şifre belirleyin : ");
                            String yeniSifre = scan.next();
                            if (yeniSifre.length() == 4){
                                sifre = yeniSifre;
                                System.out.println("Yeni şifre başarıyla oluşturuldu");
                            }else {
                                System.out.println("Şifreniz 4 haneli olmalı ! ");
                            }
                            System.out.println("\nYapmak istediğiniz başka bir işlem var mı ? E/H");
                            yanit = scan.next();
                            if (!(yanit.equalsIgnoreCase("E"))){
                                System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
                                kontrol = false;
                            }
                            break;
                        }else {
                            System.out.println("Şifre yanlış tekrar deneyin !");
                        }
                        break;
                    case 6:
                        kontrol = false;
                        System.out.println("=Bizi tercih ettiğiniz için teşekkür eder iyi günler dileriz=");
                        break;
                    default:
                        break;
                }
            }else {
                System.out.println("\nHatalı seçim !"+"\nLütfen tekrar deneyin");
            }
        }while (kontrol);
    }
}

