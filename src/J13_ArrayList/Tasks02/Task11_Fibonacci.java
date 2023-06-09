package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */

        int a = 0;
        int b = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaça kadar fibonaci dizisi oluşturmak istiyorsunuz : ");
        int sayi = input.nextInt();

        ArrayList<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(a);
        fibonacci.add(b);
        for (int i = 0; i < sayi; i++) {
            int yeniSayi = fibonacci.get(i) + fibonacci.get(i + 1);
            if (yeniSayi > sayi) {
                break;
            } else {
                fibonacci.add(yeniSayi);
            }
        }

        System.out.println("fibonacci = " + fibonacci);



    }
}
