package J09_BreakContinue;

import java.util.Scanner;

public class C03_Task_AsalKontrolü {
    public static void main(String[] args) {

        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz // interviev sorusu///
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz :");
        int sayi = scan.nextInt();
         boolean asalMi = true;


        for (int i = 2; i <= sayi; i++) {
            if (sayi%i==0) {
                asalMi=false;
                break;
            }
        }
        if (asalMi) {
            System.out.println("girilen sayı asal");
        } else System.out.println("girilen sayı asal değil");





















    }
}
