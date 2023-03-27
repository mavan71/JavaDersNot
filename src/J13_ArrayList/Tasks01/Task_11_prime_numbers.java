package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_11_prime_numbers {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int input = scan.nextInt();
        List<Integer> asalList = new ArrayList<>();
        if (input>0){
            int sayac = 0;
            for(int sayi=2;sayi<=input;sayi++) {
                int kontrol = 0;
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) {
                        kontrol = 1;
                        break;
                    }
                }

                if(kontrol==0) {
                   asalList.add(sayi);
                    sayac++;
                }
            }
            System.out.println("asalList = " + asalList);
            System.out.println(input + " dan küçük " + sayac + " adet asal sayı vardır.");
        }







    }
}
