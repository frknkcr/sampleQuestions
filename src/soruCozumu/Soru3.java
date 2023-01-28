package soruCozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Soru3 {
    public static void main(String[] args) {
        /*
        3) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir
program yaziniz … (2. liste olusturmadan, gecerli liste uzerinde
islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar
dahil)
output: [23,40] (Iterator kullanilacak)
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int sayi = itr.next();
            if (!(sayi>=20 && sayi<=40)){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
