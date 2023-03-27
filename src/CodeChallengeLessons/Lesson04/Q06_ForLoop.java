package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q06_ForLoop {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */


        int toplam=0;
        int sayac=0;
        for (int i = 0; i <= 100; i++) {
            System.out.println("Lütfen sayı giriniz:");
            sayac++;
            int sayi=scan.nextInt();
            toplam+=sayi;

            if (toplam >= 100) {
                System.out.println(sayac+ " adet sayı girdiniz bu kadar yeter");
                System.out.println("toplam: " + toplam);
                break;
            }
            System.out.println(toplam);
        }

    }
}
