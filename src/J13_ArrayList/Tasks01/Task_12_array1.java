package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_12_array1 {


    public static void main(String[] args) {

 /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.

    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

        ArrayList <Integer> list = new ArrayList <>(List.of(1,2,3,4,5,6));
        System.out.println("duplicate(list) = " + duplicate(list));


    }
    public static boolean duplicate(ArrayList<Integer> sayilist) {
        boolean tekrar = false;
        Collections.sort(sayilist);
        for (int i = 1; i < sayilist.size(); i++) {
            if(sayilist.get(i-1)== sayilist.get(i)) {
                tekrar = true;
            }


            }
        return tekrar;
        }







        }




