package J29_Iteretors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {

    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList<>(Arrays.asList(34, 35, 41, 58, 31, 7, 38, 61, 9));

        System.out.println("l1'in ilk hali " + l1);

        ListIterator<Integer> itr1 = l1.listIterator(); // step1

        while (itr1.hasNext()) {// pointer sona iletilir
            itr1.next();
        }

        // task01--> l1 sondan başa doğru print ediniz

        System.out.println("************** task 01 ********************");

        while (itr1.hasPrevious()) { // step2--> pointer sondan başa doğru ilerler
            System.out.print(itr1.previous() + " ");
        }

        List<String> l2 = new ArrayList<>(Arrays.asList("triliçe", "güllaç", "cennet çamuru", "bal-kaymak"));

        // task02--> l2 listin sonuncusuna :-) update edip print eden code create ediniz.

        System.out.println();

        System.out.println("************** task 02 ********************");

        ListIterator<String> itr2 = l2.listIterator();

        while (itr2.hasNext()) {
            itr2.next();
            if (itr2.hasNext() == false) {
                itr2.previous();// pointer öncesi son elemanı verir
                itr2.set(itr2.next() + ":-)");
            }
        }
        System.out.println(l2);
    }
}
