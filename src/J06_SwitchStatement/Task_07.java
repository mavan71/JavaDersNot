package J06_SwitchStatement;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {



       Scanner scan = new Scanner(System.in);

        // Task-> Girilen 3 basamaklı bir sayıyı harf karakteri ile print eden code create ediniz.


        System.out.println("Lütfen 3 basamaklı bir tam sayı giriniz :");
        int ucBas= scan.nextInt();

            int yuzlerBas = (ucBas/100)%100;
            System.out.println("yüzler basamağı :" + yuzlerBas);
            int onlarBas = (ucBas/10)%10;
            System.out.println("onlar basamağı :" + onlarBas);
            int birlerBas = (ucBas % 100)%10;
            System.out.println("birler basamağı :" + birlerBas);


             switch (yuzlerBas){
                 case 1:
                     System.out.println("yüz");
                     break;
                 case 2:
                      System.out.println("iki yüz");
                      break;
                 case 3:
                     System.out.println("üç yüz");
                     break;
                 case 4:
                     System.out.println("dört yüz");
                     break;
                 case 5:
                     System.out.println("beş yüz");
                     break;
                 case 6:
                     System.out.println("altı yüz");
                     break;
                 case 7:
                     System.out.println("yedi yüz");
                     break;
                 case 8:
                     System.out.println("sekiz yüz");
                     break;
                 case 9:
                     System.out.println("dokuz yüz");
                     break;
                 default:
                     System.out.println("lütfen 3 basamaklı bir sayı giriniz");
             }

             switch (onlarBas) {
                 case 1:
                     System.out.println("on");
                     break;
                 case 2:
                     System.out.println("yirmi");
                     break;
                 case 3:
                     System.out.println("otuz");
                     break;
                 case 4:
                     System.out.println("kırk");
                     break;
                 case 5:
                     System.out.println("elli");
                     break;
                 case 6:
                     System.out.println("altmış");
                     break;
                 case 7:
                     System.out.println("yetmiş");
                     break;
                 case 8:
                     System.out.println("seksen");
                     break;
                 case 9:
                     System.out.println("doksan");
                     break;


             }
                switch (birlerBas) {
                         case 1:
                             System.out.println("bir");
                             break;
                        case 2:
                         System.out.println("iki");
                             break;
                        case 3:
                        System.out.println("üç");
                            break;
                        case 4:
                          System.out.println("dört");
                            break;
                        case 5:
                            System.out.println("beş");
                            break;
                        case 6:
                             System.out.println("altı");
                            break;
                        case 7:
                             System.out.println("yedi");
                         break;
                         case 8:
                             System.out.println("sekiz");
                             break;
                         case 9:
                            System.out.println("dokuz");
                            break;

        }
































    }
}
