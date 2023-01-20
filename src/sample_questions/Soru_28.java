package sample_questions;

public class Soru_28 {
    public static void main(String[] args) {

        /*
            Soru-28)
            Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
            Örnek:
            Sayı: 1238
            Sayının Tersi: 8321
            İpucu:  Loop kullanabilirsiniz.
         */


        int sayi = 1238;
        String sayiStr = Integer.toString(sayi);
        StringBuilder tersSayiStr = new StringBuilder();

        for (int i = sayiStr.length() - 1; i >= 0; i--) {
            tersSayiStr.append(sayiStr.charAt(i));
        }

        int tersSayi = Integer.parseInt(tersSayiStr.toString());

        System.out.println("Sayinin ters hali: " + tersSayi);

    }
}
