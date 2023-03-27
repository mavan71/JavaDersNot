package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_subList {

    public static void main(String[] args) {

        // subList--> listeyi istenen index ten parçalamaya

        ArrayList<String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülkeList.subList(1,4) = " + ülkeList.subList(1, 4)); // [Fransa, Amerika, İngiltere]

        ArrayList<String> ebikGabıkList = new ArrayList<>(ülkeList.subList(2,5)); // ülke list in sub edilen kısmı ebik gabık liste atandı.

        System.out.println("ebikGabıkList = " + ebikGabıkList);






    }
}
