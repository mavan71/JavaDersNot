package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_kendim01 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // girilen iki sayıyı çarparak print eden method create edniz.

        System.out.println("carpım() = " + carpım());


    }

    private static int carpım() {
        System.out.println("Lütfen bir sayı giriniz:");
        int a = scan.nextInt();
        System.out.println();
        System.out.println("Lütfen bir sayı daha giriniz :");
        int b = scan.nextInt();

        return a*b;

    }
}
