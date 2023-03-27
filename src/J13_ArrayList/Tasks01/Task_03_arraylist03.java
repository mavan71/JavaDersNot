package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;


public class Task_03_arraylist03 {

    public static void main(String[] args) {

         /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

        List<String> list = new ArrayList<String>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        System.out.println(getLength(list));

    }

        public static List<Integer> getLength(List<String> list) {
            List<Integer> uzunluk = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
               uzunluk.add(list.get(i).length());

            }

            return uzunluk;
        }
}
