package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class Task_02_arraylist2 {

    public static void main(String[] args) {

         /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */


        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("ArrayList'in elemanlarının toplamı : " + getSum(list));

    }

    private static int getSum(List<Integer> list) {
         int toplam =0;
        for (int i = 0; i < list.size(); i++) {
            toplam+=list.get(i);
        }




        return toplam;
    }
}
