package J07_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {


         /*
     charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar
      */

        String isim ="Abdi Arman";
        System.out.println(isim.charAt(5)); // isim String indeki 5. index karakteri return eder.

        char karakter = isim.charAt(6); // charAt index boyutunu geçerse "run time error" verir rte
        System.out.println(karakter);

        /// bir String 'in son karakteri "length-1" dir.

        //task girilen bir String ifadenin ortadaki karakterini bulunuz

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir kelime giriniz :");
        String kelime = scan.nextLine();

        if (kelime.length()%2==1) {
            System.out.println("orta karakter :"+ kelime.charAt(kelime.length()/2));
        } else System.out.println("girilen kelimenin orta karakteri yok !!!");





    }
}
