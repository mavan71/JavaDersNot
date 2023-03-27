package J06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCaseATM {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // TASK_ATM = bakiye 1000 $ olan bir banka hesabı için bakiye öğrenme , para çekme , para yatırma ve çıkış işlemlerini yapıldığı bir app code creat ediniz.

        int bakiye = 1000;
        System.out.println("*****");
        System.out.println("$$$$ JAVA BANK ATM YE HOŞ GELDİNİZ $$$$");

        System.out.println("Lütfen ne yapmak istediğinizi kodlayınız: \n bakiye sorma = 1 \n Para Yatırma = 2 \n Para Çekme = 3 \n Çıkış = 4");

        int tercih  = scan.nextInt();

                switch (tercih) {
                    case 1:
                        System.out.println("bakiyeniz :" + bakiye);
                    break;
                    case 2:
                        System.out.println("lütfen miktarı giriniz");
                        int yatan = scan.nextInt();
                        bakiye +=  yatan;
                        System.out.println("yeni bakiyeniz " + bakiye );
                    break;
                    case 3:
                        System.out.println("çekeceğiniz para miktarını giriniz :");
                        int cekilen = scan.nextInt();
                        if (cekilen <= bakiye) {
                            bakiye -= cekilen;
                            System.out.println("yeni bakiyeniz " + bakiye);
                        }else System.out.println("bakiyenizden fazla para çekemezsiniz!!");
                        break;
                    case 4 :
                        System.out.println("iyi günler dileriz");
                        break;
                    default:
                        System.out.println("lütfen tekrar deneyiniz");





                }
        System.out.println("code cıncık");



































    }
}
