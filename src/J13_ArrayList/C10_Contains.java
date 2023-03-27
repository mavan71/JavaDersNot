package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C10_Contains {

    public static void main(String[] args) {


        // contains() --> list de istenen elemanın varlığını kontrol eder. true/false değer verir

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList.contains(\"Amerika\") = " + ülkeList.contains("Amerika")); // true

        System.out.println("ülkeList.contains(\"Ankara\") = " + ülkeList.contains("Ankara")); // false


    }
}
