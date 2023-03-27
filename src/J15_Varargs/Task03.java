package J15_Varargs;

import java.util.Scanner;

public class Task03 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        //Task: girilen bir sayı ile girilen strinlerin en uzun harf sayısını çarpıp print eden method create ediniz.
        
        
        sayıCarpıKelime(5,"javatar","javacan","birşarkısınsen","miniminibirkuşdonmuştu");













    }

    private static void sayıCarpıKelime(int num, String ... str) {
        String enUzun = "";
        for (String a:str) {
            if (a.length()>enUzun.length())
                enUzun = a;
        }
        int sonuc = num*enUzun.length();
        System.out.println("en uzun kelime :" + enUzun);
        System.out.println("sonuc = " + sonuc);
        
    }
}
