package J17_PassByValue;

public class C02_PassByValue {

    public static void main(String[] args) {

//  task -> verilen fiyat için %11 %22 ve %33  indirimli  fiyatı print eden return type METHODlar  create ediniz.

        double fiyat= 100;
        System.out.println("fiyat = " + fiyat);

        System.out.println("yuzdeOnbirİndirim(100) = " + yuzdeOnbirİndirim(100));

        System.out.println("fiyat :" + fiyat);

        System.out.println("yuzdeYirmiikiİndirimli(100) = " + yuzdeYirmiikiİndirimli(100));

        System.out.println("fiyat = " + fiyat);

        System.out.println("yuzdeotuzucİndirim(100) = " + yuzdeotuzucİndirim(100));

        System.out.println("fiyat = " + fiyat);


    }

    private static double yuzdeotuzucİndirim(double fiyat) {
        double result = fiyat*0.67;
        return result;
    }

    private static double yuzdeYirmiikiİndirimli(double fiyat) {
        double result = fiyat*0.78;
        return result;
    }

    private static double yuzdeOnbirİndirim(double fiyat) {
        double indirimli= fiyat*0.89;
        
        return indirimli;
    }
}
