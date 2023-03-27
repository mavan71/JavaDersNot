package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q09_Break {

    public static void main(String[] args) {

           /*
    // break ve continue sadece içinde bulunduğu döngüyü etkiler.
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz:");
        int sayi=scan.nextInt();

        boolean flag =true;

        if (sayi >=2){
            for (int i = 2; i <sayi; i++) {
                if(sayi%i == 0){
                    flag = false;
                    break;
                }
                if (flag) {
                    System.out.println(sayi+ " asal sayı değildir");
                } else System.out.println(sayi + " asal sayıdır");
            }
        }else System.out.println(sayi + " asal sayı değildir");




    }
}
