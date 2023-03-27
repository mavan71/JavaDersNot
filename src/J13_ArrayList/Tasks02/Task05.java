package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Collections;

public class Task05 {

    public static void main(String[] args) {
          /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */

        String input[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        ArrayList<String>nameList=new ArrayList<String>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                nameList.add(input[i][j]);
            }

        }
        System.out.println(nameList);
        Collections.sort(nameList);
        System.out.println(nameList);


    }
}
