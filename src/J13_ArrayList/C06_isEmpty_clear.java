package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_isEmpty_clear {

    public static void main(String[] args) {

        // isEmpty() --> listin boş olup olmamasını kontrol eder... boolean değer verir (true/false)

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList.isEmpty() = " + ülkeList.isEmpty()); // false

        ArrayList<String> cityList = new ArrayList<>();

        System.out.println("cityList.isEmpty() = " + cityList.isEmpty()); // true


        // clear() --> listin elemanlarını siler

        ArrayList <String> isimList =  new ArrayList<>(List.of("Aydın", "Ceren", "Cihat", "İsmail", "Furkan", "Tuğba"));

        isimList.clear();
        System.out.println("isimList = " + isimList);
        System.out.println("isimList.size() = " + isimList.size());


    }
}
