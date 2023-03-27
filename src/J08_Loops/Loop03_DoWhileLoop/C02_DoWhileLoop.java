package J08_Loops.Loop03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {


        // girilen sayı 13 den küçük ise "ola!! kazandınız" değilse sayı girişi isteyen code crate ediniz.


        Scanner scan = new Scanner(System.in);

        int sayi=0;

        do {
            System.out.print("sayı giriniz: ");
            sayi=scan.nextInt();

        } while (sayi>=13);
        System.out.println("ola!! kazandınız");































    }
}
