package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task20 {

    public static void main(String[] args) {

        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int arr2[] = istenmeyenEleman(arr, 3);

        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));


    }

    private static int [] istenmeyenEleman(int arr [], int a) {

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= a) {
                sayac++;
            }
        }
        int [] arr2= new int [sayac];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= a) {
                arr2[j] =arr[i];
                j++;
            }
        }
        return arr2;

    }
}
