package J30_Collection.C02_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task01 {

    public static void main(String[] args) {

        /* Task->
 Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
 main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
 */
        String arr2 [] ={"çarşamba", "perşembe", "cuma","pazar"};
        System.out.println(convertArray(arr2));
        HashSet<String> hs= new HashSet<String>(convertArray(arr2));
        LinkedHashSet<String> lhs = new LinkedHashSet<>(convertArray(arr2));
        TreeSet<String> ts= new TreeSet<>(convertArray(arr2));

        System.out.println(hs); // hurra set
        System.out.println(lhs);// erken gelen oturur set
        System.out.println(ts);// alfabetik sıra


    }

    private static ArrayList<String> convertArray(String arr []){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        // ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));  ****cıncık kod****
        // return new ArrayList<>(Arrays.asList())
        return list;
    }
}
