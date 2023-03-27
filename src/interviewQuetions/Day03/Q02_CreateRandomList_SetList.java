package interviewQuetions.Day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q02_CreateRandomList_SetList {

    public static void main(String[] args) {

        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer>sayiList=new ArrayList<Integer>();
        
        
        randomEkle(sayiList);





    }

    private static void randomEkle(ArrayList<Integer>sayiList) {
        Random rnd=new Random();
        for (int i = 0; i < 10; i++) {
            int a= rnd.nextInt(21);
            sayiList.add(a);
        }
        System.out.println(sayiList);
        for (int i = 0; i < sayiList.size(); i++) {
            if(sayiList.get(i)%2==0) {
                sayiList.set(i,111);
            } else {
              //  System.out.println("çift sayı yoktur");
            }
        }
        System.out.println(sayiList);

    }


}
