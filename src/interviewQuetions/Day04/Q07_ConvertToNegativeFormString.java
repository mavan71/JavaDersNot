package interviewQuetions.Day04;

import java.util.Arrays;

public class Q07_ConvertToNegativeFormString {
    /*
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

    }



}