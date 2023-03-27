package J12_Arrays.Tasks;

import java.util.Scanner;

public class Task09 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz

        int sayiArr [] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ " . index sayıyı giriniz");
            sayiArr[i] = scan.nextInt();
        }

        for (int i = sayiArr.length-1; i >=0 ; i--) {
            System.out.print(sayiArr[i]+ " ");

        }

    }
}
