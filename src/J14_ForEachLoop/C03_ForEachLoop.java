package J14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        // task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each
        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};

        boolean ortak=false;
        for (String a  :arr1) {
            for (String b: arr2) {
               if(a.equals(b)){
                   ortak=true;
               }
            }

        }

        System.out.println("ortak = " + ortak);


        List<String> ortakList = new ArrayList<String>();
        for (String str1 :arr1) {
            for (String str2:arr2) {
                if (str1.equals(str2)) {
                    ortakList.add(str1);
                }
            }
        }


        if (ortakList.isEmpty()) {
            System.out.println("iki listede ortak eleman yok");
        } else {
            System.out.println("iki listedeki ortak elemanlar :" + ortakList);
        }



    }
}
