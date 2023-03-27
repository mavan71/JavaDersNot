package J13_ArrayList.Tasks02;

import java.util.ArrayList;

public class Task15 {

    public static void main(String[] args) {

        /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.
     */

        ArrayList<Integer>asalList=new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            int kotrol =0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kotrol = 1;
                    break;
                }
            }
            if (kotrol ==0) {
                asalList.add(i);
            }
        }

        System.out.println("asalList = " + asalList);

    }
}
