package J31_Map;

import java.util.HashMap;

public class C03_get {

    public static void main(String[] args) {

        // map.get(key)--> girilen key e ait value return eder.

        HashMap<String,String> hm = new HashMap<>();

        hm.put("Amazon","296 Avro");
        hm.put("Saturn","296 Avro");
        hm.put("Vatan Comp","150 Avro");
        hm.put("Apple Store","400 Avro");
        hm.put("Apple Store","450 Avro");
        hm.put("Teknosa","299 Avro");
        hm.put("Mediamark","399 Avro");

        System.out.println("hm = " + hm);

        System.out.println("hm Amazon value = " + hm.get("Amazon"));//296 Avro

        System.out.println("hm. amazon value = " + hm.get("amazon"));//null

        System.out.println("hm.get(33) = " + hm.get(33));//null


    }
}
