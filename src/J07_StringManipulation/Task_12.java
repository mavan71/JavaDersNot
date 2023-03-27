package J07_StringManipulation;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

/*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen 3 kelimelik bir cümle giriniz :");
        String uclu = scan.nextLine().toUpperCase();
        int ilkBoşluk = uclu.indexOf(" ");
        int sonBoşluk = uclu.lastIndexOf(" ");
        char bir = uclu.charAt(0);
        char iki = uclu.charAt(ilkBoşluk+1);
        char üç = uclu.charAt(sonBoşluk+1);
        String kısaltma = bir+"."+iki+"."+üç+".";
        System.out.println("kısaltma = " + kısaltma);































    }
}
