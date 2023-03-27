package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class Task_07_arraylist07 {

    public static void main(String[] args) {

          /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */


        List<Integer>sayiList1 = new ArrayList<>(List.of(8,7,9,6,7,11));
        List<Integer>sayiList2 = new ArrayList<>(List.of(6,7,12,3,1,11));


        System.out.println(common_values(sayiList1, sayiList2));


    }

    public static List<Integer> common_values(List<Integer>list1, List<Integer>list2) {
       List<Integer> sayiList=new ArrayList<>();
        for (int a:list1) {
            for (int b :list2) {
                if (a==b && !sayiList.contains(a)){
                    sayiList.add(a);
                }
            }

        }

        return sayiList;
    }
}
