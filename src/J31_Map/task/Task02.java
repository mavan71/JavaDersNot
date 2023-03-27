package J31_Map.task;

import java.util.HashMap;
import java.util.Map;

public class Task02 {

    public static void main(String[] args) {

/*
Task ->
 Key:isim ,email,adres,telefon
 Key'lere ait value'leri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
 print eden code create ediniz.
 */

        HashMap<String,String> kartMurat= new HashMap();
        kartMurat.put("isim","Murat");
        kartMurat.put("adres","yan sokak");
        kartMurat.put("telefon","0535");
        kartMurat.put("e_mail","@gmail.com");

        HashMap<String,String> kartAbdi= new HashMap();
        kartAbdi.put("isim","Abdi");
        kartAbdi.put("adres","gümüşler apt");
        kartAbdi.put("telefon","0543");
        kartAbdi.put("e_mail","@hotmail.com");

        Map<String,HashMap<String,String>> kartVizit= new HashMap();

        kartVizit.put("QA tester1",kartMurat);
        kartVizit.put("QA tester2",kartAbdi);

        System.out.println("kartVizit = " + kartVizit);

        Map<Integer,Task02_KartVizit> krtVzt= new HashMap<>();


        Task02_KartVizit k1 = new Task02_KartVizit("Abdi","gümüşler apt","@gmail","0535");
        Task02_KartVizit k2 = new Task02_KartVizit("Ali","elma ağacı yanı","@superonline","9999");

        krtVzt.put(k1.id,k1);
        System.out.println("krtVzt = " + krtVzt);

        krtVzt.put(k2.id,k2);
        System.out.println("krtVzt = " + krtVzt);
    }
}
