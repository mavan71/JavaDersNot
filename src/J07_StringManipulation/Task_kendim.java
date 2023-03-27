package J07_StringManipulation;

import java.util.Scanner;

public class Task_kendim {
    public static void main(String[] args) {


        // task_1 = 'e' harfinin 'şemsiye' kelimesinde olup olmadığını kontrol etmek için bir program yazın.

        String umbrella = "şemsiye";

        System.out.println("umbrella.contains(\"e\") = " + umbrella.contains("e")); //true
        System.out.println("umbrella.indexOf(\"e\") = " + umbrella.indexOf("e")); // 1
        System.out.println("umbrella.lastIndexOf(\"e\") = " + umbrella.lastIndexOf("e"));

        // task_2 = "orange" kelimesinin "This is orange juice" da mevcut olup olmadığını kontrol etmek için bir program yazın.'


        String juice = "This is orange juice";

        System.out.println("juice.contains(\"orange\") = " + juice.contains("orange")); //true
        System.out.println("juice.contains(\"orange\") = " + juice.contains("orange")); //


        // task_3 = "Hello World" cümlesindeki ilk ve son 'o' karakterlerinin indexini bulunuz.

        String hello = "Hello World";

        System.out.println("hello.indexOf(\"o\") = " + hello.indexOf("o")); // 4
        System.out.println("hello.lastIndexOf(\"o\") = " + hello.lastIndexOf("o")); // 7

        // task_4 = Tam adınızı girdi olarak alan bir program yazın ve olduğu gibi görüntülenen soyadı dışında ilk ve orta isimlerin kısaltmalarını görüntüleyin. Örneğin, adınız Robert Brett Roser ise, çıktı R.B.Roser olmalıdır


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen tam adınızı giriniz :");

        String fullName = scan.nextLine();

        char firstName = fullName.charAt(0);
        int space1 = fullName.indexOf(" ");
        char lastName = fullName.charAt(space1 + 1);
        int space2 = fullName.lastIndexOf(" ");
        String surName = fullName.substring(space2 + 1);

        String kısaltma = (firstName + "." + lastName + "." + surName).toUpperCase();
        System.out.println("kısaltma = " + kısaltma);


        // task_5 = Bir dizede sesli harf, ünsüz, rakam ve "space"" karakterlerinin sayısını bulmak için bir program yazın


        String dize = "Dörtlük dört satırdan oluşmuş şiirlere denir. Dörtlük şeklindeki şiirlerin her bir dörtlük kısmına kıta denmektedir. Dize ise dörtlükten farklı olarak bir satırına verilen isimdir. 4 May 2021";

        String sayı = dize.replaceAll("\\D", "");
        System.out.println("sayı = " + sayı);
        System.out.println("sayı.length() = " + sayı.length());

        String bHarf = dize.replaceAll("\\W", "");

        System.out.println("bHarf = " + bHarf);


   //     for (int i = 4; i > 1; i--) {
  //          System.out.println(i);
   //     }

        String papatya ="yaprak";

        for (int i = 0; i <=papatya.length() ; i++) {
            System.out.println("seviyor");
                    }





    }


}