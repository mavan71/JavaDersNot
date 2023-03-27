package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_kendim07 {
static String dize= "selam size JavaCanlar";

    public static void main(String[] args) {


        //"selam size JavaCanlar" cümlesindeki en uzun kelimeyi bulmak için bir method yazın



        enUzunKelime();


    }

    private static void enUzunKelime() {

        String ilk, orta, son;
        int bosluk1= dize.indexOf(" ");
        ilk= dize.substring(0, bosluk1);
        int sonBosluk= dize.lastIndexOf(" ");
        orta= dize.substring(bosluk1, sonBosluk);
        son =dize.substring(sonBosluk,dize.length());
        int a= ilk.length();
        int b= orta.length();
        int c= son.length();
        if (a>b && a>c) {
            System.out.println("en uzun kelime :" + ilk);
        } else if (b>c && b>a) {
            System.out.println("en uzun kelime :" +orta);
        } else {
            System.out.println("en uzun kelime :" + son);
        }



    }
}
