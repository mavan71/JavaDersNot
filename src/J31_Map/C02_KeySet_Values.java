package J31_Map;

import java.util.HashMap;

public class C02_KeySet_Values {
    public static void main(String[] args) {

        // map.keySet()--> map key değerlerini Set'e (collection) atayıp return eder.
        // map.values()-->

        HashMap<String,String> hm = new HashMap<>();

        hm.put("Amazon","296 Avro");
        hm.put("Saturn","296 Avro");
        hm.put("Vatan Comp","150 Avro");
        hm.put("Apple Store","400 Avro");
        hm.put("Apple Store","450 Avro");
        hm.put("Teknosa","299 Avro");
        hm.put("Mediamark","399 Avro");

        System.out.println("hm = " + hm);
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        // task--> map in key ve value larını aynı satırda (satır-satır) print eden code create ediniz (for each ile)

        for (String str :hm.keySet()) {
            System.out.print(str+ " ");

        }
        System.out.println();

        for (String str :hm.values()) {
            System.out.print(str+ " ");
        }


    }
}
