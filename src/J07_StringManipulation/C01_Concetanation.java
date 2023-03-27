package J07_StringManipulation;

public class C01_Concetanation {
    public static void main(String[] args) {


        /*
        cocat () metodu içine parametre aldığı String variable'yı çalıştığı String sonuna birleştirir.
        Java 'da "+" işleminde en az bir String ifade varsa aritmetik toplama değil birleştirme yapılır.
         */

        String qa = "safvet";
        String lead = "vedat";

        System.out.println(qa.concat(lead)); // qa Strin ile lead String birleştirildi.
        System.out.println(qa); // String metodları variable'yi kalıcı değil geçici değişiklik yapar.
                                    // kalıcı değişiklik olması için değişken ataması yapılması gerekmektedir.


        qa = qa.concat(lead);  // qa "=" ile atama yapılınca değişiklik olur.
        System.out.println(qa);

        qa= lead.concat(qa);
        System.out.println(qa);

        System.out.println(qa.concat("true"));
        System.out.println((lead.concat(true + "$")));
        System.out.println(lead.concat(53 + "çay"));

        // Önemli Not*** = concat methodu parametre olarak String harici aldığı tüm dataları Sting eçevirip concat eder. (birleştirir) (yukarıdaki örnek)


    }
}
