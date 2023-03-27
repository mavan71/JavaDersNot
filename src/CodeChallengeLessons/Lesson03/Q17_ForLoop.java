package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q17_ForLoop {
    public static void main(String[] args) {

      /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	    ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	    hesaplayan kodu yazın
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 1den büyük bir tam sayı giriniz :");

        int sayi = scan.nextInt();
        int karelertop= 0;


        for (int i = 1; i <sayi ; i++) {
            System.out.print(i+ " ");
            karelertop+=i*i;
        }
        System.out.print("kareler toplamı :" + karelertop);





















    }
}
