package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_17 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        


        terstenYaz();
        
        
        
        
        
    }

    private static void terstenYaz() {
        System.out.println("Lütfen dört haneli bir tam sayı giriniz :");
        int sayi= input.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.print(sayi%10);
            sayi = sayi/10;
            
        }

    }







}
