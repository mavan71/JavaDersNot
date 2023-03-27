package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q22_ForLoop_haftanınsorusu {
    public static void main(String[] args) {


        /*
     Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.
    Test Data:
    java is fun
    Beklenen Çıktı:4
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz :");
        String yazi=scan.nextLine();


        int sayac =0;

        for (int i = 0; i < yazi.length()-1 ; i++) {
            if(yazi.charAt(i) == 'a' || yazi.charAt(i) == 'e' ||
                    yazi.charAt(i) == 'ı' ||yazi.charAt(i) == 'i' ||
                    yazi.charAt(i) == 'o' || yazi.charAt(i) == 'ö' ||
                    yazi.charAt(i) == 'u' || yazi.charAt(i) == 'ü'){
                sayac++;

        }

    }System.out.println("Girilen cümledeki sesli harf sayısı : "+ sayac);
}}
