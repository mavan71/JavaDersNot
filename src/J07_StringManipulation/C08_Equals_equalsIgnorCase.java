package J07_StringManipulation;

public class C08_Equals_equalsIgnorCase {
    public static void main(String[] args) {


        /*
        equals : iki string metnin birbirine eşit olup olmadığını karşılaştırır. sonuç boolean dr. true veya false olur.


        aqualsIgnorcase : iki stringi biribire aşit olup olmadığına bakar ancak büyük küçük harf duyarlılığı yoktur.
         */



        String name1 = "Murat";
        String name2 = "murat";

        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));


// equals ile == farkı

        String s1 ="clarusway"; //String pool variable --> gömlek cebi ** primitive data**
        String s2 ="clarusway"; //String pool variable --> gömlek cebi ** primitive data**
        String s3 =new String("clarusway"); // String data type obj. non-pirimitive data --> heap data
        String s4 =new String("clarusway"); // String data type obj. non-pirimitive data --> heap data
        System.out.println(s1 == s2); // true --> herşeyiyle aynı
        System.out.println(s1.equals(s2)); // true --> equals sadece değerine bakar
        System.out.println(s3 == s4); //    false --> farklı obj. olduğu için
        System.out.println(s3.equals(s4)); // true --> equals sadece değerine bakar



        String sA = "Kadir";
        String sB = "";
        sB = sA+ "";
        System.out.println("sA = " + sA); // Kadir
        System.out.println("sB = " + sB); // Kadir
        System.out.println("sA== sB = " + sA == sB); // false
        System.out.println("sA.equals(sB) = " + sA.equals(sB)); // true
        // equals() methodu sadece String'lerin degerlerini karsilastirir
// bu ornekte sA ile sB nin degerleri AYNI oldugu icin true dondurur

        /*
        String s1 = "text"; kullanımı, eğer varsa, string sabit havuzunda (string constant pool) bir örneği yeniden kullanır.
        Yoksa havuz içerisinde yeniden alan oluşturur. Bu durum Java'ya özgü Java Sanal Makinesi (JVM) tarafından gerçekleştirilen bir durumdur.

        s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
                s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
        Böylece ekrana TRUE yazdırır.
        s1.equals(s2) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
        Bildiğimiz gibi == operatörü hafızadaki adresleri karşılaştırır, s3 ve s4 birbirinden farklı nesneler oldukları
        için farklı adreslerde tutulurlar.  Bu yüzden s3 == s4 ifadesi ekrana FALSE yazdırır.
        s3.equals(s4) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
        */



    }
}
