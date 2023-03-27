package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q11_Count {

    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir cümle yazınız: ");
        String cumle=scan.nextLine().toLowerCase();

        System.out.println("Lütfen cümlede aranacak bir karakter giriniz");
        char a = scan.next().toLowerCase().charAt(0);

        int count =0;


        for (int i = 0; i <cumle.length()-1 ; i++) {
            if (cumle.charAt(i) == a) {
                count++;
            }
        }
        System.out.println("girdiğiniz cümlede " + a + " karakteri " + count + " defa kullanılmıştır");



    }
}
