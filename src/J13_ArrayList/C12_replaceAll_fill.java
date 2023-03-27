package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C12_replaceAll_fill {

    public static void main(String[] args) {

        // replaceAll() --> list de belirli bir elemanı belirli bir elemana update eder.

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana", "Kamboçya", "Gana"));

        System.out.println("Collections.replaceAll(ülkeList,\"Gana\", \"YeniGana\") = " + Collections.replaceAll(ülkeList, "Gana", "YeniGana")); // true verdi

        System.out.println("ülkeList = " + ülkeList); //[Alamanya, Fransa, Amerika, İngiltere, YeniGana, Kamboçya, YeniGana]

        System.out.println("ülkeList.set(1,\"Nijerya\") = " + ülkeList.set(1, "Nijerya")); // set() --> verilen indexe yeni değer atar

        System.out.println("ülkeList = " + ülkeList);

        // fill() --> list de tüm elemanları istenene değere döndürür.

        Collections.fill(ülkeList, "Cerenİstan");
        System.out.println("ülkeList = " + ülkeList);



    }
}
