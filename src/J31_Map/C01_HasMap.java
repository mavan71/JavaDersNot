package J31_Map;

import java.util.HashMap;

public class C01_HasMap {

    public static void main(String[] args) {

        /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
            dublicate kabul etnez
            Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */


        HashMap<String,String> hm = new HashMap<>();
        //hm.put ("key", "value"); // girilen map key değerlerini map e eleman (Entry) olarak ekler
        hm.put("Amazon","296 Avro");
        hm.put("Ebay",null); // value null değeri alabilir.
        hm.put("Saturn","296 Avro");
        hm.put("Vatan Comp","150 Avro");
        hm.put("Apple Store","400 Avro");
        hm.put("Apple Store","450 Avro"); // "Apple Store" key 400 olan value değeri 450 yapıldı
        hm.put(null,"350 Avro"); // key null değer alabilir
        hm.put(null,"375 Avro"); // key null değeri update edildi
        hm.put("Teknosa","299 Avro");
        hm.put("Mediamark","399 Avro");

        //map print ;

        System.out.println("hm = " + hm);


    }
}
