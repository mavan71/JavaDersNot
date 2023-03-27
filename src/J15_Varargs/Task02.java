package J15_Varargs;

import java.util.Scanner;

public class Task02 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
Task ->
Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

 */
        int syArr []= {55,12,33,10};
        alengirliCarpim();
        alengirliCarpim2(55,12,33,10);
        alengirliCarpim3(55,12,33,10);
        alengirliCarpim4(syArr);


    }

    private static void alengirliCarpim4(int[] syArr) {
        int toplam=0;
        for (int i = 1; i < syArr.length; i++) {
            toplam+=syArr[i];
        }
        int sonuc = syArr[0]*toplam;
        System.out.println("sonuc = " + sonuc);
    }

    private static void alengirliCarpim3(int ilksayi, int...sayiArr) {
        int toplam=0;
        for (int a:sayiArr) {
            toplam+=a;
        }
        int sonuc= ilksayi*toplam;
        System.out.println("sonuc = " + sonuc);

    }

    private static void alengirliCarpim2(int...num) {
        int toplam=0;
        for (int i = 1 ; i < num.length; i++) {
            toplam+=num[i];
        }
        int sonuc = num[0]*toplam;
        System.out.println("sonuc = " + sonuc);
    }

    private static void alengirliCarpim() {
        System.out.println("kaç tane sayı girmek istersiniz:");
        int b= scan.nextInt();
        int sayiArr[] = new int [b];
        for (int i = 0; i < b; i++) {
            System.out.println(i+ " . index sayıyı giriniz.");
            sayiArr[i]=scan.nextInt();
        }
        int toplam=0;
        for (int i = 1; i <sayiArr.length ; i++) {
            toplam+=sayiArr[i];
            
        }
        int sonuc = sayiArr[0]*toplam;
        System.out.println("sonuc = " + sonuc);
    }
}
