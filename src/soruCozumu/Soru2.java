package soruCozumu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Soru2 {
    /*
    2) Bir adet checked, bir adet de unchecked manuel exception
    olusturun. Bu exception' larinizi calistiracak OZGUN bir
    kodlama yapin. Checked exception’ inizda throws, unchecked
    exception’ inizda try-catch-finally kullanin.
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi girin");

        try {
            int sayi = scan.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Rakam girin");
        }finally {
            System.out.println("güle güle");
        }

        FileInputStream fis = new FileInputStream("src/t108_ders28_exceptions/main.txt");

    }
}
