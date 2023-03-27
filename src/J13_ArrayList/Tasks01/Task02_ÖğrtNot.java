package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.Scanner;



public class Task02_ÖğrtNot {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

         /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        int cıkıs=0;
        ArrayList<Integer> notList = new ArrayList<Integer>();
        while (cıkıs<=100) {
            System.out.println("Lütfen 100 lük sistemdeki notlarınızı giriniz. \n çıkmak için 999'a basınız ");
             cıkıs=scan.nextInt();
             notList.add(cıkıs);

        }

        notList.remove(notList.size()-1);
        System.out.println("notList = " + notList);

        int toplam=0;
        for (int i = 0; i <notList.size(); i++) {
            toplam+=notList.get(i);
        }

        int ortalama=toplam/notList.size();

        ArrayList <Integer> ortalamaUstu=new ArrayList<Integer>();
        for (int i = 0; i < notList.size(); i++) {
            if(notList.get(i)>= ortalama){
                ortalamaUstu.add(notList.get(i));
            }

        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalama Ustu notlar = " + ortalamaUstu);
        int gecenSayısı = ortalamaUstu.size();
        System.out.println("Ortalamanın üstündeki öğrenci sayısı = " + gecenSayısı);

    }

}

