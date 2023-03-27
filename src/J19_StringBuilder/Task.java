package J19_StringBuilder;

import java.util.Scanner;

public class Task {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

 /*
  Task->
   Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
   olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) METHOD create ediniz.
(without case sensitivity)
Eg : input : javaCAN'lara selam olsun :)
Output: "Reversed sentence : ): nuslo males aral'NACavaj
   It is not a palindrome"
   */



        isPolindromAmele();

        isPolindromCiks();








    }

    private static void isPolindromCiks() {
        System.out.println("Lütfen bir cümle giriniz");
        String input = scan.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder(input);
        String tersInput= sb.reverse().toString();
        System.out.println("input.equals(tersInput) = " + input.equals(tersInput));

    }

    private static void isPolindromAmele() {
        System.out.println("Lütfen bir cümle giriniz");
        String input = scan.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder(input);

        sb.reverse();
        boolean flag= false;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.reverse().charAt(i)){
                flag = true;
            } else {
                flag = false;
            }
        }

        System.out.println(input+ " cümlesi polindrom mu? " + flag );

    }
}
