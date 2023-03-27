package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {

       /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */


        int sayiArr [] = {1, 2, 3};

        int ilkeleman= sayiArr[0];
        for (int i = 0; i < sayiArr.length-1; i++) {
            sayiArr[i] = sayiArr[i+1];
        }   sayiArr[sayiArr.length-1] =ilkeleman;

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));


    }
}
