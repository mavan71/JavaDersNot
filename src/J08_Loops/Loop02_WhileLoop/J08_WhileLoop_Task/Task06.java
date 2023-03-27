package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {


         /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int num = rnd.nextInt(100) + 1;
        System.out.println("num = " + num);
        int tahmin = 0;
        int sayac = 0;
        System.out.print("1- 100 arasındaki sayıyı tahmin ediniz: ");
        while (num != tahmin) {
            tahmin = scan.nextInt();
            if(num < tahmin) {
                System.out.print("Daha kucuk bir sayi tahmin ediniz.");
            }else if(num > tahmin) {
                System.out.print("Daha buyuk bir sayi tahmin ediniz.");
            }
            sayac++;
        }
        System.out.println(sayac + ".tahminde sayıyı buldunuz:)");




        }

    }

