package Projeler.TeamWorkProject03;

public class ThreeEvenOdd {
     /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*
   TASK ->
   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true return eden threeEvenOrOdd method create ediniz.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
    public static void main(String[] args) {

        int arr[]={2,4,3,5,8};


        System.out.println(threeEvenOrOdd(arr));


    }

    private static boolean threeEvenOrOdd(int sayiArr[]) {
        boolean sonuc = false;
        int teksayac=0;
        int ciftsayac=0;
        for (int i = 0; i < sayiArr.length; i++) {
            if(sayiArr[i]%2==0) {
                ciftsayac++;
            }else{
                teksayac++;
            }
        }
        if(teksayac==3 || ciftsayac==3){
            sonuc = true;
        }else sonuc = false;

       return sonuc;
    }

}
