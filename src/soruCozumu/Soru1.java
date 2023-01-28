package soruCozumu;

import java.util.Scanner;

public class Soru1 {
    /*
        ) Kullanicidan TC kimlik numarasini isteyin. Bu kimlik
            numarasinin son rakaminin cift rakam olarak bittigini ve Tc
            kimlik numarasinin 11 haneden olustugunu kontrol eden nonstatic bir method’ ta kontrol edin.
            Aksi durumda
            IllegalArgumentException olusturun. Kontrol edeceginiz son
            rakami ve 11 haneyi ic ice try-catch kullanarak yapin. Finally
            blogunda Scanner’ i kapatin
     */
    public static void main(String[] args) {
        Soru1 s = new Soru1();
        s.tcKontrol();

    }
    void tcKontrol() throws IllegalArgumentException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tc no girin: ");

            try {
                String tc = scan.next();

                if (!(tc.length() == 11 )) {
                    throw new IllegalArgumentException("TC Kimlik Numarası 11 haneli Olmalıdır!");
                }
                try {
                    int sonH = Integer.parseInt(tc.substring(tc.length() - 1));
                    if (sonH % 2 != 0) {
                        throw new IllegalArgumentException("TC Kimlik Numarasının Son Rakamı Çift Olmalıdır!");
                    }
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage().toUpperCase());
                    tcKontrol();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                tcKontrol();
            }finally {
                scan.close();
        }
    }
}
