package J17_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {

        /*
 eger bir method2'a yapılan değişiklik kalıcı olsun istenirse
2 ) değişklik  yapılan variable'lar atama tanımlanır.

         */

        double etiketFiyati=100;

        double indirimOrani=0.10;


        System.out.println("indirim öncesi etiket fiyatı :" + etiketFiyati); // 100


        System.out.println("indir(etiketFiyati, indirimOrani) = " + indir(etiketFiyati, indirimOrani)); // 90

        etiketFiyati= indir(etiketFiyati, indirimOrani);



        System.out.println("indirim sonrası etiket fiyatı :" + etiketFiyati); // 90







    }

    private static double indir(double fiyat, double oran) {

        fiyat*=1-oran;

        return  fiyat;
    }


}
