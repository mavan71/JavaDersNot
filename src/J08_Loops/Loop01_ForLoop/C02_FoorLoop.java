package J08_Loops.Loop01_ForLoop;

import java.util.Scanner;

public class C02_FoorLoop {
    public static void main(String[] args) {


        // task : girilen sayıdan 100 e kadar 4 ün katı olan tam sayıları print eden cod creat ediniz


        Scanner scan = new Scanner(System.in);
        System.out.print("bir tam sayı giriniz :");
        int sayi = scan.nextInt();

        if (sayi >= 100) {
            System.out.println("hatalı giriş yaptınız");
        }else {
            for (int i = sayi; i <100 ; i++) {
                if (i%4==0){
                    System.out.println(i+" ");
                }
                
            }


        }




























    }
}
