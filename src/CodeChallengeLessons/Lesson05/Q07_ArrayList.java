package CodeChallengeLessons.Lesson05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q07_ArrayList {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */



        tekrarliList();





    }

    private static void tekrarliList() {
        System.out.println("Kaç elemanlı bir liste oluşturulsun");
        int n= scan.nextInt();
        ArrayList <Integer> sayiList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            System.out.println("Lütfen "+ i + " . elemanı giriniz");
            sayiList.add(scan.nextInt());
        }

        Collections.sort(sayiList);

        int count;
        for (int i = 0; i < sayiList.size(); i++) {
            count=0;
            for (int j = 0; j < sayiList.size(); j++) {
                if (sayiList.get(i)==sayiList.get(j)){
                    count++;
                }
            }
            System.out.println(sayiList.get(i) + " " + count+ " adet");
        }
    }


}


