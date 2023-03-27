package J07_StringManipulation;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

          /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */

        System.out.print("Lütfen adınızı giriniz. :");
        String Name = scan.nextLine();
        System.out.print("Lütfen soyadınızı giriniz. : ");
        String SurName = scan.nextLine();

        System.out.println(Name.toUpperCase().charAt(0));
        System.out.println(SurName.toUpperCase().charAt(0));


    }
}
