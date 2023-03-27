package J07_StringManipulation;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

         /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı prnt eden code create ediniz
       */

        System.out.print("Lütfen adınızı ve soyadınızı giriniz :");

        String fullİsim = scan.nextLine();
        int boşluk = fullİsim.lastIndexOf(" ");
        String isim = fullİsim.substring(0, boşluk);
        System.out.println("isim = " + isim);
        String soyİsim = fullİsim.substring(boşluk, fullİsim.length());
        System.out.println("soyİsim = " + soyİsim);




    }
}
