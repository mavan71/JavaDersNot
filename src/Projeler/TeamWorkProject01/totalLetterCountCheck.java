package Projeler.TeamWorkProject01;

import java.util.Scanner;

public class totalLetterCountCheck {
     /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */

    /*
     Girilen bir string ifadenin harf saysının tek olmasını kontrol eden code create ediniz.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız");
        String word = scanner.nextLine();

        //  code Start here don't change before this line
        // bu satırdan önceki kodları değiştirmeyiniz

       String str= word.replaceAll(" ", "");
        boolean result = false;
       if (str.length()%2==1){
           result = true;
           System.out.println(result);
       } else {
           result = false;
           System.out.println(result);
       }



    }
}
