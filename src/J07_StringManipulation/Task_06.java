package J07_StringManipulation;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

         /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        System.out.print("Lütfen bir cümle yazınız : ");
        String cumle = scan.nextLine();

        System.out.println(cumle.substring(0, cumle.length() - 1));



















    }
}

