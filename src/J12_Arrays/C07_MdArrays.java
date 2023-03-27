package J12_Arrays;

import java.util.Arrays;

public class C07_MdArrays {

    public static void main(String[] args) {

        // task:
         int arr3 [][] = {
                        {3,5},
                        {12,13,15},
                        {103,107,111,121},
                };// array elemanlarının toplamını print eden code create ediniz


        System.out.println("Arrays.deepToString(arr3) = " + Arrays.deepToString(arr3));

        int toplam=0;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                toplam+= arr3[i][j];
                }
            }
        System.out.println(toplam);
        }

    }

