package J05_ifStetamentTernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperatorNested {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // girilen bir tam sayı çiftse yarısını değilse "tek sayının yarısı tam olmaz yazsın.

        System.out.println("Lütfen bir tam sayı giriniz");

        int ff = scan.nextInt();

        Object sonuc = ff%2 ==0 ? ff/2 : "tek sayını yarısı tam olmaz";
        System.out.println("sonuc" +sonuc);

    }






















    }

