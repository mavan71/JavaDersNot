package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q20_ForLoop {
    public static void main(String[] args) {


        // Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum
        // tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int sayi1= scan.nextInt();
        System.out.print("Lütfen bir sayı daha giriniz :");
        int sayi2= scan.nextInt();
        int toplam=0;

        if (sayi1<sayi2) {
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam= toplam + sayi1;

            }System.out.println("girilen sayılarla beraber "+ sayi1 + " ve " + sayi2 + " arasındaki sayıların toplamı =" + toplam);
        } else if (sayi2 < sayi1) {
            for (int i = sayi2; i <=sayi1 ; i++) {
                toplam=toplam + sayi2;

            }System.out.println("girilen sayılarla beraber "+ sayi2 + " ve " + sayi1 + " arasındaki sayıların toplamı =" + toplam);

        }else {
            toplam =sayi1+sayi2;
            System.out.println(sayi1 + " ve " + sayi2 + " nin toplamı =" + toplam);
        }





















    }
}
