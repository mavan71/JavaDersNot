package J07_StringManipulation;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        System.out.print("Lütfen password'unuzu giriniz :\n parolanızın ilk karakteri büyük harf,\n son karakteri bir tam sayı olmalı \n ve en az 6 karakter kullanmalısınız. ");
        String password = scan.nextLine();

        char ilk = password.substring(0,1).charAt(0);
       char son = password.substring(password.length ()-1).charAt(0);


            if (ilk >=65 && ilk<= 90); {

            } if (son >= 48 && son <=57){

             } if (password.length() >= 6 && password.length() <=9) {
            System.out.println("Tebrikler!! Şifrenizi doğru tanımladınız.");
        } else System.out.println("Lütfen kriterlere uygun bir şifre giriniz!!");



//                if (ilk >='A' && ilk<= 'Z'); {
//                  } if (son >=0 && son<= 9 ) {
//                    } else if (uzunluk >=6 && uzunluk<=9) {
//            System.out.println("Tebrikler!! Şifrenizi doğru tanımladınız.");
//                     }else System.out.println("Lütfen kriterlere uygun bir şifre giriniz!!");



    }
}
