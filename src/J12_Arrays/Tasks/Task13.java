package J12_Arrays.Tasks;

import java.util.Scanner;

public class Task13 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

         /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */
        int sayiArr[]=new int[8];
        int uceBölünenler=0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Lütfen "+ i+ " . index elemanı giriniz.");
            sayiArr[i] = scan.nextInt();
            if (sayiArr[i]%3==0){
                uceBölünenler++;
            }
        }
        System.out.println("Girilen array'de 3'e Bölünen sayı adedi = " + uceBölünenler);




    }
}
