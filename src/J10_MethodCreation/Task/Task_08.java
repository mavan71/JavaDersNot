package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_08 {
    static Scanner scan = new Scanner(System.in);
    static boolean output = false;
    public static void main(String[] args) {



         /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */


        System.out.println("artikMi() = " + artikMi());


    }

    private static boolean artikMi() {
        System.out.println("bir yıl giriniz:");
        int yil=scan.nextInt();
        if (yil%4==0 || yil%400==0){
           output = true;
        }
        //else System.out.println(output = false);
        return output;
    }
}
