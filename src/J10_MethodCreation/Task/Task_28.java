package J10_MethodCreation.Task;

import java.util.Random;
import java.util.Scanner;

public class Task_28 {
    static Scanner scan = new Scanner(System.in);
    static Random rnd = new Random();
    public static void main(String[] args) {
         /*
    task->
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

        randomNum();






    }

    private static void randomNum() {
        System.out.println("Lütfen bir sayı giriniz :");
        int max = scan.nextInt();
        if (max>=0) {
            int showMe= rnd.nextInt(0,max);
            System.out.println("0 ile girdiğiniz sayı arasındaki rastgele sayı :" + showMe);
        } else System.out.println("Lütfen sıfırdan büyük bir sayı giriniz.");


    }
}
