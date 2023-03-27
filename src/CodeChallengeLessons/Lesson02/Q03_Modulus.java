package CodeChallengeLessons.Lesson02;

import java.util.Scanner;

public class Q03_Modulus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */


        System.out.println("Lütfen beş basamaklı bir tam sayı yazınız");

        int besBas = scan.nextInt();

        int ilkiki = besBas/1000;
        int sonİki = besBas%100;

        int ilkikitoplam = (ilkiki/10) + (ilkiki%10);
        System.out.println(ilkikitoplam);
        int sonikitoplam = (sonİki/10) + (sonİki%10);
        System.out.println(sonikitoplam);
        int geneltoplam = ilkikitoplam + sonikitoplam;
        System.out.println(geneltoplam);
































    }









}
