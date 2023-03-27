package J30_Collection.C01_LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class C02_LinkedList {
    public static void main(String[] args) {


        LinkedList<Object> ll = new LinkedList<>();
        // bad practice-->app çok yavaşlar
        ll.add(1995);
        ll.add("JavaCan");
        ll.add('$');
        System.out.println(ll);

    }
}
