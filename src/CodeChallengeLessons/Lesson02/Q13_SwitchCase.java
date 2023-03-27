package CodeChallengeLessons.Lesson02;

import java.util.Scanner;

public class Q13_SwitchCase {
    public static void main(String[] args) {


        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen üç basamaklı pozitif bir tam sayı giriniz :");

        int ucBasamaklı = scan.nextInt();

        int yuzlerBas = ucBasamaklı/100;
        int onlarBas = (ucBasamaklı/10)%10;
        int birlerBas = ucBasamaklı%10;


                if (ucBasamaklı>99 && ucBasamaklı<1000){
                        switch (yuzlerBas){
                            case 1 : System.out.println("yüz"); break;
                            case 2 : System.out.println("iki yüz"); break;
                            case 3 : System.out.println("üç yüz"); break;
                            case 4 : System.out.println("dört yüz"); break;
                            case 5 : System.out.println("beş yüz"); break;
                            case 6 : System.out.println("altı yüz"); break;
                            case 7 : System.out.println("yedi yüz"); break;
                            case 8 : System.out.println("sekiz yüz"); break;
                            case 9 : System.out.println("dokuz yüz"); break;
                        } switch (onlarBas){
                            case 1 : System.out.println("on"); break;
                            case 2 : System.out.println("yirmi"); break;
                            case 3 : System.out.println("otuz"); break;
                            case 4 : System.out.println("kırk"); break;
                            case 5 : System.out.println("elli"); break;
                            case 6 : System.out.println("altmış"); break;
                            case 7 : System.out.println("yetmiş"); break;
                            case 8 : System.out.println("seksen"); break;
                            case 9 : System.out.println("doksan"); break;
                        } switch (birlerBas){
                        case 1 : System.out.println("bir"); break;
                        case 2 : System.out.println("iki"); break;
                        case 3 : System.out.println("üç"); break;
                        case 4 : System.out.println("dört"); break;
                        case 5 : System.out.println("beş"); break;
                        case 6 : System.out.println("altı"); break;
                        case 7 : System.out.println("yedi"); break;
                        case 8 : System.out.println("sekiz"); break;
                        case 9 : System.out.println("dokuz"); break;
                        }

                } else System.out.println("lütfen üç basamaklı bir sayı giriniz!!");































    }





}