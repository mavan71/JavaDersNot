package J12_Arrays;

import java.util.Arrays;

public class C02_Arrays_binarySearch {

    public static void main(String[] args) {


// array de elaman kontrolü

        int sayiArr[] = {2,46,31,80,44,63,27,21,79};

        int sayi1 = 44;
        int sayi2= 34;
        boolean bayrak = false;

        for (int i = 0; i < sayiArr.length; i++) {
            if (sayi1== sayiArr[i]){
                bayrak= true;
                break;
            }
        }
        if (bayrak= true){
            System.out.println("aranan sayı arrayda var");
        } else {
            System.out.println("aranan sayı arrayda yok");
        }

// Arrays binarySearch()  ile çözümü

        Arrays.sort(sayiArr);
        System.out.println("Arrays.binarySearch(sayiArr,34) = " + Arrays.binarySearch(sayiArr, 34));
        System.out.println("Arrays.binarySearch(sayiArr,35) = " + Arrays.binarySearch(sayiArr, 35));
        System.out.println("Arrays.binarySearch(sayiArr,44) = " + Arrays.binarySearch(sayiArr, 44));
        System.out.println("Arrays.binarySearch(sayiArr,31) = " + Arrays.binarySearch(sayiArr, 31));


    }
}
