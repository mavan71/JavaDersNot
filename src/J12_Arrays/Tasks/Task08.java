package J12_Arrays.Tasks;

import java.util.Scanner;

public class Task08 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        int sayıArr [] = new int [7];

        for (int i = 0; i < 7; i++) {
            System.out.println(i+" . index değerini giriniz:");
            sayıArr[i] = scan.nextInt();

            }
        for (int i = 0; i < sayıArr.length; i++) {
            if(sayıArr[i]%2==1){
                System.out.print(sayıArr[i] + " ");
            }

        }




    }
}
