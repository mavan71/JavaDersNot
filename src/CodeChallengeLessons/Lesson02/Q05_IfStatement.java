package CodeChallengeLessons.Lesson02;

import java.util.Scanner;

public class Q05_IfStatement {
    public static void main(String[] args) {




        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen \"Y\" veya \"N\" giriniz:");

        char karakter = scan.next().charAt(0);

        if (karakter == 'Y' || karakter == 'y')  {
            System.out.print("YES");
        } else if (karakter == 'N' || karakter == 'n') {
            System.out.println("NO");
    }else
            System.out.println("lütfen  'y' veya 'n' giriniz");


    }





}
