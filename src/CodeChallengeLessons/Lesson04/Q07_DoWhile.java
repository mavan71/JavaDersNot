package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q07_DoWhile {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

         /*
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" yazan programı yazınız.
     */
        char c;

        do {
            System.out.println("lütfen bir harf giriniz");
            c = scan.next().toLowerCase().charAt(0);
            System.out.println("Program çalışıyor");
        }while (c != 'x');

        System.out.println("Program bitti");



    }
}
