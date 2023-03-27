package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

// task-- girilen iki sayının eşitliğini kontrol eden method create ediniz.

       Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        int sayi1= input.nextInt();

        System.out.println("2. sayıyı giriniz:");
        int sayi2= input.nextInt();


        System.out.println("esit Mi = " + esitMi(sayi1, sayi2));
        esitKontrol(45,55);


    }

    public static boolean esitMi(int sayi1, int sayi2) {
        boolean esit=true;
        if (sayi1==sayi2){

         } else esit = false;

        return esit;
    }

    public static void esitKontrol (int a, int b) {
        if (a==b){
            System.out.println("sayılar eşit");
        }else System.out.println("sayılar eşit değil");
    }

}
