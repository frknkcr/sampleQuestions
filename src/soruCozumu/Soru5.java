package soruCozumu;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Soru5 {
    /*
    5) Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun.
    Kullanicidan bir isim alin.Bu isim LinkedList'de varsa silin ve
    kullaniciya "Bu isim LinkedList'de vardi ve silindi“diye mesaj verin.
    Bu isim LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden
    silinemedi" diye mesaj verin
     */

    public static void main(String[] args) {
        LinkedList<String> lnkList = new LinkedList<>(Arrays.asList("Ali","Veli","Can","Ayşe"));
        Scanner sc = new Scanner(System.in);
        System.out.println("İsim girin");
        String isim = sc.next();
        boolean kontrol = false;

        for (String each:lnkList) {
            if (each.equalsIgnoreCase(isim)){
                kontrol = lnkList.remove(each);
                System.out.println(each+" Silindi");
                System.out.println(lnkList);
                break;
            }
        }
        if (!kontrol){
            System.out.println("Aranan isim bulunamadı");
        }
    }
}
