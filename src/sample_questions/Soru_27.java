package sample_questions;

public class Soru_27 {
    public static void main(String[] args) {

        /*
        Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
        ipucu: For Loop ve Char kullanarak çözebilirsiniz.
        örnek:
        Ascii value of a = 97
        Ascii value of b = 98
        Ascii value of c = 99
        Ascii value of d = 100
         */

        int deger = 0;

        for (char i = 'a'; i <= 'z' ; i++) {

            deger = i;
            System.out.println("Ascii value of "+ i +" = "+deger);

        }


    }
}
