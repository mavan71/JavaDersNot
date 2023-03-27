package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_sort_reverse {

    public static void main(String[] args) {

        // sort() --> list elemanlarını NATUREL sıralama yapar.

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Almanya", "Fransa", "Amerika", "İngiltere", "Gana"));
        System.out.println("ülkeList = " + ülkeList); // sort öncesi
        Collections.sort(ülkeList); // sort() --> return type void olduğu için sout çalışmaz
        System.out.println("ülkeList = " + ülkeList); // sort sonrası

        // Trick : reverse() --> list elemanlarını index sırasına göre ters sıralar.
        // reverse() --> list elemanlarını tersten sıralar


        Collections.reverse(ülkeList); // sout çalışmaz
        System.out.println("ülkeList = " + ülkeList); // index e göre sıralar..Naturel sıralamanın tersi değil!!



    }
}
