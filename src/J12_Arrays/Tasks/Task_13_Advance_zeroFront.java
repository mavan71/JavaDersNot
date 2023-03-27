package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task_13_Advance_zeroFront {

    public static void main(String[] args) {

        /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        // Kodu aşağıya yazınız..

        int sayiArr[]={45,0,73,0,16,43,0,20,100};

        Arrays.sort(sayiArr);
        System.out.println("Sıfırları başa alırsak = " + Arrays.toString(sayiArr));


    }
}
