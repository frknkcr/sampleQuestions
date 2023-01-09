package sample_questions;

import java.util.Arrays;

public class Soru_35 {
    public static void main(String[] args) {

         /*
        Soru 35-)
        Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
        Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
        İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
         */
        String str5 = "Yakup";
        char[] ch = new char[str5.length()];
        ch = stringToCharMethod(str5);
        System.out.println("String ifadenin char array hali: " + Arrays.toString(ch));

    }
    public static char[] stringToCharMethod(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {

            arr[i] = str.charAt(i);

        }
        return arr;
    }
}
