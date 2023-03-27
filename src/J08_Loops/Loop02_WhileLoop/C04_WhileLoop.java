package J08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

   // task : 3 basamaklı 4 ile tam bölünen sayıları print eden cod yazınız .


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz :");

        int sayi = scan.nextInt();


        if (sayi > 99 && sayi < 1000) {
            while (sayi <=999){
                if (sayi%4==0){
                    System.out.println(sayi+ " ");
                }
                sayi++;

            }
        }































    }
}
