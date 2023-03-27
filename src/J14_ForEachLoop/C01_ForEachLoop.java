package J14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        /*
for-each loop for loop'un gelilmş halıdir.
1. clean code- yazım kolaylığı
2. code okuma kolaylıgı
3. hata yapma riskini azaltır.

 */

    List<Integer> sayiList=new ArrayList<Integer>(List.of(16,21,33,54,58,15,45));

        System.out.println("**** Task01 ****");
        System.out.println("************** for i ile ************");

   // task01--> list elemanlarını ayrı satırda print eden code create ediniz.

        for (int i = 0; i < sayiList.size(); i++) {
            System.out.println(sayiList.get(i));

        }

        System.out.println("**** for each ile ****");

        for (Integer ebikGabık : sayiList) {
            System.out.println(ebikGabık);
        }


        // Task02: --> list tek elemanlarını ilk üç eleman hariç print eden code create ediniz.
        System.out.println("*** task02 ****");
        for (Integer w :sayiList.subList(3, sayiList.size())) {
            if (w%2==1){
                System.out.println(w);
            }

        }


      //  task03 --> list elemanlarını 2 ve 5 index dahil toplamını print eden code create ediniz.

        System.out.println("**** task03 ****");
            int toplam=0;
        for (Integer w : sayiList.subList(2,6)) {
            toplam+=w;

        }
        System.out.println("toplam = " + toplam);




    }
}
