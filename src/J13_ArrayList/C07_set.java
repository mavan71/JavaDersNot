package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_set {

    public static void main(String[] args) {

            // set() --> listin istenen index e istenen elemanını update eder.
        // şu index in şu elemanını şununla değiştir.

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList.set(3,\"Patagonya\") = " + ülkeList.set(3, "Patagonya")); // 3. indexi "patagonya" olarak değiştirdik eski elemanı return eder.

        System.out.println("ülkeList = " + ülkeList); // set sonrası [Alamanya, Fransa, Amerika, Patagonya, Gana]

      //  System.out.println("ülkeList.set(333, \"nijerya\") = " + ülkeList.set(333, "nijerya")); // Index 333 out of bounds for length




    }
}
