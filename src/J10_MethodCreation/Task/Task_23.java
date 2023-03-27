package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_23 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
/*
   Task-> vucüt kitleendexini print eden METHOD create ediniz
   vki->kg(mt*mt)
18,5 kg/m2 ve daha düşük değerler = Zayıf.
18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
30,0 ve 34,9 kg/m2 arasındaki değerler = 1. derece obezite.
35,0 ve 39,9 kg/m2 arasındaki değerler = 2. derece obezite.
    */
        
        kitleEndeksHesapla();
        

    }

    private static void kitleEndeksHesapla() {
        System.out.print("kilonuzu kg olarak giriniz : ");
        double kilo = input.nextDouble();
        System.out.print("boy uzunluğunuz  metre olarak giriniz : ");
        double boy = input.nextDouble();
        double endex = (boy*boy)/kilo;

        if (endex < 18.5 ) {
            System.out.println("Zayıf");
        } else if (endex >=18.5 && endex < 25){
            System.out.println("Normal kilolu");
        } else if (endex >=25 && endex <30) {
            System.out.println("Kilolu");
        } else if (endex >=30 && endex < 35) {
            System.out.println("1. derece obezite");
        } else if (endex >= 35 && endex < 40) {
            System.out.println("2. derece obezite");
        } else
            System.out.println("durumunuz kritik!!");

    }
}
