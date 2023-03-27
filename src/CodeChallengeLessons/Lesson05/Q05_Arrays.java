package CodeChallengeLessons.Lesson05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
       Find the middle element in an integer array
       Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
                 (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
    */


        System.out.println("Kaç elemanlı bir dizi olsun?");

        int uzunluk=scan.nextInt();

        int sayiArr[]= new int [uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Lütfen " + i + " . index sayısını giriniz.");
            sayiArr[i]=scan.nextInt();
        }
                int toplam=0;
            if (uzunluk%2==0) {
                toplam=(sayiArr[uzunluk/2]+sayiArr[(uzunluk/2)+1])/2;
            } else {
                toplam= sayiArr[uzunluk/2];
            }

        System.out.println("toplam = " + toplam);
    }
            

}
