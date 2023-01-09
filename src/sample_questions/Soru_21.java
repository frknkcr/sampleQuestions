package sample_questions;

import java.util.Scanner;

public class Soru_21 {
    public static void main(String[] args) {

        /*
        Bir aydaki gün sayısını bulmak için bir Java programı yazın
        (Mülakat Sorusu / Interview Sorusu / Leak Year)

        Örnek:
        Bir ay numarası girin: 2
        Bir yıl girin: 2016

        Şubat 2016'da 29 gün vardır
        ipucu:
        Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
        Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
        Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
        ipucu2:
        ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
        Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
        Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Gün sayisini hesaplamak istediginiz ayin numarasını girin : ");
        int ay = scan.nextInt();

        if (ay<= 12 && ay>0) {
            int gunSayisi;

            switch (ay) {
                case 1:
                    gunSayisi = 31;
                    System.out.println("Ocak ayındada 31 gun vardir");
                    break;
                case 2:
                    System.out.println("Hangi yıl için hesaplama yapmak istersiniz : ");
                    int yil = scan.nextInt();
                    gunSayisi = 28;
                    if (isLeapYear(yil)) {
                        gunSayisi = 29;
                    }
                    System.out.println("Şubat " + yil + "'da " + gunSayisi + " gun vardir");
                    break;
                default:
                    System.out.println("gecersiz ay numarasi");
            }
        }else {
            System.out.println("Gçersiz ay numarası");
        }

    }

    public static boolean isLeapYear (int yil) {

        boolean artikYil = false;

        if (yil>0) {
            if (yil % 4 == 0) {
                if (yil % 100 != 0) {
                    artikYil = true;
                } else if (yil % 400 == 0) {
                    artikYil = true;
                }
            }
        }
        return artikYil;
    }
}
