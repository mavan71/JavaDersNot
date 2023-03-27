package Projeler.TeamWorkProject01;

import java.util.Random;
import java.util.Scanner;

public class randomNum {
     /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */



    /*

     Girilen sayı ile 0 arasında random bir sayi elde eden code create ediniz.

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int max = Integer.parseInt(scanner.nextLine());

        //  code Start here don't change before this line
        // bu satırdan önceki kodları değiştirmeyiniz

        Random rnd = new Random();
        int num = rnd.nextInt(0,max);
        System.out.println(num);

    }
}
