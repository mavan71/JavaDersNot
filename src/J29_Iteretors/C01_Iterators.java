package J29_Iteretors;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {


        List<String> l1 =  new ArrayList<>(Arrays.asList ("Harika Eda", "Ceren", "Tuğba","Taha","İsmail","Murat"));

        System.out.println("l1 ilk hali :" + l1);

      // Task1-- list elemanlarını for i yöntemiyle yazdırınız

        System.out.println("************ task 01 **************");

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+ " ");
        }

        // task2: for each ile l1 elemanlarını yazdırınız


        System.out.println("************ task 2 **************");

        for (String str :l1) {
            System.out.println(str + " ");
        }

       // task03- l1 her bir elemanını for loop ile update ediniz

        System.out.println("************ task 3 **************");

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i)+"maşallah");
        }
        System.out.println("l1 = " + l1);

        // task4: l1 i for each ile update ediniz.

        System.out.println("************ task 4 **************");

        for (String str :l1) {
            System.out.println(str + ":(");
        }


        /*
        index desteklemeyen yapılarda (collections) tekrarlayan (loop) aksiyonları için for each loop update yapamayabilir (task04 deki gibi)
        bu durumda java itetatör interface den tanımlanacak variable ile tekrarlanması gereken aksiyonlar index olmadan tanımlanabilir
         */

        System.out.println("************iterator task***********");

    // step1:
        Iterator<String> iter1 = l1.iterator(); // l1 list elemanları tekrara alınması için iter1 tanımlandı.

    // step2:

        while (iter1.hasNext()) { // iter1 elemanları için (cursor) sonrasında eleman varlığını kontrol eder. t/f döndürür
            System.out.print(iter1.next()+" "); // iter1 pointer in önündeki elemanı verir (return eder)
        }

        //task5 : l1 elemanlarını silip print eden codee

        System.out.println();

        System.out.println("************** task 5 **********************");

        Iterator<String> iter2 = l1.iterator();
        while (iter2.hasNext()) {
            iter2.next();
            iter2.remove();
            System.out.println(l1);
        }



        List<String>l2=new ArrayList<String>(Arrays.asList("Javacan", "Javatar", "Başarı", "Gayrete","Aşıktır"));

        // task06--> l2 nin elemanlarını :) ile update edip print ediniz.

        System.out.println("******************* task06 **********************");

        System.out.println("update öncesi " +l2);
        ListIterator<String> iter3 = l2.listIterator(); // set() metodunu kullanabilmek için ListIterator kullandık
        while (iter3.hasNext()){
            iter3.set(iter3.next()+ ":)");
        }

        System.out.println("update sonrası " + l2);



        List<String>l3=new ArrayList<String>(Arrays.asList("Kuzugerdan","Küşleme", "Kokoreç","Havuç dilimi"));

        System.out.println("******************* task07 **********************");

        // task07--> l2 elemanlarını ilk harfi büyük kalan harfleri ** yapıp l3 ekleyen code create ediniz.

        ListIterator<String> iter4=l2.listIterator();
        while (iter4.hasNext()){
            iter4.set(iter4.next().substring(0,1).toUpperCase()+"***");
          //  iter4.add(l3.toString());
        }

        iter4.add(l3.toString());
        System.out.println(l2);


    }
}
