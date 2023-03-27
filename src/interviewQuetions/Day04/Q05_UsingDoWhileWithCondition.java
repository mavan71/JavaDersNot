package interviewQuetions.Day04;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
        Lost onunca yaz ve çık
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi;
        do {
            System.out.println("Lütfen bir tam sayı giriniz");
            sayi = scan.nextInt();
            if (sayi < 100) {
                System.out.println("won!!");
            }
        } while (sayi < 100);
            System.out.println("you LOST!!");
    }
}
