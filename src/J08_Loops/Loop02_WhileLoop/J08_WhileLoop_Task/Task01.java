package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

    // girilen sayıların toplamı 333 'ü geçtiğinde girilen sayı adedini ve toplamını print eden cod creat ediniz.


        Scanner scan = new Scanner(System.in);


            int sayac = 0;
            int toplamSayi= 0;

            while (toplamSayi<=333) {
                System.out.println("Lütfen bir sayı giriniz: ");
                toplamSayi+= scan.nextInt();
                sayac++;
            }
        System.out.println("yeterli!! " + sayac + " tane sayı girildi; bunların toplamı" + toplamSayi);




















    }
}
