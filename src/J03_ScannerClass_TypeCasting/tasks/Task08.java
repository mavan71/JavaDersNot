package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


        Scanner scanner = new Scanner(System.in);

        int vize1;
        int vize2;
        int finalnot;

        System.out.print("Vize1: ");
        vize1 = scanner.nextInt();

        System.out.print("Vize2: ");
        vize2 = scanner.nextInt();

        System.out.print("Final: ");
        finalnot = scanner.nextInt();

        double sonuc = ((vize1 + vize2) / 2) * 0.3 + (finalnot * 0.7);
        System.out.print("ders notunuz: " + sonuc);
    }
}
