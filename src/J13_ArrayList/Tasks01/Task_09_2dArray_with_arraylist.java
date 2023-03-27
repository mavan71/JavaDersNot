package J13_ArrayList.Tasks01;

import java.util.ArrayList;
import java.util.List;

public class Task_09_2dArray_with_arraylist {

    public static void main(String[] args) {

         /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */


        int sayiArr[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> sayiArrList=new ArrayList<>();

        for (int i = 0; i < sayiArr.length; i++) {
            for (int j = 0; j < sayiArr[i].length; j++) {
                sayiArrList.add(sayiArr[i][j]);

            }

        }

        System.out.println(sayiArrList);












    }
}
