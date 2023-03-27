package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q04_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ece
         * output = cecece
         *
         * input = el
         * output = el
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir kelime giriniz :");

        String str = scan.nextLine();
        String sonikiHarf = str.substring(str.length() -2);

        if (str.length()>=3) {
            System.out.println(sonikiHarf + sonikiHarf + sonikiHarf );
        } else {
            System.out.println(str);
        }
















    }
}
