package CodeChallengeLessons.Lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_Arrays {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.

        System.out.println("Lütfen bir cümle giriniz:");
        String str= scan.nextLine();

        String arr [] = str.split(" ");
        int kelimeSayısı= arr.length;
        System.out.println("girdiğiniz cümledeki kelime Sayısı = " + kelimeSayısı);


    }



}
