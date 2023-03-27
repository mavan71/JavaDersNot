package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q01_MetCreationForLoop {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

// task: kullanıcıdan alınan bir String in terten yazıldığı method create ediniz.


        System.out.println(reverseString());

    }

    private static String reverseString() {
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime= scan.nextLine();
        String tersKelime="";

        for (int i = kelime.length()-1; i >=0; i--) {
            tersKelime+=kelime.charAt(i);

        }

          return tersKelime;
    }
}
