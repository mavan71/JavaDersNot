package J13_ArrayList.Tasks01;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Task_08_arraylist08 {


    public static void main(String[] args) {

         /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */






        List<Integer> list = new ArrayList<Integer>(List.of(5,3,4,6,7,45,87,54));




          System.out.println(secondMax(list));


    }

    public static int secondMax(List<Integer> liste) {
            int secondMax=0;
            Collections.sort(liste);
           secondMax=liste.get(liste.size()-2);

           return secondMax;
        }


}
