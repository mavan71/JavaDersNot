package J05_ifStetamentTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {

  /*  girilen sayı 0 dan büyük veya eşitse 10 dan küçüklüğünü kontrol ediniz
    10 dan kücük ise rakam değilse pozitif
    sayı 0 dan küçükse negatif sayı  print ediniz
   */

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");

        int nn= scan.nextInt();

        System.out.println((nn >= 0) ? (nn < 10 ? "rakam" : "pozitif sayı") : "negatif sayı");


        // ne kadar ? işareti varsa o kadar : vardır.
        /* java da nested bloklar app. run edildiğinde app. (uygulamayı) yavaşlatır.
                buna "time complexity" denir. bu yüzden nested bloklar mecbur kalmadıkça çok tercih edilmez
         */











    }
}
