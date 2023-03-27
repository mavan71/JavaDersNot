package J07_StringManipulation;

public class C02_Length {
    public static void main(String[] args) {



        /*
length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
butun karakterleri(boşluk vs) sayıp adedini verir
 */
        String str = "Madem geldin dünyaya otur çalış Java'ya";

        int karakter = str.length();
        System.out.println(karakter);
        System.out.println(str.length());

        String str1 =" ";
        System.out.println(str1.length());
        String str2 ="";
        System.out.println(str2.length());
        String str3 =null;
      //  System.out.println(str3.length()); // run time exception
        System.out.println(("ağam code cıncık"));

        /* null atanan String'ler herhangi bir metod call etmez (çalışmaz)
        null- case sensitive dir. yani büyük küçük harf duyarlıdır.
        null --> bir değer değildir. sadece hiçliği gösteren bir pointer (işaretçi)'dir.

         */

        String name; //declare edilmiş ama atanmamış bir String type variable dir.
     //   name.concat(str1); // atanmamış (initalize edilmemiş ) String metod call etmez










    }
}
