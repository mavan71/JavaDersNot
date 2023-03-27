package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        ArrayList<Integer> inputList = new ArrayList<>(List.of(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        ArrayList<Integer> outputList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            if (!outputList.contains(inputList.get(i))) {
                outputList.add(inputList.get(i));
            }
        }
        System.out.println("outputList = " + outputList);

    }
}
