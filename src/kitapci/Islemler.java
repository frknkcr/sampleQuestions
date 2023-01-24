package kitapci;

import java.util.*;

public class Islemler {

        Scanner scan=new Scanner(System.in);
        static int kitapNo=1000;
        Map<Integer, Kitap> kitapMap = new HashMap<>();
        void islemler(){
            System.out.println("========HOSGELDİNİZ===========");
            System.out.println("YAPMAK İSTEDGİNİZ İSLEMİ SECİNİZ \n1-Kitap Ekle\n2-No ile kitap goruntıle\n3-Bigi ile kitap goruntule" +
                    "\n4-no ile kitap sil\n5-kitaplari listele\nQ-Cikis");
            int secim=0;
            try {
                secim=scan.nextInt();

            }catch (InputMismatchException e){
                String secim2=scan.nextLine();
                if (secim2.equalsIgnoreCase("q")){
                    System.out.println("güle güle");
                    System.exit(0);
                }else {
                    System.out.println("yanlis secim");
                    islemler();
                }
            }
            switch (secim){
                case 1:{
                    ekle();
                    break;
                }
                case 2:{
                    noIleSorgula();
                    break;
                }
                case 3:{
                    bigiIleKtiap();
                    break;
                }
                case 4:{
                    kiatpSil();
                    break;
                }
                case 5:{
                    kitaplistele();
                    break;
                }
                default:{
                    System.out.println("hatali giris");
                    islemler();
                }
            }
        }

        private void kitaplistele() {

            for (Map.Entry<Integer, Kitap> kitapEntry : kitapMap.entrySet()) {
                System.out.println(kitapEntry.getValue());
            }
            islemler();


        }

        private void kiatpSil() {
            System.out.println("silinecek kitabın numarasını giriniz");
            int no=scan.nextInt();
            Set<Integer> set=kitapMap.keySet();
            boolean kontrol=true;
            for (Integer each:set
            ) {
                if (each==no){
                    System.out.println("silinecek kitap"+kitapMap.remove(no));
                    kontrol=false;
                    kitaplistele();
                }
            }

            if (kontrol){
                System.out.println("böyle bir kitap bulunmamaktadir.");
                islemler();
            }
        }

        private void bigiIleKtiap() {
            scan.nextLine();
            System.out.println("Kitabin adini veya yazarini giriniz");
            String isim=scan.nextLine();
            boolean kontrol=true;

            for (Map.Entry<Integer, Kitap> each:kitapMap.entrySet()) {

                    if (each.getValue().getKitapAdi().equalsIgnoreCase(isim)||each.getValue().getYazar().equalsIgnoreCase(isim)){
                        System.out.println("kitap bilgisi :"+each+" no :"+each.getKey());
                        kontrol=false;
                        islemler();

                    }
                }

            if (kontrol){
                System.out.println("bu isimde veya bu yazar adında bir kitap yok");
                islemler();
            }
        }

        private void noIleSorgula() {
            System.out.println("götüntülemek istediğiniz kitabın no sunu giriniz");
            int no=scan.nextInt();
            for (Integer each: kitapMap.keySet()) {
                if (each==no){
                    System.out.println("girilen kitap no :"+each+" kitap :"+kitapMap.get(no));
                    islemler();
                }
            }
            System.out.println("böyle bir kitap bulunmamaktadir.");
            islemler();

        }

        private void ekle() {
            scan.nextLine();
            System.out.println("Kitabın adını giriniz");
            String ad=scan.nextLine();
            System.out.println("Kitabın yazarını giriniz");
            String yazar=scan.nextLine();
            System.out.println("kitabın fiyatini giriniz");
            int fiyat=scan.nextInt();
            Kitap kitap=new Kitap(ad,yazar,fiyat);
            kitapMap.put(++kitapNo,kitap);
            islemler();
        }
}
