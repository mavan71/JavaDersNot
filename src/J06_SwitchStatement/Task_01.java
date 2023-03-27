package J06_SwitchStatement;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {


        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Bir tam sayı giriniz =");
        int sayi = scan.nextInt();


        int onlarBasamagi = (sayi/10)%10;

        System.out.println("onlar basamağı :"  + onlarBasamagi);

            switch (onlarBasamagi) {
                    case 0:
                        System.out.println("onlar basamağındaki sayı : sıfır");
                    break;
                    case 1:
                    System.out.println("onlar basamağındaki sayı : bir");
                    break;
                    case 2:
                    System.out.println("onlar basamağındaki sayı : iki");
                    break;
                    case 3:
                    System.out.println("onlar basamağındaki sayı : üç");
                    break;
                    case 4:
                    System.out.println("onlar basamağındaki sayı : dört");
                    break;
                    case 5:
                    System.out.println("onlar basamağındaki sayı : beş");
                    break;
                    case 6:
                    System.out.println("onlar basamağındaki sayı : altı");
                    break;
                    case 7:
                    System.out.println("onlar basamağındaki sayı : yedi");
                    break;
                    case 8:
                    System.out.println("onlar basamağındaki sayı : sekiz");
                    break;
                    case 9:
                    System.out.println("onlar basamağındaki sayı : dokuz");
                    break;
                default:
                    System.out.println("lütfen bir tam sayı giriniz");
            }





































    }
}
