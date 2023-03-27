package J30_Collection.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {

    public static void main(String[] args) {

         /*
     Task->
commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
return tipi arraylist olmalı.
ÖRNEĞİN:
İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
Ortak değerleri ArrayListe ekleyiniz.
çıktı:  "Germany" , "Brazil" ,"USA"
ArrayListi print eden method create ediniz.
 */
        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Germany" , "China" , "Brazil" , "France" ,  "USA"));

        System.out.println(commonValues(hs1, hs2));

    }

    private static ArrayList<String> commonValues(HashSet<String> str1, HashSet<String> str2){
            ArrayList<String> result = new ArrayList<String>();
           str1.retainAll(str2);
           result.addAll(str1);

        return result;
    }
}
