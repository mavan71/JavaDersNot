package CodeChallengeLessons.Lesson04;

import java.util.Arrays;

public class Q12_Arrays {

    public static void main(String[] args) {

        /*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int sayiArr[]={2,6,4,5,8,9};

        for (int i = 0; i < sayiArr.length ; i++) {
            sayiArr[i] *=sayiArr[i];

        }
        System.out.println(Arrays.toString(sayiArr));
    }
}
