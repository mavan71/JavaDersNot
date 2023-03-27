package J08_Loops.Loop03_DoWhileLoop.Task;

import java.util.Scanner;

public class Task_DoWhileLoop_Kendim {
    public static void main(String[] args) {



        // örnek :  negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden çift sayıları toplayan code  do while yöntemi ile create ediniz.


        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;

        do {
            System.out.println("Lütfen bir sayı giriniz :");
            sayi= scan.nextInt();
            if (sayi%2==0){
            toplam+= sayi;
            }
        }while (sayi>0);

        System.out.println("Grilen çift sayıların toplamı :" + toplam);

















    }
}
