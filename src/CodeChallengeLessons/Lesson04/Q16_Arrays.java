package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q16_Arrays {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


/*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        int arr[] = new int[8];
        int counter = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Lütfen " + i + ". index elemanını giriniz");
             arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0){
                counter++;
            }

        }
        System.out.println("Oluşturulan sayı dizisinde 3'e bölünebilen sayı adedi :" + counter);











    }
}
