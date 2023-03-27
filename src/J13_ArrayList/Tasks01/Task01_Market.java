package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task01_Market {
    static Scanner scan = new Scanner(System.in);

    static double ortalama;
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */


        ArrayList <String> haftanınGünleri = new ArrayList <> (List.of("Pazartesi", "Salı","Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
        ArrayList <Integer> günlükKazanc = new ArrayList <> ();
       int günler=0;

       while (günler<7){
           System.out.println(haftanınGünleri.get(günler) + " gününün kazancını giriniz");
            int input=scan.nextInt();
            günlükKazanc.add(input);
            günler++;

       }
        System.out.println(günlükKazanc);


        System.out.println("haftalık ortalama kazanc :" + getOrtalamaKazanc(günlükKazanc));

        System.out.println("ortalama üstü kazancın olduğu günler "+getOrtalamaninUstundeKazancGünleri( haftanınGünleri, günlükKazanc, ortalama));

        System.out.println("ortalama kazancın altındaki günler :" + getOrtalamaninAltındaKazancGünleri(haftanınGünleri, günlükKazanc, ortalama));

        System.out.println("Ortalama kazancın olduğu gün/günler :" +ortalamaKazancGünü(haftanınGünleri, günlükKazanc, ortalama));

    }
    public static ArrayList<String> ortalamaKazancGünü (ArrayList <String> haftanıngünleri, ArrayList <Integer> günlükKazanc, double ortalama) {
        ArrayList<String> ortalamaKazancGünü = new ArrayList<>();
        for (int i = 0; i < haftanıngünleri.size() ; i++) {
            if (günlükKazanc.get(i)== ortalama){
                ortalamaKazancGünü.add(haftanıngünleri.get(i));
            }

        }
        return ortalamaKazancGünü;

    }
    public static double getOrtalamaKazanc(ArrayList <Integer> list){
        int toplam=0;
        for (int i = 0; i < list.size(); i++) {
            toplam+=list.get(i);

        }
         ortalama=toplam/list.size();
        return ortalama;
    }
    public static ArrayList<String> getOrtalamaninUstundeKazancGünleri(ArrayList <String> haftanıngünleri, ArrayList <Integer> günlükKazanc, double ortalama ){
        ArrayList<String> ortalamaUstuGünler = new ArrayList<>();
        for (int i = 0; i < haftanıngünleri.size() ; i++) {
            if (günlükKazanc.get(i)> ortalama){
                ortalamaUstuGünler.add(haftanıngünleri.get(i));
            }

        }
        return ortalamaUstuGünler;
    }

    public static ArrayList<String> getOrtalamaninAltındaKazancGünleri(ArrayList <String> haftanıngünleri, ArrayList <Integer> günlükKazanc, double ortalama ){
        ArrayList<String> ortalamaAltıGünler = new ArrayList<>();
        for (int i = 0; i <haftanıngünleri.size() ; i++) {
            if (günlükKazanc.get(i)< ortalama){
                ortalamaAltıGünler.add(haftanıngünleri.get(i));
            }

        }
        return ortalamaAltıGünler;
    }
}
