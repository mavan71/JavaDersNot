package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {


        // girilen 7 sayının en büyüğünü  print eden cod creat ediniz.

        Scanner scan = new Scanner(System.in);


        int sayac = 1;
        int enbuyukSayi = 0;

        while (sayac <= 7){
            System.out.print(sayac+ ".  sayıyı giriniz :");
            int girilenSayi = scan.nextInt();
          //  enbuyukSayi=(enbuyukSayi>girilenSayi?enbuyukSayi:girilenSayi);
            enbuyukSayi= Math.max(enbuyukSayi,girilenSayi); // 2. yöntem
            sayac++;
        }
        System.out.println("girilen 7 adet sayıdan en büyük olan sayı :" + enbuyukSayi);

























    }
}
