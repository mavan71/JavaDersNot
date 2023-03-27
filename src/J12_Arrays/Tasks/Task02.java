package J12_Arrays.Tasks;

import java.util.Scanner;

public class Task02 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

// Task girilen int array in elemanlarının toplamını yazan code create ediniz.

        System.out.println("Lütfen array boyutunuz giriniz");
        int arrBoyut=scan.nextInt();
        int sayiArr[]= new int [arrBoyut];
        int arrtoplam= 0;

        for (int i = 0; i < arrBoyut; i++) {
            System.out.println("lütfen" + i + " . index sayısını giriniz.");
             sayiArr[i] = scan.nextInt();
             arrtoplam+=sayiArr[i];
        }

        System.out.println("toplam = " + arrtoplam);


    }
}
