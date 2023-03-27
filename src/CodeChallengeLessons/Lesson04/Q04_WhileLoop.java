package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q04_WhileLoop {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

         /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */

        System.out.println("Lütfen bir sayı giriniz :");
        int sayi= scan.nextInt();
        int sayac =0;

       while (sayi>0){
           if (sayi%2==1){
               System.out.println(sayi + " ");
               sayac++;
           } else {

           }
             sayi++;
       }


    }
}
