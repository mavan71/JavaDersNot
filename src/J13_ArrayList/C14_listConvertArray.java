package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_listConvertArray {

    public static void main(String[] args) {

        // list convert array() --> list i Array e çevirir.( toArray )

        //1. yöntem; toArray(String[0])--> parametre olarak String [0] olarak eklenir

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Almanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        String ülkeArr [] = ülkeList.toArray(new String[0]); // ülke list elemanları toArray () ile ülkearr e atandı.

        System.out.println("ülkeList = " + ülkeList); // [Almanya, Fransa, Amerika, İngiltere, Gana]

        System.out.println("Arrays.toString(ülkeArr) = " + Arrays.toString(ülkeArr)); // [Almanya, Fransa, Amerika, İngiltere, Gana]

        //2.yöntem; tanımlanan Array in data type Object olarak atanır.
        // trick : Object class javada tanımlı tüm class ların parent (atası) olarak tanımlanır.
        // String Integer Double etc. Object class ın child (evladı) olduğundan istenen durumlarda data type olarak kullanılabilir.

        ArrayList <String> isimList =  new ArrayList<>(List.of("Aydın", "Ceren", "Cihat", "İsmail", "Furkan", "Tuğba"));

        Object isimArr [] = isimList.toArray(); //list elemanları toArray () ile Object data type isimArr atandı.

        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));

    }
}
