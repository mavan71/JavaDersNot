package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

            /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */



        int sayac = 0;
        int toplam=0;
        int sayi;
        while(true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayi girin: ");
            sayi = scan.nextInt();
            if(sayi==0) break;
            toplam=toplam + sayi;
            sayac++;

        }
        System.out.println("Sayıların Toplamı: "+toplam);
        System.out.println("girilen tahmin sayısı : " + sayac);
    }




}
