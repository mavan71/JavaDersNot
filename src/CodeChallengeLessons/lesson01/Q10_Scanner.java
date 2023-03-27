package CodeChallengeLessons.lesson01;

import java.util.Scanner;

public class Q10_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 1. Vize notunuzu giriniz: ");
        int vizeNot = scanner.nextInt();
        System.out.print("Lütfen 2. Vize notunuzu giriniz :");
        int vizeNot2 = scanner.nextInt();
        int vizeOrt = (vizeNot + vizeNot2)/2;
        System.out.print("Lütfen Final notunuzu giriniz: ");
        int finalNot = scanner.nextInt();
        double sonNot = ((0.30*vizeOrt) + (0.7*finalNot));
        System.out.println("Son notunuz: " + sonNot);




    }
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */



}
