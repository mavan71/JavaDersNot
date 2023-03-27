package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q02_WhileDoWhile {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.


        System.out.println(rakamlarToplami());


    }

    private static int rakamlarToplami() {
        System.out.println("Lütfen bir sayı giriniz :");
        int sayi=scan.nextInt();
        int toplam=0;

        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }

        return toplam;
    }
}
