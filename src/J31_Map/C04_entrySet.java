package J31_Map;

import java.util.HashMap;

public class C04_entrySet {

    public static void main(String[] args) {


        HashMap<String,String> hm = new HashMap<>();

        hm.put("Amazon","296 Avro");
        hm.put("Saturn","296 Avro");
        hm.put("Vatan Comp","150 Avro");
        hm.put("Apple Store","400 Avro");
        hm.put("Apple Store","450 Avro");
        hm.put("Teknosa","299 Avro");
        hm.put("Mediamark","399 Avro");

        System.out.println("hm = " + hm);

        System.out.println("hm.entrySet() = " + hm.entrySet());
    }
}
