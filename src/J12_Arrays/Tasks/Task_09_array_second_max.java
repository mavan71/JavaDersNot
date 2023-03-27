package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task_09_array_second_max {

    public static void main(String[] args) {
          /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..

        int sayiArr[]={15,25,22,18,30};

       Arrays.sort(sayiArr);
        System.out.println("en büyük 2. eleman = " + sayiArr[sayiArr.length - 2]);
    }
}
