package J05_ifStetamentTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       // girilen bir tam sayının iki veya daha fazla basmaklı olmasını kontrol eden bir cod yazınzı.

            System.out.print("Tam sayı giriniz: ");
            int tamSayi = scan.nextInt();

        if (tamSayi >=10 || tamSayi <=-10) {
            System.out.println("sayınız en az iki basamaklı");
        }else {
            System.out.println("sayınız tek basamaklı");
        }

        System.out.print((tamSayi >=10 || tamSayi <=-10) ? "sayınız en az iki basamaklı" : "sayınız tek basamaklı");























    }
}
