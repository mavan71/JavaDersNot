package J08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {


// task : girilen tam sayının rakamları toplamını print eden co yazınız.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz :");

        int aa = scan.nextInt();

        int toplam = 0;

        while (aa>0){
            toplam+=aa%10;
            aa/=10;   // bir sayıyı 10 a böl çıkan sayıyı aa ya ata;

        }
        System.out.print("girilen sayının rakamlar toplamı :" + toplam);









































    }
}
