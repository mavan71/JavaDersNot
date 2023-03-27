package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_10_arraylist12 {

    public static void main(String[] args) {

        /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */



        List<Integer> list = new ArrayList<>(List.of(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));

       rangeBtw(list, 20, 30);


    }
    public static void rangeBtw(List<Integer>list, int min, int max) {
       List<Integer> result = new ArrayList<>();
        if (list.contains(min) && list.contains(max)) {
           for (int i=0; i<list.size(); i++) {
               if(min <=list.get(i) && list.get(i)<= max)
                    result.add((list.get(i)));
           }

       } else {
            System.out.println("verilen değerler list içinde bulunmamaktadır");
        }
            int count = result.size();
        System.out.println(count);
        System.out.println("result = " + result);


    }

}
