package okulYonetimPlatformu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciIslemler implements IIslemler{

    Scanner scan = new Scanner(System.in);
    void ogrncMenu(){

        System.out.println("============= İŞLEMLER =============\n" +
                "       1-EKLEME\n" +
                "       2-ARAMA\n" +
                "       3-LİSTELEME\n" +
                "       4-SİLME\n" +
                "       Q-ÇIKIŞ");

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
                }
            }
        }catch (InputMismatchException e){
            String secim = scan.next();
            if (secim.equalsIgnoreCase("q")){
                AnaMenu anaMenu = new AnaMenu();
                anaMenu.menu();
            }else {
                System.out.println("HATALI GİRİŞ YAPILDI");
                ogrncMenu();
            }

        }
    }


    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }


    @Override
    public void silme() {

    }
}
