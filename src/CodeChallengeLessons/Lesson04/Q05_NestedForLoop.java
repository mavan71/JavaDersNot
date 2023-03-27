package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q05_NestedForLoop {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        /// girilen sayı kadar satır ve sütunu olan sağa dayalı yıldızlı üçgen oluşturun

        System.out.println("Lütfen bir sayı giriniz");
        int a=scan.nextInt();

        dikUcgenCiz(a);






    }

    private static void dikUcgenCiz(int satir) {

        for (satir = 1; satir <=5 ; satir++) {
            for (int bosluk = 5-satir; bosluk >0 ; bosluk--) {
                System.out.print(" ");
                }
            for (int sütun = 1; sütun <=satir ; sütun++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
