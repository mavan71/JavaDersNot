package J13_ArrayList.Tasks02;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task18 {
    public static void main(String[] args) {
        /* Task->  Verilen bir listede, istenen iki index'deki elamanların yerini
         kalici olarak degistiren bir method create ediniz

         */
        ArrayList<String> calisanlarList = new ArrayList<String>(List.of("Barış","Şermin","Nazlıcan","Bedirhan","Suphi","Bahadır"));

        System.out.println("calisanlarList = " + calisanlarList);




       yerDegistir(calisanlarList,2,4);



    }

    private static void yerDegistir(ArrayList<String> list, int index1, int index2) {
        System.out.println("list.get(index1) = " + list.get(index1));
        System.out.println("list.get(index2) = " + list.get(index2));

        list.set(index1, list.get(index2));
        list.set(index2,list.get(index1));
        System.out.println("list = " + list);
    }


}
