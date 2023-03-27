package J07_StringManipulation;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

         /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        System.out.print("Lütfen bir cümle giriniz :");
        String birCumle = scan.nextLine();
        System.out.print("Lütfen bir tam sayı giriniz :");
        int karakter = scan.nextInt();

        if (birCumle.length()>=karakter){
            System.out.print("girdiğiniz sayıya karşılık gelen karakter :" + birCumle.charAt(karakter));
        } else System.out.print("Lütfen başka bir sayı giriniz !");




    }
}
