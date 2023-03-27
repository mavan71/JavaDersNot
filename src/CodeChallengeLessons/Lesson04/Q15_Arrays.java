package CodeChallengeLessons.Lesson04;

import java.util.Arrays;

public class Q15_Arrays {

    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        istenenToplam();








    }

    private static void istenenToplam() {
        int arr [] = {5,7,-6,4,2,15,3,8,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j]==9){
                    System.out.println("sayı grupları :"+ arr[i] + " & " + arr[j]);
                }

            }

        }

    }
}
