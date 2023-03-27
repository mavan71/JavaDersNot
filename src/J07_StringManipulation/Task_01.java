package J07_StringManipulation;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz


        System.out.print("Lütfen bir cümle yazınız :");
        String cumle = scan.nextLine();
        System.out.println("cumle.contains(\" \") = " + cumle.contains(" "));


    }
}
