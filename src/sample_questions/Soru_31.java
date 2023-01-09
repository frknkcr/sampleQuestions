package sample_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_31 {
    public static void main(String[] args) {

        /*
        Soru 31-)
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Olusturmak istediginiz array uzunlugunu girin");

        int lengt = scan.nextInt();

        if (!(lengt <= 0)) {
            String[] arr1 = new String[lengt];

            for (int i = 0; i <= arr1.length - 1; i++) {

                System.out.println("Array'e eklemek için string bir ifade girin");

                arr1[i] = scan.next();
            }

            System.out.println(Arrays.toString(arr1));

        } else {
            System.out.println("gecersiz deger");
        }

    }
}
