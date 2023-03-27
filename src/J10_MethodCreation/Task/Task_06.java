package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_06 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        // girilen iki boyuta göre seçilen geometrik şekli (kare - dikdörtgen-üçgen ) alan ve çevre değerlerini print eden method cerate ediniz.

       geometrikHesapla();




    }

    private static void geometrikHesapla() {
        System.out.println("Lütfen 1. boyutu giriniz.:");
        double boyut1= scan.nextDouble();
        System.out.println("Lütfen 2. boyutu giriniz.:");
        double boyut2 =scan.nextInt();

        System.out.println("Lütfen geometrik şekil giriniz :");
        String geo =scan.next().toLowerCase();

        switch (geo){
            case "kare":
                dortgenCevre(boyut1, boyut2);
                dortgenAlan(boyut1,boyut2);
                break;
            case "dikdörtgen":
                dortgenCevre(boyut1,boyut2);
                dortgenAlan(boyut1,boyut2);
                break;
            case "ücgen":
                UcgenCevre(boyut1,boyut2);
                ucgenAlan(boyut1);
                break;
            default:
                System.out.println("Lütfen geçerli bir geometrik şekil giriniz");

        }

    }



    private static void UcgenCevre(double boyut1, double boyut2) {
        System.out.println("Üçgen için 3. kenarı giriniz :");
        double boyut3 = scan.nextDouble();
        System.out.println("üçgenin çevresi :" + boyut1+boyut2+boyut3);
    }

    private static void dortgenAlan(double boyut1, double boyut2) {
        System.out.println("dörtgenin alanı :" + (boyut1*boyut2));
    }

    private static void dortgenCevre(double boyut1, double boyut2) {
        System.out.println("dörtgen çevresi :" + (boyut1+boyut2)*2);
    }

    private static void ucgenAlan(double boyut1) {
        System.out.println("Üçgene ait yükseklik giriniz :");
        double h = scan.nextDouble();
        System.out.println("üçgenin alanı :" + (boyut1*h)/2);
    }

}
