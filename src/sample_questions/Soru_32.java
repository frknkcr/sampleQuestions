package sample_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_32 {
    public static void main(String[] args) {

         /*
        Soru 32-)
        Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("array icin uzunluk girin");
        int arrayLength = scan.nextInt();
        int[] arr2 = new int[arrayLength];

        for (int i = 0; i < arr2.length; i++) {

            System.out.println("Eklemek istediginiz sayi girin: ");
            arr2[i] = scan.nextInt();
        }

        int j = 0;
        int[] arr2Reverse = new int[arrayLength];

        for (int i = arrayLength - 1; i >= 0; i--) {

            arr2Reverse[j] = arr2[i];
            j++;
        }

        System.out.println("Olusturulan array: " + Arrays.toString(arr2));
        System.out.println("Reverse edilen hali: " + Arrays.toString(arr2Reverse));

    }
}
