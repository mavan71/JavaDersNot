package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_29 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
/*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */
        ucKuvvetiMi();


    }

    private static void ucKuvvetiMi() {
        System.out.println("Lütfen bir tam sayı giriniz:");
        int sayi=scan.nextInt();
        int sayac=0;
        boolean sonuc = false;
        for (int i = 3; i<=sayi;i*=3) {
            if (sayi==i) {
                sayac++;
            }
        }if(sayac==1){
            System.out.println(sonuc = true);
            System.out.println("Girilen sayi 3'ün bir kuvvetidir.");
        }else {
            System.out.println(sonuc = false);
            System.out.println("Girilen sayı 3'ün kuvveti değildir.");
        }


    }
}
