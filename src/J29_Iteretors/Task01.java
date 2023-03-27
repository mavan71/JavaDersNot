package J29_Iteretors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task01 {

    public static void main(String[] args) {


/*
task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
 */

        List<Integer> list = new ArrayList<>(List.of(35,43,46,44,7,20,41,16,23,61,17));

        ListIterator<Integer> it = list.listIterator();
        int kare=0;
        while (it.hasNext()) {
            it.next();
        }

        while (it.hasPrevious()) {
            System.out.println(Math.pow(it.previous(), 2));
        }



    }
}
