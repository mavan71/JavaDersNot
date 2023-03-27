package Projeler.TeamWorkProject01;

import java.util.Random;
import java.util.Scanner;

public class randomNumberBetweenTwoNumbers {

    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    /*
  Girilen iki tamsayı arasinda random sayi elde eden code create ediniz.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayı giriniz");
        String s1 = scanner.nextLine();

        String[] elements = s1.split(" ");

        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        //  code Start here don't change before this line
        // bu satırdan önceki kodlari değiştirmeyiniz.

        Random rnd = new Random();
        int random = rnd.nextInt(min,max);
        System.out.println(random);


    }
}
