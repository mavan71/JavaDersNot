package J12_Arrays;

import java.util.Arrays;

public class C05_Arrays_copyOf {
    public static void main(String[] args) {

// Array kopyalama--> copyOf(); --->girilen array in new leght kadar ilk elamanını kopyalar.

        int arr1[] = {1, 2, 46, 79, 80, 21, 27, 44};

    //    Arrays.copyOf(arr1,3);
    //    int arr2[] =  Arrays.copyOf(arr1,3);
  //      System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

 /// task: arr nin son 3 elemanının atandığı arrayi create ediniz.

    //    Arrays.copyOf(arr1,arr1.length-4);
      //  int arr2[] = Arrays.copyOf(arr1,)
    //    System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

  // Array belirli bir eleman ile set etme (update) ... fill (arr, value)--> girilen arr istenen value ile tüm elemanlar update edilir.

        Arrays.fill(arr1,58);
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        Arrays.fill(arr1,arr1.length-3,arr1.length,63);
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));


    }
}
