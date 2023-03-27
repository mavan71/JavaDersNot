package J12_Arrays;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {


        /*
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable omalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */


// array declaration:

        int a; // declaration edilen ancak assaignment (atama) yapılmayan primitive variable
        int arr []; // declaration edilen ancak assaignment (atama) yapılmayan int type array

        // Trick: ataması yapılmayan bir array herhangi bir actiona alınamaz. CTE verir

        String isimArr[] = {"Yusuf", "Murat", "Ceren", "*Vedat", "**Suzan", "Abdi"}; // declaration ve assaignment edilmiş bir array

        int sayiArr[] = new int[5]; // declaration edilmiş length 5 girilmiş int type array

// array eleman update etme:

        sayiArr [1]= 25; // sayiArr 1. index 25 value edildi
        sayiArr [0]= 46;
        sayiArr [2]= 31;
        sayiArr [1]= 2; // array elemanları unique olmak zorunda değil tekrarlı olabilir.
        sayiArr [3]= 2;
        sayiArr [4]= 46;

// array eleman sayısı (length)

        System.out.println("sayiArr.length = " + sayiArr.length);
        System.out.println("isimArr.length = " + isimArr.length);
        int kacİsim = isimArr.length;
        System.out.println("kacİsim = " + kacİsim);

// array son eleman:

        System.out.println("isimArr[isimArr.length -1] = " + isimArr[isimArr.length - 1]);


        isimArr[isimArr.length -1]="son eleman bükücü Abdi"; // son eleman update edildi.

// array eleman print etme:

        System.out.println("isimArr = " + isimArr); // non-primitive data olduğu için referans değerini print eder.

        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr)); // best practice

        for (int i = 0; i < isimArr.length; i++) {      // bad practice
            System.out.print(isimArr[i] + " ");

        }

// task: sayiArr çift index elemanlarını print eden code create ediniz.

        System.out.println(Arrays.toString(sayiArr));

        for (int i = 0; i < sayiArr.length; i++) {
            if (i%2==0){
                System.out.println(sayiArr[i]);
            }

        }

// task: isimArr de 5 karakterden fazla elemanı print eden code create ediniz

        for (int i = 0; i <isimArr.length ; i++) {
            if (isimArr[i].length() > 5) {
                System.out.print(isimArr[i] + " ");
            }

        }
//
//// task: isimArr de 6 karakterden az olan elemanı saklayan arrayı print eden code create ediniz
        int yeniArrayBoyut=0;


        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length() < 6) {
                yeniArrayBoyut++;
            }
        }
        String yenisimArray[]= new String[yeniArrayBoyut];
        int j=0;
        for (int i=0; i < isimArr.length; i++) {
            if (isimArr[i].length() < 6){
                yenisimArray[j] = isimArr[i];
                j++;
            }

        }
        System.out.println(yeniArrayBoyut);
        System.out.println(Arrays.toString(yenisimArray));

// array eleman sıralama..natural : k>b veya alfabetik

        System.out.println(Arrays.toString(isimArr));
        Arrays.sort(isimArr);
        System.out.println(Arrays.toString(isimArr));




    }
}









