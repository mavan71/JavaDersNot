package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_size {

    public static void main(String[] args) {

        // size() list in eleman sayısını return eder. (verir.)


        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList.size() = " + ülkeList.size());

        ArrayList<String> cityList = new ArrayList<>();

        System.out.println("cityList.size() = " + cityList.size()); // sıfır verir.

    }
}
