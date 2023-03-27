package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q08_Continue {

    public static void main(String[] args) {
        /*
    // break ve continue sadece içinde bulunduğu döngüyü etkiler.
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz");
        String s = scan.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a' || s.charAt(i)==' ')
                continue;
            System.out.print(s.charAt(i) + " " );
        }


    }
}
