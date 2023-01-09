package sample_questions;

import java.util.Scanner;

public class Soru_13 {
    public static void main(String[] args) {

        /*

        Soru 13-)
        Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
        Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
        Ipucu:
        Switch konusunu hatırlayalım!

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter girin");
        char input = scan.next().charAt(0);

        switch (input) {
            case 'a' -> System.out.println("İsteğiniz işleniyor");
            case 'b' -> System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
            case 'c' -> System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
            default -> {
            }
        }

    }
}
