package sample_questions;

public class Soru_34 {
    public static void main(String[] args) {


         /*
        Soru 34-)
        Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

        Örnek
        String str : ade1r4d3
        Int toplam : 8
        İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
        Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
         */


        String str4 = "ade1r4d3";
        stringArrayRakamToplami(str4);

    }
    public static void stringArrayRakamToplami(String str) {

        str = str.replaceAll("\\D", "");
        int sayi = Integer.parseInt(str);
        int toplam = 0;

        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;

        }
        System.out.println("String ifadedeki rakamlar toplami: "+toplam);
    }
}
