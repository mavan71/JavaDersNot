package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {


        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */


        Scanner scan = new Scanner(System.in);

        System.out.print("Bir kelime giriniz :");

        String a = scan.next();

        boolean xyzIceriyorMu = false;

        if (a.contains("xyz")) {
            xyzIceriyorMu= true;
            System.out.println(xyzIceriyorMu);
        }else {
            System.out.println(xyzIceriyorMu);
        }





















    }
}
