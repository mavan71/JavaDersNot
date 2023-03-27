package J30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        /*
Task->
Node değerleri "Murat","javaCAN","javaTAR","Abdi bey" olan bir linkedList create ediniz.
Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */

        LinkedList <String> list = new LinkedList<>(Arrays.asList("Murat","javaCAN","javaTAR","Abdi bey"));

        Scanner scan = new Scanner(System.in);
        System.out.println("Aradığınız elemanı giriniz");
        String input = scan.nextLine();

        if (list.remove(input)) {
            System.out.println("Agam eleman halledildi");
        } else {
            System.out.println("Agam aradığınız kişiye ulaşılamadı");
        }

      //  System.out.println(list.remove(input) ? "Agam eleman halledildi" : "Agam aradığınız kişiye ulaşılamadı"); // tek satırda clean code
    }
}
