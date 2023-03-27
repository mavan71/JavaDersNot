package J30_Collection.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class C01_Set {

    public static void main(String[] args) {

/*
 Set :  1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. mükerrer(duplicate) eleman olmaz.
        2) sadece bir null değeri alabilir.(treeSet hariç).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
             Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin HashCode() methodu kullanilir.
             Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı oluşturma sürecine verilen isimdir.
             Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum datalara ulasilabilir.


        Set     --> HashSet         : 1) HashSet, duplication'a(tekrarlı eleman) izin vermez.
                                        Eger bir elemani tekrar HashSet'e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                                      2) Haset'ler Set'ler arasinda en hizli olanıdir. bir algoritmaya göre kayit eder.
                                       değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)
                                      3) HashSet "null" object'ini eleman olarak kullanabilir.
                                      Ancak birden fazla null degerini bir HashSet'e eklemek isterseniz sadece bir tane null degeri olur.

                    LinkedHashset   : 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                                      2) LinkedHashSet, HashSet'den daha yavas calisir.
                                      3) LinkedHashSet "null" object'ini eleman olarak kullanabilir.
                                      4) Ekleme ve remove islemlerinde hizlidirlar.

                    TreeSet         : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
                                2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
                              3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmalı...
                              4)AHAN DA TRİCK :TreeSet "null" object'ini eleman olarak kullanilamaz.


     Set Methods :
        .add(eleman);-->Set'e eleman ekler
        .addAll(collection);-->istenen collection'in tum elemanlarini ekler
        .contains(eleman);-->istenen eleman set'te varsa true, yoksa false return eder.
        .containsAll(collection);-->istenen collection'in tumu aranan sette var ise true, yoksa false return eder.
        .remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false return eder.
        .removeAll(collection);-->istenen collection'in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false return eder.
        .equlas(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false return eder.
        .retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false return eder.
          (kesişen ortak elemanları döndürür.)
        .clear();-->sett'teki Tum elemanlari siler
        .isEmpty();-->Sette hic eleman yoksa true, varsa false return eder
        .size();-->set'in eleman sayisini verir

 */


        HashSet<String> hs1 =  new HashSet<>();
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("JavaCan","JavaSu","JavaNaz","javİye","JavId"));

        // set print etme :

        System.out.println("hs2 = " + hs2);

       // set add methodu:

        hs2.add("JavaNur");
        System.out.println("add sonrası hs2 = " + hs2);

        // sete tekrarlı eleman ekleme;

        hs2.add("JavaSu");
        System.out.println("tekrarlı eleman ekleme sonrası hs2 = " + hs2);

// set e null ekleme

        hs2.add(null);
        hs2.add(null);
        hs2.add(null);
        hs2.add(null);

        System.out.println("null sonrası hs2 = " + hs2);

        HashSet<String> hs3 = new HashSet<>(Arrays.asList("Baklava","Sütlaç","Profiterol","Hoşaf","Güllaç"));
        System.out.println("hs3 = " + hs3);

   // addAll method

        hs2.addAll(hs3);
        System.out.println("hs2 = " + hs2);

  // set remove

        System.out.println("hs2.remove(null) = " + hs2.remove(null)); // varsa siler true döndürür/yoksa false verir

        System.out.println("hs2.removeAll(hs3) = " + hs2.removeAll(hs3)); // varsa siler true döndür/yoksa false verir
        System.out.println("hs2 = " + hs2);

    // set size

        System.out.println("hs2.size() = " + hs2.size());

    // isEmpty method,

        System.out.println("hs2.isEmpty() = " + hs2.isEmpty());

    // set clear method

        hs2.clear();

        System.out.println("clear sonrası hs2 = " + hs2);

        System.out.println("clear sonrası hs2.size() = " + hs2.size());

        System.out.println("clear sonrası hs2.isEmpty() = " + hs2.isEmpty());

    // set contains method

        System.out.println("hs3.contains(\"Baklava\") = " + hs3.contains("Baklava"));// içeriyorsa true / içermiyorsa false

        System.out.println("hs3.contains(\"Künefe\") = " + hs3.contains("Künefe"));// içeriyorsa true / içermiyorsa false


    // hashCode method

        System.out.println("hs3.hashCode() = " + hs3.hashCode());
        System.out.println("hs2.hashCode() = " + hs2.hashCode());




    }
}
