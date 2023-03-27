package J12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        // task: girilen bir int array in büyükten küçüğe sıralayınız.


        System.out.println("Lütfen dizinin (array) boyutunu giriniz");
        int arrayBoyut= scan.nextInt();
        int sayiArr[]= new int[arrayBoyut];

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.println("Lütfen " + i + ". index sayıyı giriniz");
            sayiArr[i] = scan.nextInt();
        }
        Arrays.sort(sayiArr);
        System.out.println("Oluşturulan sayı arrayi = " + Arrays.toString(sayiArr));

        for (int i = sayiArr.length-1; i >=0 ; i--) {
            System.out.print(sayiArr[i]+" ");

        }


    }
}
