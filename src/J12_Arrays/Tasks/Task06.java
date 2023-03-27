package J12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;


public class Task06 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
        System.out.println("Kaç boyutlu olsun");
        int boyut= scan.nextInt();
        int sayıArr [] = new int [boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.println(i+ " . indexi giriniz");
            sayıArr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(sayıArr));
        Arrays.sort(sayıArr);

        for (int i = sayıArr.length-1; i >=0 ; i--) {
            System.out.print(sayıArr[i]+ " ");

        }



    }
}
