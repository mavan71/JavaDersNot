package J06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        // girilen ay numarasına göre ayın ismini print eden cod yazınız//

        System.out.print("Lütfen yıl içindeki ay sayısından birini giriniz :");

        int aySay = scan.nextInt();

                switch (aySay) {
                    case 1:
                        System.out.println("ocak");
                    break;
                    case 2:
                        System.out.println("şubat");
                    break;
                    case 3:
                        System.out.println("mart");
                    break;
                    case 4:
                        System.out.println("nisan");
                        break;
                    case 5:
                        System.out.println("mayıs");
                        break;
                    case 6:
                        System.out.println("haziran");
                        break;
                    case 7:
                        System.out.println("temmuz");
                        break;
                    case 8:
                        System.out.println("ağustos");
                        break;
                    case 9:
                        System.out.println("eylül");
                        break;
                    case 10:
                        System.out.println("ekim");
                        break;
                    case 11:
                        System.out.println("kasım");
                        break;
                    case 12:
                        System.out.println("aralık");
                        break;
                    default:
                        System.out.println("lütfen 1-12 arası bir sayı giriniz");


                }


        System.out.println("code cıncık");




































    }
}
