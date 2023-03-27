package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_Get {

    public static void main(String[] args) {

        //  Get()--> list de girilen indexdeki elemanı return eder.

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList.get(3) = " + ülkeList.get(3)); // İngiltere


    }
}
