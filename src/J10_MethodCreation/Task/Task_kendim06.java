package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_kendim06 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        //girilen sayının  polindrom sayı olup olmadığını gösteren bir method create ediniz.
        /// örn: 123321 gibi

        System.out.println(isPolidrom());


    }

    private static boolean isPolidrom() {
        System.out.println("Lütfen bir sayı giriniz");
        int a =scan.nextInt();
        int temp, tersSayi=0, kalan;
        temp=a;

        while (temp !=0){
            kalan= temp%10;
            tersSayi= tersSayi*10+kalan;
            temp/=10;
             }
          if (a == tersSayi)
              return true;
          else return false;




    }
}
