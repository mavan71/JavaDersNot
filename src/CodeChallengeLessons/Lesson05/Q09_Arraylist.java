package CodeChallengeLessons.Lesson05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q09_Arraylist {



    public static void main(String[] args) {

       /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

            ArrayList<Integer> list = new ArrayList<>(List.of(12, 11, 12, 15, 12, 34, 43));
        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==12){
                list.set(i, 21);
            }
            
        }
        System.out.println("list = " + list);

    }
    }
