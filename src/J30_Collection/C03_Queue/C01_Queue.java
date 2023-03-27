package J30_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {

    public static void main(String[] args) {

/*
Queue coll. interface olduğu için child calss olan LinkedList ve PriorityQueue
ile obj uretilir.
Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
Cons seçimine göre queue obj özelliklieri belirlenir.
FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenir enbaştan silinir

 */

        Queue<String> q1=new LinkedList<String>(Arrays.asList("JavaCan","JavaSu","JavaNur","JavaNaz"));
        // q1 prints

        System.out.println("q1 = " + q1);

        // add method;

        q1.add("JavaTar");
        System.out.println("add sonrası q1 = " + q1);

        Queue<String> q2=new PriorityQueue<>(Arrays.asList("Biftek","Meyve Tabağı","Lüfer"));

        System.out.println("q2 = " + q2);

        q2.add("Gerdan");
        System.out.println("add sonrası q2 = " + q2);

        System.out.println("q1.element() = " + q1.element());

        System.out.println("q1.peek() = " + q1.peek());

        /*
   peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
   poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
   element() -> ilk elemanı silmeden return eder.
   remove() -> ilk elemnı siler ve return eder.. :kaldırma

  ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
  poll ise null return eder.


 */
        q1.clear();// q1 in tüm elemanları silindi
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.isEmpty() = " + q1.isEmpty());// true
        System.out.println("q1.poll() = " + q1.poll());//null
    //    System.out.println("q1.remove() = " + q1.remove()); // RTE verir

        System.out.println("q1.peek() = " + q1.peek()); //null
    //    System.out.println("q1.element() = " + q1.element());// RTE verir


        // offer methods// queue de eleman ksıtlaması varsa add methodu RTE verirken offer methodu true/ false return eder


        System.out.println("q1.offer(\"JavFer\") = " + q1.offer("JavFer"));//true
        System.out.println("offer sonrası q1 = " + q1);


    }
}
