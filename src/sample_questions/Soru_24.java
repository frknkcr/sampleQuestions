package sample_questions;

public class Soru_24 {
    public static void main(String[] args) {

        /*
        20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
        Örnek:
        20'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
        ipucu:
        Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir :wink:

         */
        int sayi=20;

        while (sayi >= 0){

            if (sayi%2 == 0){
                System.out.print(sayi+" ");
            }

            sayi--;
        }




    }
}
