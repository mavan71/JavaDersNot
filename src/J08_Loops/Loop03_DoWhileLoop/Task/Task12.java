package J08_Loops.Loop03_DoWhileLoop.Task;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // girilen bir metinde harf, rakam ve özel karakter sayısını print eden code creat ediniz.


        Scanner scan = new Scanner(System.in);

        System.out.print("Bir metin giriniz :");
        String str = scan.nextLine().toLowerCase();
        int harf = 0;
        int rakam =0;
        int karakter=0;
        int strIndex=0;



        do {
        if (str.length()==0){
            System.out.println("Lütfen bir metin giriniz.");
        } else if (str.charAt(strIndex)>='a' && str.charAt(strIndex)<= 'z'){
          harf++;
        } else if (str.charAt(strIndex) >='0' && str.charAt(strIndex) <='9'){
            rakam++;
        }else karakter++;

            strIndex++;
        } while (strIndex<str.length());

        System.out.println("girilen metinde ;"+ harf + " harf, " + rakam + " rakam ve " + karakter + " özel karakter vardır");




























    }
}
