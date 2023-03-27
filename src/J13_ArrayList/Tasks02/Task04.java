package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {

    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' veya 'A' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList <String> isimlist = new ArrayList <>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> yeniList = new ArrayList <>();

        for (int i = 0; i < isimlist.size(); i++) {
          if (!isimlist.get(i).toLowerCase().contains("a"))  {
             yeniList.add(isimlist.get(i));
          }

        }
        System.out.println("yeniList = " + yeniList);

        isimlist.clear(); // en sonda list içi silindi.
        isimlist.addAll(yeniList);
        System.out.println("isim listesi " + isimlist);












    }
}
