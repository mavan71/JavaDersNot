package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task_20_Arrayboth_Ends {

    public static void main(String[] args) {

         /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..


        int sayiArr []= {1, 2, 3, 4};
        int yenisayiArr []=new int[2];
        for (int i = 0; i < sayiArr.length; i++) {
            yenisayiArr[0]=sayiArr[0];
            yenisayiArr[1]=sayiArr.length;

        }

        System.out.println(Arrays.toString(yenisayiArr));

    }
}
