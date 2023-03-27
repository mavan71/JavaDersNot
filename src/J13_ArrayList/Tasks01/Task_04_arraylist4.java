package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class Task_04_arraylist4 {

    public static void main(String[] args) {

         /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */


        List<String> renk = new ArrayList<String>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
        String str1="blue";
        String str2="yellow";

        System.out.println(changeInArraylist(renk, "blue", "yellow"));


    }

    private static List<String> changeInArraylist(List<String> renk, String s1, String s2) {
        for (int i = 0; i < renk.size(); i++) {
            if (renk.get(i).equals(s1)){
                renk.set(i, s2);
            }

        }
        return renk;
    }
}
