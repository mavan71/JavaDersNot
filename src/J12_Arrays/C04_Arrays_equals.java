package J12_Arrays;

import java.util.Arrays;

public class C04_Arrays_equals {
    public static void main(String[] args) {


 /// Arrays eşitlik kontrolü--> equals() methodu arrays elemanlarının hem index hem de value kontrolünü yapar
        // true/false return eder.

        int arr1[] = {1, 2, 46, 79, 80, 21, 27, 44};
        int arr2[] = {46,27,44,80,1,2,79,21};

        System.out.println("arr1 arr2 ye eşit mi= " + Arrays.equals(arr1, arr2));
        System.out.println("arr1[0]==arr2[6] = " + (arr1[0] == arr2[6]));

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("arr1 , arr2 ye eşit mi = " + Arrays.equals(arr1, arr2));


        // Array'yi string e çevirme (convert)

        Arrays.toString(arr1); // arr1 string data type çevrildi
        String str= Arrays.toString(arr1);
        System.out.println("str" + str);
        System.out.println("str.substring(3) = " + str.substring(3));


    }
}
