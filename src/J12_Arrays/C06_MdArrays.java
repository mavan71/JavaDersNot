package J12_Arrays;

import java.util.Arrays;

public class C06_MdArrays {

    public static void main(String[] args) {


        /*
Çok Boyutlu Diziler
      Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
       Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
       formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
       matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
       satır ve sütun sayısını girmemiz yeterli olacaktır.
      * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
      Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
 *  icerdeki  array'lere  inner->Daire array denir
 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
 *  Array'i ancak tum elemenlari atanarak declare edilmeli
 * 3- Multi dimensional array'de bir elemanin indexi icin
 *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
 */


        // Multi dimensional array declaration :

        int arr1 [][] = new int [3][5]; // 3 satır 5 sütun boş tablo


        // bir sitede 12 dairelik 7 şer katlı 5 apt. nasıl Md array olarak tanımlanır


        int arr2 [][][] = new int [5][7][12];


        // Md array e eleman ekleme ;

        arr1[2][3]=43; // 2. kat 3. daire

        arr2 [3][2][1]= 31;
        System.out.println(arr2[3][2][1]);

        System.out.println(arr2[3][2][3]); // atama yapılmayan eleman için defoult değer alındı

        //Md Array tüm eleman atayarak tanımlama:

        int arr3 [][] = {
                {3,5},
                {12,13,15},
                {103,107,111,121},
        };

        // Md Array'DE PRİNT

        System.out.println(arr1); // referans değeri alınır --> herbir eleman array dir

        System.out.println(arr2);// referans değeri alınır --> herbir eleman array dir

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));

        System.out.println(Arrays.toString(arr3[2])); //  [103,107,111,121],


        /*
        Md Array print etmek için
        to string kullanılırsa her bir inner array in (iç) değeri print eder.
        to String method dış (outher) arrayi Stringe convert eder. (çevirir)
        dış arrayın elemanlarını print etmek için deep to String kullanılmalı.
         */

        // Md Array istenen eleman print etme:

        int yasArr[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(yasArr[2]); // 3 değerini print eder.

        System.out.println("arr3[2][1] = " + arr3[2][1]); // 107 değeri print eder.

        // Md Array istenen eleman print etmek için istenen elemanın tüm index değeri girilmelidir



    }
}
