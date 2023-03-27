package J07_StringManipulation;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        /*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */

        System.out.print("Lütfen bir kelime giriniz :");
        String kelime = scan.nextLine();

            if (kelime.length()%2 == 0) {
                System.out.println("girdiğiniz kelimenin ilk yarısı "+ kelime.substring(0, kelime.length()/2));
            } else System.out.println("girdiğiniz kelimeyi ikiye bölemiyoruz");




    }
}
