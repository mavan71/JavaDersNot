package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_07 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // girilen 3 sayıdan en küçüğünü pri,nt eden method creat ediniz


        System.out.println("en küçük sayı :" + enKucukBul());


    }

    private static double enKucukBul() {
        System.out.println("1. sayıyı giriniz :");
        double a =scan.nextDouble();
        System.out.println("2. sayıyı giriniz :");
        double b =scan.nextDouble();
        System.out.println("3. sayıyı giriniz :");
        double c =scan.nextDouble();

       return (a < b ? a < c ? a : c : b < c ? b : c);
    }
}
