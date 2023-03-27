package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_kendim08 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen iki dizenin anagram olup olmadığını kontrol etmek için bir program yazın.
         Bir kelimenin harfleri diğer kelimeyi oluşturmak için yeniden düzenlenebilirse, iki kelimenin anagram olduğu söylenir.
          Örneğin, Jaxa ve Ajax birbirlerinin anagramlarıdır.
         */


        System.out.println(isAnagram());


    }

    private static boolean isAnagram() {
        boolean isAnagram = true;
        System.out.println("Lütfen bir kelime giriniz :");
        String str1=scan.nextLine();
        System.out.println("Lütfen bir kelime daha giriniz :");
        String str2=scan.nextLine();

        String s1= str1.replaceAll("\\s", "");
        String s2= str2.replaceAll("\\s", "");

        if (s1.length() !=s2.length()) {
            isAnagram = false;
        }

        return isAnagram;
    }

}
