package J12_Arrays.Tasks;

import java.util.Scanner;

public class Task_kendim02 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
        Bir dizi INT göz önüne alındığında, dizideki ilk 2 öğenin toplamını döndürün.
       Dizi 0 ise 0 döndürün.
         */


        System.out.println("Kaç elemanlı bir dizi oluşturulsun");
        int boyut= scan.nextInt();
        int sayiArr[]=new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println("Lütfen " + i + " . elemanı giriniz.");
            sayiArr[i] = scan.nextInt();
        }

        int toplam=0;

        
       if (sayiArr.length>2){
           toplam+=sayiArr[0]+sayiArr[1];
       } else if (sayiArr.length == 0) {
           toplam=0;
       }

        System.out.println("toplam = " + toplam);




    }
}
