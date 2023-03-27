package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task_17_2d_Array {

    public static void main(String[] args) {


   /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.


        int sayiArr[][] = {{2,3,2} , {4,1,5} , {7,2,5}};


        for (int i = 0; i < sayiArr.length; i++) {
            for (int j = 0; j < sayiArr[i].length; j++) {
                if(sayiArr[i][j]==2){
                    sayiArr[i][j] =6;
                }

            }

        }
        System.out.println("Arrays.deepToString(sayiArr) = " + Arrays.deepToString(sayiArr));



    }
}
