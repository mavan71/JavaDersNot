package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        /*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen adınızı ve soy adınızı yazınız :");

        String isim = scan.nextLine();
        String bos="";
        int i=0;
        while(i<isim.length()){
            bos+=isim.charAt(i)+" ";
            i++;
        }
        System.out.print("Harflerin arasına bosluk eklendi: " + bos);














































    }
}
