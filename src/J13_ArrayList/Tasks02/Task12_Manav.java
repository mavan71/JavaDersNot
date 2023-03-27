package J13_ArrayList.Tasks02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task12_Manav {
    static Scanner input = new Scanner(System.in);
    static LocalDate bugün = LocalDate.now();
    static double totalFiyat;


    public static void main(String[] args) {

        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */


        urunSec();

    }

    public static void urunSec() {
        System.out.println("******** ClarusWay Gross Markete Hoşgeldiniz ********" +
                "\n Ürün Listemizden İstedğiniz Ürünü Tuşlayabilirsiniz " +
                "\n 1- Mango  \n 2- Papaya \n 3- Avakado \n 4- Ejder Meyvesi \n 5- Yıldız Meyvesi \n 0- Çıkış");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                mangoTart();
                break;
            case 2:
                papayaTart();
                break;
            case 3:
                avakadoTart();
                break;
            case 4:
                ejderMeyvesiTart();
                break;
            case 5:
                yıldızMeyvesiTart();
                break;
            case 0:
                cıkısYap();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız \n Lütfen Tekrar Deneyiniz");
                urunSec();
                break;
        }

    }

    private static void tercih() {
        System.out.println("Ürünleriniz sepetinize başarıyla eklenmiştir" +
                " \n sepet toplamınız : " + totalFiyat + " dır" +
                " \n Alışverişe devam etmek isterseniz :1 'e" +
                "\n Kasaya gitmek isterseniz 0'a basınız");
        int tercih = input.nextInt();
        switch (tercih) {
            case 1:
                urunSec();
                break;
            case 0:
                kasa();
                break;
            default:
                System.out.println("Hatalı giriş, Lütfen tekrar deneyiniz");
                tercih();
                break;
        }
    }

    public static void kasa() {
        System.out.println("******* ödeme ekranındasınız ******* " +
                           "\n toplam ücret :" + totalFiyat +
                           "\n tekrar alışveriş yapmak için 1'e" +
                           "\n çıkş için 2'ye basınız" );
        int a=input.nextInt();
        switch (a) {
            case 1:
                urunSec();
                break;
            case 2:
                cıkısYap();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız, Lütfen tekrar deneyiniz");
                kasa();
                break;
        }

    }

    public static void mangoTart() {
        double mangoFiyat = 35.50;
        System.out.println("Taptaze Mangolarımız Sizler İçin Özenle Paketlenmektedir" +
                "\n " + bugün + " itibariyle kg fiyatı " + mangoFiyat + " dır " +
                "\n Lütfen Kg seçimi Yapınız");
        int kg = input.nextInt();
        if (kg > 10) {
            System.out.println("Üzgünüz, Tek seferde en fazla 10 kg verebiliyoruz ");
            mangoTart();
        } else if (kg < 0) {
            System.out.println("Lütfen sıfırdan büyük bir sayı giriniz");
            mangoTart();
        } else {
            totalFiyat+=(kg * mangoFiyat);
            tercih();
        }

    }


    public static void papayaTart() {
        double papayaFiyat = 55.40;
        System.out.println("Taptaze Papayalarımız Sizler İçin Özenle Paketlenmektedir" +
                "\n " + bugün + " itibariyle kg fiyatı " + papayaFiyat + " dır " +
                "\n Lütfen Kg seçimi Yapınız");
        int kg = input.nextInt();
        if (kg > 10) {
            System.out.println("Üzgünüz, Tek seferde en fazla 10 kg verebiliyoruz ");
            papayaTart();
        } else if (kg < 0) {
            System.out.println("Lütfen sıfırdan büyük bir sayı giriniz");
            papayaTart();
        } else {
            totalFiyat+=(kg * papayaFiyat);
            tercih();
        }
    }

    public static void avakadoTart() {
        double avakadoFiyat = 45.95;
        System.out.println("Taptaze Avakadolarımız Sizler İçin Özenle Paketlenmektedir" +
                "\n " + bugün + " itibariyle kg fiyatı " + avakadoFiyat + " dır " +
                "\n Lütfen Kg seçimi Yapınız");
        int kg = input.nextInt();
        if (kg > 10) {
            System.out.println("Üzgünüz, Tek seferde en fazla 10 kg verebiliyoruz ");
            avakadoTart();
        } else if (kg < 0) {
            System.out.println("Lütfen sıfırdan büyük bir sayı giriniz");
            avakadoTart();
        } else {
            totalFiyat+=(kg * avakadoFiyat);
            tercih();
        }
    }

    public static void ejderMeyvesiTart() {
        double ejderFiyat = 75.25;
        System.out.println("Taptaze Ejder Meyvelerimiz Sizler İçin Özenle Paketlenmektedir" +
                "\n " + bugün + " itibariyle kg fiyatı " + ejderFiyat + " dır " +
                "\n Lütfen Kg seçimi Yapınız");
        int kg = input.nextInt();
        if (kg > 10) {
            System.out.println("Üzgünüz, Tek seferde en fazla 10 kg verebiliyoruz ");
            ejderMeyvesiTart();
        } else if (kg < 0) {
            System.out.println("Lütfen sıfırdan büyük bir sayı giriniz");
            ejderMeyvesiTart();
        } else {
            totalFiyat+=(kg * ejderFiyat);
            tercih();
        }
    }

        public static void yıldızMeyvesiTart () {
            double yildizFiyat = 75.25;
            System.out.println("Taptaze Yıldız Meyvelerimiz Sizler İçin Özenle Paketlenmektedir" +
                    "\n " + bugün + " itibariyle kg fiyatı " + yildizFiyat + " dır " +
                    "\n Lütfen Kg seçimi Yapınız");
            int kg = input.nextInt();
            if (kg > 10) {
                System.out.println("Üzgünüz, Tek seferde en fazla 10 kg verebiliyoruz ");
                yıldızMeyvesiTart();
            } else if (kg < 0) {
                System.out.println("Lütfen sıfırdan büyük bir sayı giriniz");
                yıldızMeyvesiTart();
            } else {
                totalFiyat+=(kg * yildizFiyat);
                tercih();
            }
        }

        public static void cıkısYap () {
            System.out.println("*************** ClarusWay Gros Market iyi günler diler ***************" +
                                " \n  ***************Afiyet Olsun, Yine bekleriz ***************");

        }



}
