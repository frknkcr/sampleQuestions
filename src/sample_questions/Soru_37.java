package sample_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_37 {
    public static void main(String[] args) {

        /*
        Soru 37-)
        --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
        (Eliminate duplicates)
        ENG:
        Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
        On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
        ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
         */

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            System.out.println("Array'e eklemek icin "+ (i) +". sayiyi girin :");
            list.add(scan.nextInt());
        }
        System.out.println("Olusturdugunuz list: "+list);
        eliminateDuplicates(list);
    }

    public static void eliminateDuplicates(List<Integer> list){
        ArrayList<Integer> benzersizList = new ArrayList<>();
        for (int each:list) {
            if (!benzersizList.contains(each)){
                benzersizList.add(each);
            }
        }
        System.out.println("Benzersiz list: "+ benzersizList);
    }
}
