package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_05 {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        // girilen iki sayı ve işleme göre 4 işleme göre hesaplayan methot create edniz.



        dortIslem();









    }
    static void dortIslem (){
        System.out.println("Lütfen bir sayı giriniz :");
        double sayi1= scan.nextInt();

        System.out.println("lütfen bir sayı daha giriniz : ");
        double sayi2= scan.nextInt();

        System.out.println("Lütfen yapmak istedğiniz işlemin karakterini giriniz : toplama için + \n çıkarma için - \n çarpma için * \n bölme için / :");
        char islem= scan.next().charAt(0);

        switch (islem) {
            case '+':
                topla(sayi1, sayi2);
                break;
            case '-':
                cıkar(sayi1, sayi2);
                break;
            case '*':
                carp(sayi1, sayi2);
                break;
            case '/':
                bol(sayi1, sayi2);
                break;
            default:
                System.out.println("hatalı bir giriş yaptınız");

        }

    }

     private static void topla (double sayi1, double sayi2) {
         System.out.println("sayi1+sayi2 = " + sayi1 + sayi2);

     }
    private static void cıkar (double sayi1, double sayi2) {
        System.out.println("sayi1-sayi2 = " + (sayi1 - sayi2));
    }

    private static void carp (double sayi1, double sayi2) {
        System.out.println("sayi1+sayi2 = " + sayi1 * sayi2);
    }
    private static void bol (double sayi1, double sayi2) {
        System.out.println("sayi1+sayi2 = " + sayi1/ sayi2);
    }




}
