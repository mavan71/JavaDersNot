package J07_StringManipulation;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

         /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      char a =  harfDepo.charAt(0);
      char b = harfDepo.charAt(1);
      char d = harfDepo.charAt(3);
      char i = harfDepo.charAt(8);

       String ad = ""+a+b+d+i;
        System.out.println("ad = " + ad);

        char birinci = harfDepo.charAt(harfDepo.indexOf('A'));
        char ikinci = harfDepo.charAt(harfDepo.indexOf('B'));
        char üçüncü = harfDepo.charAt(harfDepo.indexOf('D'));
        char dördüncü = harfDepo.charAt(harfDepo.indexOf('I'));

        System.out.println(birinci+ikinci+üçüncü+dördüncü); // 272
        System.out.println(" " +birinci+ikinci+üçüncü+dördüncü); // " " ekleyerek String yaptık





    }
}
