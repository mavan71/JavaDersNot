package J07_StringManipulation;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */

        System.out.print("Lütfen adınızı giriniz :");
        String ad = scan.nextLine().toUpperCase();

        System.out.println(ad.length() == 3 ? ad.charAt(0) != ad.charAt(1) && ad.charAt(0) != ad.charAt(2) && ad.charAt(1) != ad.charAt(2) ? "harfler farklı" : "harfler eşit" : "3 harfli değil");


    }
}
