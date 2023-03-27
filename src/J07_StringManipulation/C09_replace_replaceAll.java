package J07_StringManipulation;

import java.util.Scanner;

public class C09_replace_replaceAll {
    public static void main(String[] args) {


        // raplace: metin içersindeki istenilen parçanın yerini değiştirir.sonuç string dir.


        String str ="JavaCanlar'a selam bolcana offer.";

        System.out.println(str); // JavaCanlar'a selam bolcana offer.
        System.out.println("str.replace " + str.replace("a", "*")); // J*v*C*nl*r'* sel*m bolc*n* offer.
        System.out.println("str.replace " + str.replace("can", "$")); // JavaCanlar'a selam bol$a offer


        System.out.println(str.replaceFirst("a", ":)")); // J:)vaCanlar'a selam bolcana offer.

        System.out.println(str.replace('a', '&')); // J&v&C&nl&r'& sel&m bolc&n& offer.

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler



        str = "Javacan'lara selam bolcana 123456789 && offer";

        System.out.println(str.replaceAll("\\s", "*")); //************ ***** ******* ********* ** *****
        System.out.println(str.replaceAll("\\S", "*")); // *******'**** ***** ******* ********* && *****
        System.out.println(str.replaceAll("\\w", "*")); // Javacan*lara*selam*bolcana*123456789****offer
        System.out.println(str.replaceAll("\\W", "*")); // Javacan'lara selam bolcana ********* && offer
        System.out.println(str.replaceAll("\\d", "*")); //
        System.out.println(str.replaceAll("\\D", "*"));



        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        //// isim-soyisim : M***** B*******
        //// kart no : **** **** **** 1234

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz :");
        String ad = scan.nextLine();
        System.out.print("Lütfen soyadınızı giriniz :");
        String soyAd = scan.nextLine();
        System.out.print("Lütfen 16 haneli kredi kartı numaranızı giriniz :");
        String kk= scan.nextLine();


            String yeniAd = ad.charAt(0) + ad.substring(1).replaceAll("\\w", "*");
        System.out.println("yeniAd = " + yeniAd);

            String yeniSoyAd = soyAd.charAt(0) + soyAd.substring(1).replaceAll("\\w", "*");
        System.out.println("yeniSoyAd = " + yeniSoyAd);

       String yeniKK = "**** **** ****" + kk.substring(12);
             System.out.println("yeniKK = " + yeniKK);















    }
}
