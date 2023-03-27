package J05_ifStetamentTernaryOperator;

import java.util.Scanner;

public class C02ifElseStatement {
    public static void main(String[] args) {

        //task : girilen yaşın 18den büyüklüğünü kontrol edin

        Scanner scan = new Scanner(System.in);

//        System.out.print("lütfen yaşınızı giriniz :");
//        int yaş = scan.nextInt();
//
//       if (yaş > 18) {
//            System.out.println("yaşın 18'den büyük");
//        }
//
//
//        //task : girilen yaşın 18den büyüklüğünü kontrol edin, yas 18 den kücükse "büyü de gel"
//
//        System.out.print("lütfen yaşınızı giriniz");
//        int yaş1 = scan.nextInt();
//        if (yaş1 >= 18) {
//    System.out.println("yaşın 18'den büyük'");
//        }
//        else {
//            System.out.println(" büyü de gel");
//        }


//
//        System.out.print ("lütfen bir yıl değeri giriniz");
//        int yil= scan.nextInt();
//
//        if (yil <= 0) {
//            System.out.println("lütfen pozitif bir sayı giriniz \n böyle yıl mı olur ?");
//        } else {
//            if (yil % 1000 == 0) {
//                System.out.print("milenyum");
//            } else if (yil % 100 == 0) {
//                System.out.println("yuzyıl");
//            } else if (yil % 10 == 0) {
//                System.out.println("onyıl");
//            }
//
//        }
//
//
//        System.out.println("agam dewamke code calışıyor");

        System.out.println("lütfen cinsiyetiniz giriniz : ");
        String cinsiyet = scan.next();

        System.out.println("lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        if (cinsiyet.equals("erkek")) {
            if (yas< 18) {
                System.out.println("erkek çocuk");
            }else System.out.println("adam");
        }
        else if (cinsiyet.equals("kadın"))
            if (yas< 18) {
                System.out.println("kız çocuk");
            }else System.out.println("kadın");

        else {
            System.out.println("ağam bizle eylenir");
        }
    }
}
