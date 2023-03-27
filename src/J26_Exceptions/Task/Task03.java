package J26_Exceptions.Task;

import java.util.Scanner;

public class Task03 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

/*
'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
int v = vize
int f = final

Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
Diğer durumlarda ise,
vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
vizeye 120, finale 80 girin.

Programın çalışmasını sağlayın. (handle edin)
 */

        int vize;
        int fin;

        while (true){
            try {
                System.out.println("Vize notunu giriniz");
                vize = scan.nextInt();
                if(vize < 0 || vize>100){
                    throw new ArithmeticException("Notlar 0-100 arasında olmak zorundadır");
                }else break;
            }catch (ArithmeticException e){
                System.out.println("Hatalı giriş yaptınız " + e.getMessage());
            }
        }
        while (true){
            try {
                System.out.println("Final notunu giriniz");
                fin = scan.nextInt();
                if(fin < 0 || fin>100){
                    throw new ArithmeticException("Notlar 0-100 arasında olmak zorundadır");
                }else break;
            }catch (ArithmeticException e){
                System.out.println("Hatalı giriş yaptınız " + e.getMessage());
            }
        }

        System.out.println("vize-final ortalaması = " + ortalamaAl(vize, fin));


    }

    private static double ortalamaAl(int vize, int fin) {

        double ortalama= vize*0.40+fin*0.60;


        return ortalama;
    }
}
