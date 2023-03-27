package J30_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {

    public static void main(String[] args) {

        /*
LinkedList .....
1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node" olarak tanımlanır.
2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.
5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
    Ancak obj DataType olarak parent interface tanımlanabilir.
7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
 */

        LinkedList <String> ll1 = new LinkedList<>(Arrays.asList("patlıcan kebap", "ciğer şiş", "çöp şiş", "haşhaş kebap","kilis tava", "küşleme"));

        System.out.println(ll1); // linked list print

        //linked list add() method;
        ll1.add("tandır");
        System.out.println("ll1 add sonrası " + ll1);

        ll1.add(1,"sucuk kebap");
        System.out.println("index 1 add sonrası " + ll1);

        ll1.addFirst("kuyu kebabı");
        System.out.println("ll1 add first sonrası" + ll1);

        ll1.addLast("döner");
        System.out.println("ll1 add last sonrası" + ll1);


        LinkedList <String> ll2 = new LinkedList<>(Arrays.asList("havuç dilimi", "dondurmalı irmik", "triliçe", "künefe","su muhallebisi", "hamsiköy sütlaç"));

        ll1.addAll(ll2);
        System.out.println("ll1 add all sonrası " + ll1);

        ll2.addAll(5,ll1);
        System.out.println("ll2 "+ll2);

      //  ll2.addAll("selam")// CTE




    }
}
