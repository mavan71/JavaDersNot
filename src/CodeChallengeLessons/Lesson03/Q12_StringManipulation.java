package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q12_StringManipulation {
    public static void main(String[] args) {


        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kalime giriniz. :");
        String a = scan.nextLine();

        int bosluk = a.indexOf(" ");

        if (bosluk== -1 && !a.isEmpty()) {
            System.out.println("şartlara uygun");
        } else System.out.println("şartlara uygun değil");























    }
}
