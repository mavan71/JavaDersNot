package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

public class Task04 {
    public static void main(String[] args) {



/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */


        int i = 999;
        int sayac = 0;
        while (i > 99) {
            if (i%12==0) {  // (sayi%4==0 && sayi%6==0)---->sayi%12==0;
                System.out.println(i + " ");
                sayac++;
            }
            i--;
        }
        System.out.println("\n"+sayac + " tane sayı hem 4 ve hem 6 ya tam bolunebilen sayıdır.");
    }



    }

