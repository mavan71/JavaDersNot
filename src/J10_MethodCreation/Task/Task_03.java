package J10_MethodCreation.Task;

import java.util.Locale;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

// task-- //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.

        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen dönüştürülecek birimi giriniz");
        String birim = input.nextLine().toLowerCase();

        System.out.println("Lütfen bir değer giriniz :");
        double deger= input.nextDouble();




        donustur(deger,birim);












    }

    private static void donustur(double deger, String birim) {
        switch (birim){
            case "saat":
                System.out.println("girilen saat"+ deger*60*60 + "saniye" );
            break;
            case "mil":
                System.out.println("girilen mil :" + deger*1.6+ "km");
            break;
            case "kilogram":
                System.out.println("girilen kilogram" + deger*1000 + "gram"  );
            break;
            default:
                System.out.println("hatalı giriş yaptınız");
        }



    }




}
