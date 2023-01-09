package sample_questions;

import java.util.Scanner;

public class Soru_14 {
    public static void main(String[] args) {

        /*
        Soru 14-)
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
        Ipucu:
        IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 harfli bir isim girin : ");
        String isim = scan.next();

        if (isim.length() == 3){

            if (isim.charAt(0) == isim.charAt(1) || isim.charAt(1) == isim.charAt(2) ||
                isim.charAt(0) == isim.charAt(2)) {
                System.out.println("Yinelenen karakterler var");
            }else {
                System.out.println("Dize benzersiz");
            }

        }else {
            System.out.println("Bu isim 3 harfli degil");
        }

    }
}
