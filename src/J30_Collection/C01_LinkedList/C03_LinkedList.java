package J30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("patlıcan kebap", "ciğer şiş", "çöp şiş", "haşhaş kebap","kilis tava", "küşleme"));

        System.out.println("ilk hali " + ll1);

        // LinkedList remove methods :

        System.out.println(ll1.remove());
        System.out.println("remove sonrası " + ll1);

        System.out.println("ll1.remove(\"çöp şiş\") = " + ll1.remove("çöp şiş"));
        System.out.println("ll1.remove(\"çöp şiş\") = " + ll1.remove("çöp şiş"));
        System.out.println("ll1.removeLast() = " + ll1.removeLast());
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst());
        System.out.println("ll1 = " + ll1);

        LinkedList <String> ll2 = new LinkedList<>(Arrays.asList("havuç dilimi", "dondurmalı irmik", "triliçe", "künefe","su muhallebisi", "hamsiköy sütlaç"));

        ll1.addAll(ll2);
        System.out.println("ll1 e ll2 eklenmiş hali " + ll1);

        ll1.removeAll(ll2);
        System.out.println("ll1den ll2 silinmiş hali" + ll1);

        System.out.println("ll2.element() = " + ll2.element()); // ilk elemanı verir

        // LinkedList get- getLast- getFirst- methods :

        System.out.println("ll2.get(3) = " + ll2.get(3)); // 3. elemanı getirir.

        System.out.println("ll2.getFirst() = " + ll2.getFirst());

        System.out.println("ll2.getLast() = " + ll2.getLast());

        LinkedList<Integer> sayiList = new LinkedList<>(Arrays.asList(1,3,4,6,7,45,59,38));

        System.out.println("sayiList.remove(3) = " + sayiList.remove(3)); // 6

        /*
        remove method parametre integer alırsa List Data type olduğunda
         method parametre obje değil index tanımlar
         */

      //  sayiList.remove(45);// CTE veririr


    }
}
