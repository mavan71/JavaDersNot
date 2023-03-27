package J07_StringManipulation;

import java.util.Scanner;

public class C15_Practice {
    public static void main(String[] args) {



        // task_ girilen bir password aşağıdaki şartları taşıyor mu bakınız.
        // 1- en az 8 karakter olmalı
        //2- ilk harf büyük olmalı
        //3- son harf küçük olmalı
        //4- boşluk içermemeli




        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen pasword'unuzu giriniz :");

        String password = scan.nextLine();

            if ((password.length() >= 8) && !password.contains(" ") &&
                        Character.isUpperCase(password.charAt(0)) &&
                        Character.isLowerCase(password.charAt(password.length()-1))) {
                System.out.println("Tebrikler Kodunuzu doğru oluşturdunuz.");
            } else System.out.println("Password yanlış oluşturuldu");


























    }
}
