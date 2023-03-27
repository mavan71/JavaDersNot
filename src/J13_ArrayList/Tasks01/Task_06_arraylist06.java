package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class Task_06_arraylist06 {

    public static void main(String[] args) {

         /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

        List<Integer> list = new ArrayList<>(List.of(5,4,6,2,1));

        System.out.println(hillNum(list));


    }

    public static int hillNum(List<Integer> arrayList) {
        int a=0;
        for (int i = 1; i <arrayList.size()-1; i++) {
            if ((arrayList.get(i)<arrayList.get(i-1)) && arrayList.get(i)>arrayList.get(i+1)){
                a=arrayList.get(i);
            }

        }

       return a;
    }
}
