package kombinasyon;

import java.util.ArrayList;
import java.util.Arrays;

public class Kombinasyon {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i + 1; j < arrList.size(); j++) {
                System.out.print(arrList.get(i) + " " + arrList.get(j)+", ");
            }
        }
    }
}
