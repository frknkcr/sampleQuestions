package sample_questions;

public class Soru_25 {
    public static void main(String[] args) {

        /*

        Soru 25-)
        Alfabeyi konsola yazdırın.
        örnek:
        a b c .. .. .. .. y z
        ipucu: char kullanmak iyi bir fikir olabilir

         */

        for (int i = 97; i <= 122; i++) {

            int sayi = i;
            char karakter = (char) sayi;
            System.out.print(karakter+" ");
        }
        System.out.println();

        for (char harf = 'a'; harf <= 'z'; harf++) {
            System.out.print(harf + " ");
        }



    }
}
