package J05_ifStetamentTernaryOperator;

import java.util.Scanner;

public class C08_TernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        /*
Task-> Girilen  ürün miktarını ve ürünün birim fiyatını için Eğer urun miktarı 100 den fazla ise
      %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
*/

        System.out.print("Lütfen ürün miktarını giriniz :");
        double miktar = scan.nextDouble();
        System.out.print("Lütfen ürünün birim fiyatını giriniz : ");
        double fiyat = scan.nextDouble();

        System.out.println(miktar > 100 ? fiyat * 0.67*miktar : miktar*fiyat);


    }
}
