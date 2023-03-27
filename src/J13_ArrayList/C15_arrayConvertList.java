package J13_ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_arrayConvertList {

    public static void main(String[] args) {

        /// Trick : array den liste çevirme yapıldığında list kaynağı array olduğu için list array gibi davranır.
        // eleman ekleme çıkarma yapılamaz.. add () ve remove () çalışmaz

String ülkeArr [] = {"Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"};
List <String>ulkeList = Arrays.asList(ülkeArr);
        System.out.println("Arrays.toString(ülkeArr) = " + Arrays.toString(ülkeArr));
        System.out.println("ulkeList = " + ulkeList);

   //     System.out.println("ulkeList.add(\"Haluk\") = " + ulkeList.add("Haluk"));   // RTE verir
  //      System.out.println("ulkeList.remove(\"Haluk\") = " + ulkeList.remove("Haluk")); // RTE verir


    }
}
