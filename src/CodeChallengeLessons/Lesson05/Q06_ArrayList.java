package CodeChallengeLessons.Lesson05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q06_ArrayList {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        ArrayList <Integer> inputList = new ArrayList <>(List.of(1, 2, 3, 4, 5, 6, 7,8));

        System.out.println("Listenin maximum kaç elemanı verilsin");
        int input = scan.nextInt();


        List<Integer> maxlist= new ArrayList<>();
        int sayac=0;


        while (sayac<input){
            int max=inputList.get(0);
            for (int i = 0; i <inputList.size(); i++) {
                if(inputList.get(i)>max){
                    max=inputList.get(i);
                }

            }
            maxlist.add(max);
            inputList.remove(inputList.indexOf(max));
            sayac++;
        }


        System.out.println("maxlist = " + maxlist);

    }





}