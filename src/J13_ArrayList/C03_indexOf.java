package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_indexOf {

    public static void main(String[] args) {

        // indexof() --> list içinde istenen eleman var ise indexini return eder. olamayan eleman için -1 return eder.

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList.indexOf(\"Amerika'nın indexi\") = " + ülkeList.indexOf("Amerika"));

        ülkeList.add("Amerika");
        System.out.println("ülkeList = " + ülkeList);  // [Alamanya, Fransa, Amerika, İngiltere, Gana, Amerika]
        System.out.println("ülkeList.indexOf(\"Amerika\") = " + ülkeList.indexOf("Amerika")); // tekrarlı eleman sorgulandığında soldan sağa ilk bulduğu elemanın indexini verir.
        System.out.println("ülkeList.lastIndexOf(\"Amerika\") = " + ülkeList.lastIndexOf("Amerika")); //sondakinin indexini verir.




    }
}
