package CodeChallengeLessons.Lesson05;

import java.util.Arrays;

public class Q02_Arrays {


    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

            String strArr[]= {"Verilen bir cumledeki bosluklar haric character sayisini bulunuz."};
          //  strArr.toString().replaceAll("\\s", "");
        System.out.println("Arrays.toString(strArr).replaceAll(\"\\\\s\", \"\") = " + Arrays.toString(strArr).replaceAll("\\s", ""));
       int sayi=     Arrays.toString(strArr).length();
        System.out.println("sayi = " + sayi);


    }

}
