package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz :");

        int sayi = scan.nextInt();

        int i=1;

        while (i <= sayi){
            System.out.print(i+ " ");
            i+=2;
        }

























    }
}
