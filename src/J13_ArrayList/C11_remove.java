package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_remove {

    public static void main(String[] args) {

        // remove() --> list de istenen elemanı siler

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Almanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList.remove(\"Almanya\") = " + ülkeList.remove("Almanya")); // "Almaya"yı sil // true

        ArrayList<String> ülkeList2 = new ArrayList<>(Arrays.asList("Almanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList2.remove(\"Küba\") = " + ülkeList2.remove("Küba")); // false

        System.out.println("ülkeList2.remove(2) = " + ülkeList2.remove(2)); // "Amerika" yı sildi

        // trick : remove içine index alırsa silinen elemanı return eder. ancak içine elemanın ismi yazılırsa true veya false verir


        // removeAll() --> list de hepsini siler.

        ArrayList <String> isimList =  new ArrayList<>(List.of("Aydın", "Ceren", "Cihat", "İsmail", "Furkan", "Tuğba"));

        System.out.println("isimList.removeAll(isimList) = " + isimList.removeAll(isimList));// true verdi.


    }
}
