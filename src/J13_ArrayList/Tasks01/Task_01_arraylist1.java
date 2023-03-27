package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_01_arraylist1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
 /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */


        ArrayList <String> list = new ArrayList<String>(List.of("Orange" , "Kiwi" , "Peach", "Banana" , "Orange"));

        System.out.println(getCount(list, "Orange"));


    }

    private static int getCount(ArrayList<String> list, String str) {
      int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(str)) {
                count++;
            }

        }

        return count;
    }
}
