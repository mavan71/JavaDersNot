package J12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_kendim01 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

       // uzunluğunu ve elemanlarını kullanıcan alındığı bir Int dizi oluşturun,
        // dizideki en büyük öğeyi bularak tüm elemanlara bunu atayın.

        System.out.println("Kaç elemanlı bir dizi oluşturulsun");
        int boyut= scan.nextInt();
        int sayiArr[]=new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println("Lütfen " + i + " . elemanı giriniz.");
            sayiArr[i] = scan.nextInt();
        }

        Arrays.sort(sayiArr);
        int enBüyük= sayiArr[sayiArr.length-1];

        for (int i = 0; i < sayiArr.length; i++) {
            sayiArr[i] = enBüyük;

        }

        System.out.println(Arrays.toString(sayiArr));

    }
}
