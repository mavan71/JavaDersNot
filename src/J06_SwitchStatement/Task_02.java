package J06_SwitchStatement;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız


      Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen hangi günde olduğumuzu giriniz :\n pazartesi = 1 \n salı = 2 \n çarşamba = 3 \n perşembe = 4 \n cuma = 5 \n cumartesi = 6 \n pazar = 7");

        int gun = scan.nextInt();

        int yuzGunSonra = (gun + (100%7))%7;

            switch (yuzGunSonra) {
                case 1:
                        System.out.println("100 gün sonra : pazartesi");
                        break;
                        case 2:
                        System.out.println("100 gün sonra : salı");
                        break;
                        case 3:
                        System.out.println("100 gün sonra : çarşamba");
                        break;
                        case 4:
                        System.out.println("100 gün sonra : perşembe");
                        break;
                        case 5:
                        System.out.println("100 gün sonra : cuma");
                        break;
                        case 6:
                        System.out.println("100 gün sonra : cumartesi");
                        break;
                        case 7:
                        System.out.println("100 gün sonra : pazar");
                        break;
                default:
                    System.out.println("lütfen 1 ile 7 arasında bir sayı giriniz");
            }











































    }
}
