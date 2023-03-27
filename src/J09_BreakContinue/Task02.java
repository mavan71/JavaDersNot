package J09_BreakContinue;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {


//Task: girilen 7 tam sayının 10 ile 20 arasındakileri hariç toplamını print eden code creat ediniz.

        Scanner scan = new Scanner(System.in);
        int girilenSayi =0;
        int toplamSayi =0;


        while (girilenSayi<=7) {
            System.out.println("Lütfen bir sayı giriniz :");
            int sayi = scan.nextInt();
            girilenSayi++;

            if (sayi>=10 && sayi<=20) continue;
            toplamSayi = toplamSayi+ sayi;
        }
        System.out.println("girilen sayılardan 10 ile 20 arasında olmayanların toplamı :" + toplamSayi);





































    }

}
