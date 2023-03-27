package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q02_StringManipulation {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.



        Scanner scan = new Scanner(System.in);

        System.out.print("bir kelime giriniz.");
        String a = scan.nextLine();
        System.out.print("bir kelime daha giriniz :");
        String b = scan.nextLine();

        System.out.println(a + " " + b);
        System.out.println(a.concat(" "+ b));

        System.out.println(a.substring(1) + " " + b.substring(1));


    }
}
