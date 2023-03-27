package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class Task_05_arraylist05 {

    public static void main(String[] args) {


        /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
                Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
                */





        List<String> list = new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));

        rotateList(list);














    }
    public static void rotateList(List<String> city ) {
       List<String> yeniCity= new ArrayList<>();
        for (int i = city.size()-1; i >=0; i--) {
            yeniCity.add(city.get(i));
        }
        System.out.println(yeniCity);
    }
}
