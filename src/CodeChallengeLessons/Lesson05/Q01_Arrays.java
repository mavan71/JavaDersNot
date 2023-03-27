package CodeChallengeLessons.Lesson05;

import java.util.Scanner;

public class Q01_Arrays

{

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        //Type a method to check if an int Array is symmetrical or not.
        // Bir int dizinin simetrik olup olmadığını kontrol eden method create ediniz.

        simetrikMi();















    }

    private static void simetrikMi() {

        int  boyut;
        boolean simetrik = false;

        System.out.println("Lütfen dizinin boyutunu giriniz :");
        boyut=scan.nextInt();

        int sayiArr []=new int[boyut];

        for (int i = 0; i <boyut ; i++) {
            System.out.println(i + " . index elemanı giriniz : ");
            sayiArr[i] = scan.nextInt();
        }

        for (int i = 0; i < boyut/2; i++) {
            if (sayiArr[i]!=sayiArr[boyut-1-i]){
                simetrik=false;
                break;
            }
            
        }

        if (simetrik){
            System.out.println("sayiArr dizisi simetrik değildir");
        } else {
            System.out.println("sayiArr dizisi simetriktir.");
        }

    }
}
