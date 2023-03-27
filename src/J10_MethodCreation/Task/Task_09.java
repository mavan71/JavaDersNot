package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_09 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

          /*
   Task->  Saati saniyeye çeviren  method create ediniz


    */
        kacSaniye();



    }

    private static void kacSaniye() {
        System.out.print("Lütfen saniyeye çevirmek istedğiniz saati giriniz:");
        double saat=scan.nextDouble();

        if (saat>=0){
            double saniye= saat*3600;
            System.out.println(saat + " saat " + saniye+ " saniyedir.");
        } else System.out.println("lütfen sıfırdan büyük bir değer giriniz");

    }
}
