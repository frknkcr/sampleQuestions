package sample_questions;

import java.util.Scanner;

public class Soru_15 {
    public static void main(String[] args) {

        /*
        Soru 15-)
        Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
        -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
        -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        Örn:
	    isim1= masa
        isim2= ali
	    Konsol => maalisa
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk ismi girin");
        String isim1 = scan.next();
        System.out.println("Ikinci ismi girin");
        String isim2 = scan.next();

        if (isim1.length()%2 == 0){

            String kelime = isim1.substring(0,isim1.length()/2) + isim2 + isim1.substring(isim1.length()/2);
            System.out.println(kelime);

        }

    }
}
