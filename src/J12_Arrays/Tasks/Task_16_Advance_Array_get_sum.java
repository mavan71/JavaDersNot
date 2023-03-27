package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task_16_Advance_Array_get_sum {
    public static void main(String[] args) {
/*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String para []={"$12", "$23", "$10", "$2", "$5", "$2"};


        int toplam=0;

        for (int i = 0; i < para.length ; i++) {
           para[i]=para[i].replaceAll("\\D", "");
           toplam+=Integer.parseInt(para[i]);

        }

        System.out.println("toplam :"+ toplam + "$");

    }
}
