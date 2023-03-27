package CodeChallengeLessons.lesson01;

import java.util.Scanner;

public class Q08_Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.print("Lütfen bir sayı daha giriniz : ");
        int sayi2 = scanner.nextInt();
        int sum = sayi1 + sayi2;
        System.out.println("sum = " + sum);
    }



    }
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin



