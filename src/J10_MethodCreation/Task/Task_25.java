package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_25 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        //task-> girilen sayını faktoriyelini print eden METHOD create ediniz

        faktoriyelBul();


    }

    private static void faktoriyelBul() {
        int faktoriyel=1;
        System.out.println("Lütfen bir sayı giriniz :");
        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            faktoriyel=faktoriyel*i;
        }
        System.out.println(sayi+ "!= "+ faktoriyel);
    }
}
