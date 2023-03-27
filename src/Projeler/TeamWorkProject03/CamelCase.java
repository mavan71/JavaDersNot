package Projeler.TeamWorkProject03;

import java.util.Locale;
import java.util.Scanner;



public class CamelCase {
     /*
     TASK ->
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin sadece ilk karakterlerini
            büyük harfe çevirip return eden  method create ediniz.
            input: I lIVe in uSa
            output: I Live In Usa

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir cümle yazınız");
        String input = scan.nextLine();

        System.out.println(camelcase(input));

    }

    private static String camelcase(String str) {
       String cap="";
       int i=0;
       while (i < str.length()) {
           if(i ==0){
               cap+=capitalize(str.substring(i,i+1));
               i++;
           } else if (str.charAt(i)==' ') {
               cap+=capitalize(str.substring(i,i+2));
               i+=2;
           } else {
               cap+=str.charAt(i);
               i++;
           }
       }



        return cap;
    }

    public static String capitalize(String s){
        if(s.length() == 1){
            return s.toUpperCase(Locale.forLanguageTag("tr"));
        }
        return s.charAt(0) + s.substring(1).toUpperCase(Locale.forLanguageTag("tr"));
    }

}

