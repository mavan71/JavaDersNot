package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_kendim03 {
    static Scanner scan = new Scanner(System.in);
 static int fiyat = 1000;


    public static void main(String[] args) {

        /*
        Input olarak verilen satış fiyatı, müşterikartı var mı?
        ve uyeliği kaç yıllık? bilgilerini değerlendirip
        - uye değilse %5 indirim,
        - üyeliği var ama 5 yıldan az ise %10 indirim,
        - üyeliği var ve 5 yıldan fazla ise %15 indirim uygulayıp,
        asıl fiyatı, indirim miktarını ve indirimli fiyatı yazdıran bir method create ediniz.
         */


        
    damping();
        
    }

    private static void damping() {
        System.out.println("**************** ClarusWay Markete Hoş Geldiniz ********************");
        System.out.println("Müşteri kartınız varsa 'evet' yoksa 'hayır' yazınız ");
        String kartSorgu= scan.nextLine().toLowerCase();
        double indirim=0;
        if (kartSorgu.equals("hayır")){
            System.out.println("ürünün indirimsiz fiyatı = " + fiyat);
            System.out.println("indirim miktarı = " + fiyat*0.05);
            System.out.println("indirim sonrası ödeneyeceğiniz fiyat = " + (fiyat-fiyat*0.05));
            System.out.println("******************* yine bekleriz iyi günler dileriz ********************");
        } else if (kartSorgu.equals("evet")){
            System.out.println("Lütfen kaç yıllık üye olduğunuzu giriniz:");
            int yil=scan.nextInt();
            if (yil<5){
                System.out.println("ürünün indirimsiz fiyatı = " + fiyat);
                System.out.println("indirim miktarı = " + fiyat*0.10);
                System.out.println("indirim sonrası ödeneyeceğiniz fiyat = " + (fiyat-fiyat*0.10));
                System.out.println("******************* yine bekleriz iyi günler dileriz ********************");
            }else if (yil >=5) {
                System.out.println("ürünün indirimsiz fiyatı = " + fiyat);
                System.out.println("indirim miktarı = " + fiyat*0.15);
                System.out.println("indirim sonrası ödeneyeceğiniz fiyat = " + (fiyat-fiyat*0.15));
                System.out.println("******************* yine bekleriz iyi günler dileriz ********************");
            }else System.out.println("Lütfen sıfırdan büyük bir sayı giriniz");
        } else System.out.println("lütfen evet veya hayır yazınız");


    }
}
