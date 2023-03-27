package J30_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {

    public static void main(String[] args) {

        /*
 Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
LİFO : Last in First out

  */
        Deque<String> dq1= new LinkedList<>(Arrays.asList("JavaCan","JavaSu","JavaNur","JavaNaz","JavaTar"));

        // deque print

        System.out.println("dq1 = " + dq1);

        // add methods

        dq1.add("selam");
        System.out.println("add sonrası dq1 = " + dq1);

        System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.getLast() = " + dq1.getLast());
        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1.peekLast() = " + dq1.peekLast());

        dq1.clear();

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1.peekLast() = " + dq1.peekLast());
     //   System.out.println("dq1.getLast() = " + dq1.getLast()); // RTE verir
    //    System.out.println("dq1.getFirst() = " + dq1.getFirst()); // RTE verir


        Deque<String> dq2= new LinkedList<>(Arrays.asList("Baklava","Havuç Dilimi","Sütlaç","Aşure","Kazandibi"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
        System.out.println("dq2.removeLast() = " + dq2.removeLast());

        dq2.clear();

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
     //   System.out.println("dq2.removeFirst() = " + dq2.removeFirst());// RTE verir
     //   System.out.println("dq2.removeLast() = " + dq2.removeLast()); // RTE verir


    }
}
