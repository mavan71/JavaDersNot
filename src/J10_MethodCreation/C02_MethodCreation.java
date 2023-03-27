package J10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // task : girilen 3 sayının ortalamasını print eden Method eden cod creat ediniz.


        int toplam=0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.println(i+ " . sayısını giriniz");
            toplam+= input.nextInt();

        }

        System.out.println(ortalama(toplam));
        
        ortalama1(toplam);


    }

    private static void ortalama1(int a) {

        System.out.println(a/3);
    }

    private static int ortalama(int a) {

        return (a)/3;
    }


}
