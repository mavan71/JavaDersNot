package J07_StringManipulation;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {



//Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz :");
        String cumle = scan.nextLine();

        System.out.println("cumle = " + cumle.replaceAll(" ", "").length());





    }
}
