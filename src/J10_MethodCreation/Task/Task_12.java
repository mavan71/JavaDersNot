package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_12 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
/*
        // girilen mail adresinin doğruluğunu kontrol eden method creat ediniz.
       şartlar 1) @ karakteri olmalı
                2) . (nokta) karakteri olmalı
                3) @ karakterinden önce en az 1 karakter olmalı
                example: @gmail.com ---> false
                         @gmailcom ---> false
                         gmail.com ---> false
                         jdfhsdh@gmail.com --->true

 */

                mailKontrol1();
                mailKontrol2();
                mailKontrol3();



    }

    private static void mailKontrol3() {

    }

    private static String mailKontrol2() {
        System.out.println("Lütfen mail adresiniz giriniz :");
        String mail = scan.nextLine();
       return mail.contains("@") && mail.contains(".") && mail.charAt(0) != '@' ? "mail başarılı" : "mail adresiniz yanlış";

    }

    private static void mailKontrol1() {
        System.out.println("Lütfen mail adresiniz giriniz :");
        String mail = scan.nextLine();

        boolean result = false;
        if (mail.contains("@") && mail.contains(".") && mail.charAt(0)!='@'){
            result = true;
        }

    }
}
