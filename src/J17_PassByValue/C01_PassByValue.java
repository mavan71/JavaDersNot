package J17_PassByValue;

public class C01_PassByValue {

    public static void main(String[] args) {


        /*
Java Pass By Value bir programlama dilidir.
Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

 */
// task -> verilen fiyat için %24 artırılmış fiyatı print eden method  create ediniz.



        double fiyat =100; // double type primitive variable
        fiyatArtır(100); // meth called

        System.out.println("method call sonrası fiyat değeri :" + fiyat);//100






    }

    private static void fiyatArtır(double ebik) {
        double zamlı = ebik*1.24;
        System.out.println("fiyatın zamlı hali :" + zamlı);

    }
}
