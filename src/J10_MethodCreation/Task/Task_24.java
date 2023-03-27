package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_24 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :1, 1, 2, 3, 5, 8, 13, 21, 34
*/

        fibonacci();



    }

    private static void fibonacci() {
        System.out.println("Lütfen bir tam sayı giriniz: ");
        int sayi=   scan.nextInt();
        int num1=0;
        int num2=1;

        for (int i = 1; i <=sayi ; ++i) {
            System.out.print(num1+" ");
            int toplam=num1+num2;
            num1=num2;
            num2=toplam;

        }


    }
}
