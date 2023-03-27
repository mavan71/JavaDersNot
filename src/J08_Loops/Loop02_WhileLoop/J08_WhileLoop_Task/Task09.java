package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç adet sayıyı toplamak istiyorsunuz: ");
        int adet= scan.nextInt();
        int i=1;
        int toplam=0;
        int sayi;
        while (adet>=i){
            System.out.print(i+".sayıyı giriniz: ");
            sayi= scan.nextInt();
            toplam+=sayi;
            i++;
        }
        System.out.println("toplam = " + toplam);































    }
}
