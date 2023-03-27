package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {

    public static void main(String[] args) {

        // equals() --> iki listin hem index hem de value (değer) eşitliğini kontrol eder --true/false verir.

        ArrayList<String> ülkeList1 = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));
        ArrayList<String> ülkeList2 = new ArrayList<>(Arrays.asList("Nijerya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList1.equals(ülkeList2) = " + ülkeList1.equals(ülkeList2)); // false

        ArrayList<String> ülkeList3 = new ArrayList<>(Arrays.asList("Nijerya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList2.equals(ülkeList3) = " + ülkeList2.equals(ülkeList3)); // true

    }
}
