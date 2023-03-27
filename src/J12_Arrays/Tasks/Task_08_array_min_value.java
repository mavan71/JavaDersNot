package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task_08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..


        int sayiArr[]={14,19,5,21};

        Arrays.sort(sayiArr);
        System.out.println("en küçük sayı = " + sayiArr[0]);


    }
}
