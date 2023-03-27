import java.util.Scanner;

public class ifClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//       // ekrandan Alinin yaşı alınıyor, eğer 18 den büyük veya eşitse cümle içine giriyor //
////        System.out.print("Alinin yaşı :" ); int alininYasi= scan.nextInt();
////        if (alininYasi>=18) {
////            System.out.println("Ali " + alininYasi+ " yaşında bir yetişkindir.");
////        }
////        System.out.println("Code Finished!");
//
//
//        // ekrandan alınan maaş bilgisi 8250 tl'nin altındaysa "açlık sınırının altındasınız" diye uyar üzerindeyse "açlık sınırının üzerindesiniz" şeklinde uyar
////
////        System.out.print ("Lütfen maaşınızı giriniz :" );
////        int maas = scan.nextInt();
////        if (maas<8250) {
////            System.out.print (maas + "tl maaş ile açlık sınırının altındasınız");
////
////        }
////
////        if (maas>8250) {
////            System.out.print (maas + "tl maaş ile açlık sınırının üzerindesiniz");
////        }
////
////        if (maas==8250) {
////            System.out.print (maas + "tl maaş ile açlık sınırındasınız.");
//        }

        // not 0  - 44 ff
        // not 45 - 55 d
        // not 56 - 70 c
        // not 71 - 80 b
        // not 81 - 100 a

        System.out.print("Lütfen notunuzu giriniz  :" );
        int not = scan.nextInt();

        if (not <=44)  {
            System.out.print(not + " notunuz ile ff aldınız");
        }
        else if (not >44 && not <=55) {
            System.out.print (not + " notunuz ile d aldınız");
        }
        else if (not >55 && not <=70) {
            System.out.print (not + " notunuz ile c aldınız");
        }
        else if (not >70 && not <=80) {
            System.out.print (not + " notunuz ile b aldınız");
        }
        else if (not >80 && not <=100) {
            System.out.print (not + " notunuz ile a aldınız");
        }
        else {
            System.out.print("Notunuz bulunamadı");
        }






        }
}
