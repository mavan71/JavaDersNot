package J07_StringManipulation;

import java.util.Scanner;

public class C07_IndexOf_lastIndexOf {
    public static void main(String[] args) {



// indexof : char karakter ya da String metnin kaçıncı indexten başladığını veren bir methotdur.
        // sonuç integer dir.


        String isim = "Madem geldin dünyaya otur çalış Java'ya";

        System.out.println(isim.indexOf('a')); // birden çok karakter veya string için soldan sağa ilk okunan değerin indexini verir.
        System.out.println(isim.indexOf("ya"));
        System.out.println(isim.indexOf(":"));  // olmayan karakter için index -1 verir.
        System.out.println("isim.indexOf(\"a\",13) = " + isim.indexOf("a", 13)); //13. indexten sonraki 'a' karakterinin indexini verir.



        /*
        last index of :
        string içinde aranan karakter veya karakterlerin sondan itibaren ilk indexini verir.
           */
/** lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */


        System.out.println(isim.lastIndexOf("ya"));
        System.out.println(isim.indexOf("ya"));
        System.out.println(isim.lastIndexOf("x"));


        /* Task: girilen bir ifadenin aşağıdaki şartları sağlamasını kontrol eden co creat edin
        a) girilen ifade 'java' içermiyor.
        b) girilen ifade 1 adet 'java' içeriyor.
        c) girilen ifade birden çok 'java' içeriyor.
         */


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz :");
        String cumle = scan.nextLine();

                if (cumle.indexOf("java")==-1) {
                    System.out.println("java bulunmaz");
                }else if (cumle.indexOf("java")== cumle.lastIndexOf("java")) {
                    System.out.println("bir tane java bulunur ");
                }else System.out.println("birden fazla java bulunur");






































    }
}
