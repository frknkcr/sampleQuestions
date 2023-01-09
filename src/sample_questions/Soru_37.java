package sample_questions;

import java.util.Arrays;
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
        int i = 0;

        int[] arr = new int[10];
        for (int each: arr) {
            System.out.println("10 tane sayigirin: ");
            int input = scan.nextInt();
            if (!(arr[i] == each)) {
                arr[i] = input;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
    public static int[] eliminateDuplicates(int[] list){
        int[] benzersizArr = new int[list.length];


        return benzersizArr;
    }
}
