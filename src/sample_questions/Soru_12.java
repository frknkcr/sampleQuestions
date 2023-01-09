package sample_questions;

import java.util.Scanner;

public class Soru_12 {
    public static void main(String[] args) {

        /*
        Soru 12-)
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
        Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme
         */

        Scanner scan = new Scanner(System.in);

        long sayi1 = scan.nextLong();
        long sayi2 = scan.nextLong();
        String satiStr = String.valueOf(sayi1) + String.valueOf(sayi2);
        String sayiToplam = String.valueOf(sayi1+sayi2);
        long toplam;

        if (!(satiStr.length()>10 && sayiToplam.length() > 10)){

            toplam = sayi1+sayi2;
            System.out.println(toplam);

        }else {
            System.out.println("Fazla yüklenme");
        }

    }
}
