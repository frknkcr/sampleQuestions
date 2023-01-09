package sample_questions;

public class Soru_33 {
    public static void main(String[] args) {

        /*
        Soru 33-)
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Coding is greate.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
         */

        String str2 = "\"Coding is greate.\"";

        String[] arr3 = str2.split("");

        int x = 0;
        String[] tersArr3 = new String[arr3.length];

        for (int i = arr3.length - 1; i >= 0; i--) {

            tersArr3[x] = arr3[i];
            x++;
        }

        for (int i = 0; i < tersArr3.length; i++) {

            System.out.print(tersArr3[i]);

        }
    }
}
