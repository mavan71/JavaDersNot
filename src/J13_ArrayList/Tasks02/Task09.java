package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

         /* TASK :
Bir integer list oluşturunuz ve bu list'deki tum sayıların karesinin
toplamını bulan code create ediniz.
 */
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Liste atamak için sayı giriniz.\n yeterli derseniz '0' giriniz");

        int listSayıları =1;
        while (listSayıları!=0) {
            System.out.println("Lütfen bir sayı giriniz:");
            listSayıları=scan.nextInt();
            list.add(listSayıları);
        }
        System.out.println("girilen sayılar "+ list);


        double kareToplamı=0;
        for (int i = 0; i < list.size(); i++) {
           kareToplamı+=list.get(i)*list.get(i);

        }

        System.out.println("kareToplamı = " + (kareToplamı));







        }






    }

