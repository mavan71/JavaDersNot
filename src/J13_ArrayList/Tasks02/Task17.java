package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17 {

    public static void main(String[] args) {

//Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden mrthod create ediniz
// bir method olusturun
// orn : [1, 3, 5, 3, 5, 6, 1, 7]
// output [1, 3, 5, 6, 7]

        ArrayList <Integer> list = new ArrayList <>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));
        sadecebirkez(list);




    }

    private static void sadecebirkez(ArrayList<Integer>list) {

        ArrayList <Integer> benzersizList = new ArrayList <>();
        for (int i = 0; i < list.size(); i++) {
            if (!benzersizList.contains(list.get(i))) {
                benzersizList.add(list.get(i));
                
            }

        }

        System.out.println("benzersizList = " + benzersizList);
    }
}
