package sample_questions;

import java.util.Scanner;

public class Soru_20 {
    public static void main(String[] args) {

        /*
        Soru 20-)
        Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
        yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

        Örnek:
        giriş: ama
		çıkış: Dizede yinelenen karakterler var

        İpucu: İf Else ve Char kullanarak çözebiliriz.
         */


            Scanner scanner = new Scanner(System.in);

            System.out.print("Lütfen bir isim yazın: ");
            String isim = scanner.nextLine();

            if (isim.length() != 3) {
                System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
            } else {
                boolean ayniKarakterler = false;
                for (int i = 0; i < isim.length(); i++) {
                    for (int j = i + 1; j < isim.length(); j++) {
                        if (isim.charAt(i) == isim.charAt(j)) {
                            ayniKarakterler = true;
                            break;
                        }
                    }
                }

                if (ayniKarakterler) {
                    System.out.println("Dizede yinelenen karakterler var");
                } else {
                    System.out.println("String benzersiz karakterlere sahip");
                }
            }

    }

}
