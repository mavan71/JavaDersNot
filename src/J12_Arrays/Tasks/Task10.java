package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task10 {
  static  int sayiArr[]={1,2,-3,4,-5,-6};
    public static void main(String[] args) {

        /* TASK :
bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
input : 1,2,-3,4,-5,-6
output :-1,-2,3,-4,5,6

 */


        System.out.println(Arrays.toString(arrtersisaretle()));


    }

    private static int[] arrtersisaretle() {

        for (int i = 0; i < sayiArr.length; i++) {
            sayiArr[i]*=-1;

        }


        return sayiArr;
    }
}
