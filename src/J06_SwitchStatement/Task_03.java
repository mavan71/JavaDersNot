package J06_SwitchStatement;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        System.out.println("Lütfen hangi günde olduğumuzu giriniz :\n pazartesi = 1 \n salı = 2 \n çarşamba = 3 \n perşembe = 4 \n cuma = 5 \n cumartesi = 6 \n pazar = 7");

        int gun2 = scan.nextInt();

                switch (gun2) {
                    case 1:
                        System.out.println("pazartesi");
                        break;
                    case 2:
                        System.out.println("salı");
                        break;
                    case 3:
                        System.out.println("çarşamba");
                        break;
                    case 4:
                        System.out.println("perşembe");
                        break;
                    case 5:
                        System.out.println("cuma");
                        break;
                    case 6:
                        System.out.println("cumartesi");
                        break;
                    case 7:
                        System.out.println("pazar");
                        break;
                    default:
                        System.out.println("lütfen 1 ile 7 arasında bir sayı giriniz");



                }




































    }
}
