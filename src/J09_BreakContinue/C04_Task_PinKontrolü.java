package J09_BreakContinue;

import java.util.Scanner;

public class C04_Task_PinKontrolü {
    public static void main(String[] args) {

// Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        String dogruPin = "1234";
        int hak= 3;

        for (int i = 1; i <=hak; i++) {
            System.out.print("Lütfen pin giriniz:");
            String str = scan.next();

            if (dogruPin.equals(str)) {
                System.out.println("tebrikler! pin doğru");
                break;
            } else {
                System.out.println("Girilen pin yanlis !!" + (hak - i) + " hakkiniz kaldi");
            }


        }






































    }
}
