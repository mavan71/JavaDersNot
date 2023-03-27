package J07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {


        // String içerisinde stringini kontrol eder boolean değer return eder.

        String acb = "başarı gayrete aşıktır, Java canlara selam olsun!";
        System.out.println(acb.contains("java")); // false --> çünkü büyük küçük harf duyarlıdır.
        System.out.println(acb.contains("Java")); // true --> olduğu gibi yazdık


        String acb1 = "başarı";

        System.out.println(acb1.contains(acb));
        System.out.println(acb.contains(acb1));
        System.out.println(acb.contains(acb));

        // task : girilen bir metinde istenilen kelimenin varlığını kontrol edin.

        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen bir cümle giriniz :");
        String girilen = scan.nextLine();

        String sorulan = "x";

        if (girilen.contains(sorulan)) {
            System.out.println("Lütfen 'x' karakteri kullanmayınız");
        }else System.out.println("devam");


    }
}
