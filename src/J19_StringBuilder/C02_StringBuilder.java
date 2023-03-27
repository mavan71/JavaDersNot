package J19_StringBuilder;

public class C02_StringBuilder {

    public static void main(String[] args) {


        // StringBuilder create etme;

        // 1. yol :

        StringBuilder sb1 = new StringBuilder();   // default 16 capacity boş sb1
        System.out.println("sb1 = " + sb1); //
        System.out.println("sb1.length() = " + sb1.length());  // 0
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16

        sb1.append("Murat"); // sb1'e Murat value eklendi
        System.out.println("sb1 = " + sb1); // Murat
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16
        System.out.println("sb1.length() = " + sb1.length()); // 5

        sb1.append(" QA tester team lead");
        System.out.println("sb1 = " + sb1); // Murat QA tester team lead
        System.out.println("sb1.capacity() = " + sb1.capacity()); //34

        sb1.append("çooooooğh zengin olasan ").append(1453).append(true);
        System.out.println("sb1 = " + sb1); // Murat QA tester team leadçooooooğh zengin olasan 1453true
        System.out.println("sb1.capacity() = " + sb1.capacity()); // capacity aşımında yeniCapacity=capacity*2+2 olarak atanır. //70


        // 2. yol :


        StringBuilder sb2 = new StringBuilder("Aydın beye hızlıcana offer");
        System.out.println("sb2 = " + sb2); // Aydın beye hızlıcana offer
        System.out.println("sb2.length() = " + sb2.length()); // 26
        System.out.println("sb2.capacity() = " + sb2.capacity()); // 42

        /*
        initialize edilen sb larda capacity=16+ ilk değer legth olarak
         */

        //trimToSize(); // capacity legth fazlası karakter siler.

        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity()); // 26
        System.out.println("sb2.length() = " + sb2.length()); // 26

        //3. yol :

        StringBuilder sb3 = new StringBuilder(17); //initialize edilmiş ancak kapasite atanmış sb.

        System.out.println("sb3 = " + sb3); // hiçlik
        System.out.println("sb3.length() = " + sb3.length()); // 0
        System.out.println("sb3.capacity() = " + sb3.capacity()); // 17
        sb3.append("Taha bey'e senior offer çek...");
        System.out.println("sb3.capacity() = " + sb3.capacity());//17*2+2=36


        // sb deki index character'i alma:

        System.out.println("sb3.charAt(16) = " + sb3.charAt(16)); // r

        StringBuilder sb4 = new StringBuilder("Murat Inci");
        StringBuilder sb5 = new StringBuilder("Murat Inci");

        System.out.println("sb4.equals(sb5) = " + sb4.equals(sb5)); // false

        System.out.println(sb4 == sb5); // false

        System.out.println("sb3.charAt(16) = " + sb3.charAt(16));//r
      //  System.out.println("sb3.charAt(99) = " + sb3.charAt(99));// olmayan karakter için RTE verir


        // sb deki belirli aralıktaki karakteri alma;

        System.out.println("sb3.subSequence(7,27) = " + sb3.subSequence(7, 27)); // y'e senior offer çek

        System.out.println("sb3.substring(12) = " + sb3.substring(12)); // enior offer çek...

        System.out.println("sb3.substring(7,27) = " + sb3.substring(7, 27)); // y'e senior offer çek

        // sb deki istenen index karakteri silme

        System.out.println("sb3.deleteCharAt(9) = " + sb3.deleteCharAt(9)); //Taha bey' senior offer çek...

        // sb deki istenen index aralık karakterleri silme

        System.out.println("sb3.delete(3,7) = " + sb3.delete(3, 7));//Tahy' senior offer çek...

        // istenen sb'a karakter/karakterleri ekleme

        System.out.println("sb3.insert(1, sb2,3,10) = " + sb3.insert(1, sb2, 3, 10)); // sb3 ün 1. indexinden itibaren sb2 nin 3-10 aralığındaki indeini ekle

        System.out.println("sb3.insert(5,sb1) = " + sb3.insert(5, sb1));

        // sb deki istenen index karakteri update etme.

        System.out.println("sb1 update öncesi = " + sb1);//Murat QA tester team leadçooooooğh zengin olasan 1453true
        sb1.setCharAt(13,'$'); // sb1 in 13. index karakteri $ ile update edilir.
        System.out.println("sb1 update sonrası = " + sb1);//Murat QA test$r team leadçooooooğh zengin olasan 1453true


        // ahan da interviev sorusu: sb Character class methodlarını kullanır mı?

        // sb deki istenen index e birden çok karakter eklemek

        System.out.println("replace öncesi sb1 = " + sb1);
        System.out.println("sb1.replace(3,13,\"ebikGabık\") = " + sb1.replace(3, 13, "ebikGabık"));


        // sb obj String variable'e convert (çevirme) etme;

        StringBuilder sb7 = new StringBuilder("İsmail JavaTar ");
        System.out.println("sb7 = " + sb7);//İsmail JavaTar
        System.out.println("sb7.toString().toUpperCase() = " + sb7.toString().toUpperCase()); //İSMAİL JAVATAR

        String name="Javacanlara selam olsun";
        System.out.println("name = " + name); //Javacanlara selam olsun

        StringBuilder sb8 = new StringBuilder(name);
        System.out.println("sb8 = " + sb8); //Javacanlara selam olsun

        /*
        compareTo()--> iki sb i eşitliğini kontrol etmek için ilk karakterden itibaren tüm karakterleri karşılaştırır.
        eşit karakterler için herhangi bir return vermezken farklı karakterler için ASCİİ table göre kaç değer geri veya ileri olduğunu print eder.
        Tüm karakterler eşit ise 0 return eder.

        Trick--> sb ile String variable compare edilirse CTE verir.
         */

        StringBuilder sb9 = new StringBuilder("Başarı Gayrete AŞIKTIR :)");
        StringBuilder sb10 = new StringBuilder("Başarı Gayrete AŞIKTIR :)");
        String str ="Başarı Gayrete AŞIKTIR :)";

        System.out.println("sb9.compareTo(sb10) = " + sb9.compareTo(sb10));// 0--> sb9 - sb10 tüm karakterler eşit
        System.out.println("sb10.compareTo(sb9) = " + sb10.compareTo(sb9));// 0--> sb10 - sb9 tüm karakterleri eşit

        // sb9.compareTo(str) ----> CTE verir
        System.out.println("sb10.compareTo(new StringBuilder(str)) = " + sb10.compareTo(new StringBuilder(str)));//0-->
        System.out.println("sb10.toString().equals(str) = " + sb10.toString().equals(str)); // true


        System.out.println(sb9==sb10);// false
        System.out.println("sb9.equals(sb10) = " + sb9.equals(sb10));// false

      //  Trick :-->Sb de equals () meth aynı == gibi return eder. hem ref hem value kontrolü yapar.

        // SB  character'leri index'e göre ters cevirme
        System.out.println("reverse öncesi sb10 = " + sb10);// başarı gayrete AŞIKTIR :)
        System.out.println("sb10.reverse() = " + sb10.reverse());//  ): RITKIŞA eteryag ıraşab




    }
}
