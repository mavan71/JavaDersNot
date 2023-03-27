package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_22 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        /* task->
      katsayıları a,b,c  verilen 1 bilinmeyenli ax^2 + bx + c denklemin köklerini print eden METHOD create ediniz.

      trick-> kokler : (-b +/- karekök(delta)) / (2*a)
        delta = b*b - 4*a*c
        delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        delta = 0 => 1 tane kök vardır x = -b/2a
        delta < 0 ise kök yoktur.
   */
        kokBul();



    }

    private static void kokBul() {
        System.out.println("Lütfen denklemin katsayılarını giriniz \n a katsayısı :");
        double a = scan.nextDouble();
        System.out.println("b katsayısını giriniz :");
        double b = scan.nextDouble();
        System.out.println("c katsayısını giriniz :");
        double c = scan.nextDouble();

        double delta = b*b - (4*a*c);
        if (delta < 0) {
            System.out.println("denlemin kökü bulunmamaktadır");
        } else if (delta == 0) {
            double x = (-b) / (2*a);
            System.out.println("denklemin kökü" + x);
        } else {
            double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
            double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            System.out.println("Girdiğiniz denklemde 2 adet kök vardır = " + (x1) + " ve " + (x2));
        }

    }
}
