package sample_questions;

public class Soru_30 {
    public static void main(String[] args) {

         /*
        Soru 30-)
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
        Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıp konteynıra atacaksınız
        bu yüzden iç içe loop kullanmak mantıklı duruyor
         */

        String str = "Javacokkolay";
        String yinelenenHarfler = "";

        String charToString = "";

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    charToString = String.valueOf(str.charAt(i));

                    if (!(yinelenenHarfler.contains(charToString))) {
                        yinelenenHarfler += str.charAt(i);
                    }
                }
            }
        }
    }
}
