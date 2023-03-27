package J05_ifStetamentTernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");

//        TASK :
//        Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
//        degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
//        degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.

        int num1= scan.nextInt();

        String mm = ((num1>999 && num1<=10000 ? "dört basmaklı" : (num1%2==0 ? "dört basamaklı olmayan çift sayı" : "dört basamaklı olmayan tek sayı")));

        System.out.println(mm);

    }


}

















