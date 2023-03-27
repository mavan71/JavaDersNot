package J08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        //task : girilen tam sayının pozitif bölenlerini print eden cod yazınız.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz :");

            int bb = scan.nextInt();

            int bolenSayi = 1;
            int bolenAdedi = 0;


            while (bolenSayi <=bb){
                if (bb%bolenSayi==0){
                    bolenAdedi++;
                }
             bolenSayi++;


        }
        System.out.println("girilen tam sayı "+ bb + " 'nın, "+ bolenAdedi + " tane tam böleni var");





































    }
}
