package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {


        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen adınızı ve soyadınızı giriniz :");

        String ad = scan.nextLine(), soyad = scan.nextLine();

        String fullName = ad.concat(" " + soyad).toUpperCase();
        System.out.println(fullName);


    }
}
