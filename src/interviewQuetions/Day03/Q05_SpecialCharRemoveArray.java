package interviewQuetions.Day03;

import java.util.ArrayList;
import java.util.List;

public class Q05_SpecialCharRemoveArray {
    public static void main(String[] args) {


         /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */


        //parse int : primitive return eder
        //value Of : non primitive return eder

        ArrayList<String> dolarList=new ArrayList<String>(List.of("$13", "$15", "$20"));

        getSumm(dolarList);

    }

    private static void getSumm(ArrayList<String> list) {
        int sum = 0;
        String str2=null;
        for (String eleman : list) {
            str2 = eleman.replace("$", "");
        }

        sum += Integer.parseInt(str2);
        System.out.println("toplam =" + sum);
    }

    }

