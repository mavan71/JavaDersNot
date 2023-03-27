package CodeChallengeLessons.Lesson05;

import java.util.Arrays;

public class Q04_Arrays {

    public static void main(String[] args) {

        /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= "Apex,nesne yonelimli bir programlama dilidir"
                a e i o u */

        String s = "Apex,nesne yonelimli bir programlama dilidir";
        String sArr[]= s.toLowerCase().split("");
        System.out.println(Arrays.toString(sArr));
        String sesliHarfler= "a,e,ı,i,o,ö,u,ü";
        int sesli =0;
        for (int i = 0; i <sArr.length; i++) {
            if (sesliHarfler.contains(sArr[i])){
                sesli++;
            }

        }
        System.out.println("sesli harf sayısı = " + sesli);




    }





}
