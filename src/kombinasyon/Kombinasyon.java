package kombinasyon;

import java.util.ArrayList;
import java.util.Arrays;

public class Kombinasyon {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i + 1; j < arrList.size(); j++) {
                System.out.println(arrList.get(i) + " " + arrList.get(j));
            }
        }

    }
    void printCombinations(String[] arr, int index, int num, String data[], int i)
    {
        if (index == num)
        {
            for (int j=0; j<num; j++)
                System.out.print(data[j]+" ");
            System.out.println();
            return;
        }
        if (i >= arr.length)
            return;
        data[index] = arr[i];
        printCombinations(arr, index+1, num, data, i+1);
        printCombinations(arr, index, num, data, i+1);
    }
}
