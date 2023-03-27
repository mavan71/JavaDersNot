package interviewQuetions.Day04;

import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {
    static Scanner scan = new Scanner(System.in);
    /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

    public static void main(String[] args) {
        int arr [] = {1,1,1,22,23,85,58,77,66,22,23,77};

        System.out.println(kacTekrar(arr));


    }

    private static int kacTekrar(int []arr) {
        int count = 0;
        System.out.println("Tekrar sayısı bulunacak sayıyı giriniz");
        int i= scan.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                count++;
            }
        }

        return count;
    }
}
