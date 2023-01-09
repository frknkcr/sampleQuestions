package sample_questions;

public class Soru_36 {
    public static void main(String[] args) {

         /*
        Soru 36-)
        Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
        ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        Örnek:
        inputarr[]=   {1,2,3,4,5,6,7}
        output:         4
        İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
        Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
         */

        int[] inputArr = {1,2,3,4,5,6,7};
        int ortadakiKarakter = inputArr[inputArr.length/2];
        System.out.println("Ortadaki deger: "+ortadakiKarakter);

    }
}
