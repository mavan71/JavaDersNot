package CodeChallengeLessons.Lesson04;

import java.util.Arrays;

public class Q14_Arrays {

    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */


       String strArr[]= {"HeySiri"};

         Arrays.fill(strArr, "ByeSiri");
        System.out.println(Arrays.toString(strArr));




    }
}
