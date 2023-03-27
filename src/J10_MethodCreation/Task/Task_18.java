package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_18 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/




        dikUcgenMi();





    }

    private static void dikUcgenMi() {

        System.out.println("Lütfen 1. kenar uzunluğunu giriniz:");
        int a= input.nextInt();
        System.out.println("Lütfen 2. kenar uzunluğunu giriniz:");
        int b = input.nextInt();
        System.out.println("Lütfen 3. kenar uzunluğunu giriniz:");
        int c = input.nextInt();

       if (a>=b && a>=c) {
           if (a*a==b*b+c*c){
               System.out.println("dik üçgendir");
           } else
               System.out.println("dik üçgen değildir.");
       }

       if (b>=c && b>=a){
           if (b*b==c*c+a*a){
               System.out.println("dik üçgendir");
           } else System.out.println("dik üçgen değildir.");
       }

       if (c>=a && c>=b){
           if (c*c==a*a+b*b){
               System.out.println("dik üçgendir");
           } else System.out.println("dik üçgen değildir");
       }
    }
}
