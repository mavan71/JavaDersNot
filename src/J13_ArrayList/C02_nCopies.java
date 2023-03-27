package J13_ArrayList;

import java.util.*;

public class C02_nCopies {

    public static void main(String[] args) {


        // nCopies(int n, Obj)--> n elemanlı sabit obj den oluşan list tanımlar.

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        ArrayList <String> isimList =  new ArrayList<>(List.of("Aydın", "Ceren", "Cihat", "İsmail", "Furkan", "Tuğba"));

        ArrayList <String> yeniList = new ArrayList<>(Collections.nCopies(7, ("JavaTar"))); // 7 javatar elemanlı list tanımlandı

        System.out.println(yeniList);

        // addAll() -->bir liste istenen başka bir list i ekler
        System.out.println(ülkeList);
        ülkeList.addAll(isimList); // ülke listin sonuna isim list eklendi
        System.out.println(ülkeList);

        yeniList.addAll(3,ülkeList);
        System.out.println(yeniList);

        // task: 1'den 10'a kadar sayıları list yapıp print eden code create ediniz.

        ArrayList <Integer> sayilar = new ArrayList<>();

                for (int i = 1; i <=10 ; i++) {
                    sayilar.add(i);

                }


        System.out.println("sayilar = " + sayilar);

                

















    }
}
