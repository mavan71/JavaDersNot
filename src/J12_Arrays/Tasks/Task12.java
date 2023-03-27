package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        /* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */


        int sayiArr [] ={2,6,4,5,8,9};
        int karelerArr[]=new int[sayiArr.length];
        for (int i = 0; i <sayiArr.length ; i++) {
           karelerArr[i]=sayiArr[i]*sayiArr[i];
        }

        System.out.println("Arrays.toString(karelerArr) = " + Arrays.toString(karelerArr));

    }
}
