package J17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {

    public static void main(String[] args) {


        /*
java non-primitive(Class array list-> refrans ) data turlerinde obj kendisi değil de dataları geğişirse
obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
 */
// Task -> lis elemanları 24,20,87 iki farklı method ile list elemanlarını
//      update dip print code create ediniz.
//1. method-> with for each 2. method-> set(index,value)


        List<Integer> sayilist = new ArrayList<Integer>(Arrays.asList(24,20,87));

        System.out.println("update öncesi sayı list = " + sayilist);


        listupdate1(sayilist);

        listupdate2(sayilist);



        System.out.println("update sonrası sayı list = " + sayilist);



    }

    private static void listupdate2( List<Integer> sayilist) {
        for (int i = 0; i <sayilist.size(); i++) {
            sayilist.set(i,sayilist.get(i) - 7);
        }
        System.out.println("update2 sayilist = " + sayilist);
    }

    private static void listupdate1 ( List<Integer> sayilist) {

        for (int w:sayilist) {
            w+=10;

        }
        System.out.println("update1 sayilist = " + sayilist);
    }
}
