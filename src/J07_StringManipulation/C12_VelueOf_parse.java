package J07_StringManipulation;

public class C12_VelueOf_parse {
    public static void main(String[] args) {


        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


// task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..


        String bagis1 = "10000";
        String bagis2 = "20316";
        String toplamBagis =bagis1+bagis2;
        System.out.println("toplamBagis = " + toplamBagis);
        int yeniBagıs1 = Integer.valueOf(bagis1); //bagıs1 string değerini integer'e çevirdik
        int yeniBagıs2 = Integer.valueOf(bagis2);

        int toplam = yeniBagıs1 + yeniBagıs2;
        System.out.println("toplam = " + toplam);


        int tc= 987654321;
        String yTC = String.valueOf(tc);
        System.out.println("yTC = " + yTC);

            String Iphone = "$1500";
            String Ipad = "$1000";


            int Iphonef = Integer.valueOf(Iphone.substring(1));

            int Ipadf = Integer.valueOf(Ipad.substring(1));

            int toplamf = Iphonef + Ipadf;
        System.out.println("toplamf = " + toplamf);


        // task : String strA = "$13.99";
                 // String strB = "$17.55";       //     parse methot kullanarak strA + strB toplamını creat eden cod cread ediniz.



        String strA = "$13.99";
        String strB = "$17.55";

        double stra = Double.parseDouble(strA.substring(1));

        double strb = Double.parseDouble(strB.substring(1));

        double total = (stra + strb);
        System.out.println(total);






    }


}
