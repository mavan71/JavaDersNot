package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task16 {

    public static void main(String[] args) {

         /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */


        ArrayList<String> calisanlarList = new ArrayList<String>(List.of("Barış","Nazlıcan","Bedirhan","Suphi","Bahadır"));
        ArrayList<String> isverenlerList = new ArrayList<String>(List.of("Sakıp","Vehbi","Cengiz","Nazif","Ali"));
        ArrayList<String> sirketlerList = new ArrayList<String>(List.of("Sabancı","Koç","Limak","Zorlu","Ağaoğlu"));


        ArrayList<ArrayList> list1 = new ArrayList<>();
        String list2[][]=new String[3][5];




        list1.add(isverenlerList);
        list1.add(calisanlarList);
        list1.add(sirketlerList);
        System.out.println("list1 = " + list1);


    }
}
