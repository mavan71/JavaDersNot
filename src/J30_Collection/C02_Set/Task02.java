package J30_Collection.C02_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Task02 {

    public static void main(String[] args) {

  //interview question : girilen String datanın karakterlerini alfabetik print ediniz-> TreeSet'e atanır ...
// hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
// Trick run suresi için System.currrentTimeMillis() meth. call ediniz...


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lütfen bir cümle yazınız");
//        String str = scan.nextLine();
//
//        String strArr []=new String [str.length()];
//
//        TreeSet<String> ts = new TreeSet<String>();
//        ts.add(str);
//        System.out.println(ts);

        long hsBasla =System.currentTimeMillis();
        System.out.println("hsBasla = " + hsBasla);
        HashSet<String> hs = new HashSet<String>();
        hs.add("ahmet");
        hs.add("mehmet");
        hs.add("feride");
        hs.add("cavidan");
        hs.add("mustafa");

        long hsBitir = System.currentTimeMillis();
        System.out.println("hsBitir = " + hsBitir);

        long hsRunSüresi = hsBitir - hsBasla;
        System.out.println("hsRunSüresi = " + hsRunSüresi);

        System.out.println("****************************************************************");

        long tsBasla= System.currentTimeMillis();
        System.out.println("tsBasla = " + tsBasla);
        TreeSet<String> ts2 = new TreeSet<String>();
        ts2.add("ahmet");
        ts2.add("mehmet");
        ts2.add("feride");
        ts2.add("cavidan");
        ts2.add("mustafa");

        long ts2Bitir = System.currentTimeMillis();
        System.out.println("ts2Bitir = " + ts2Bitir);
        Long tsRunSüresi = ts2Bitir - tsBasla;
        System.out.println("tsRunSüresi = " + tsRunSüresi);


    }
}
