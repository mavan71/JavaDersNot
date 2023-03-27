package J12_Arrays.Tasks;

public class Task_11_Average_of_Array {

    public static void main(String[] args) {


        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.


        int sayiArr[]={12,14,21,23,10,4};
        int toplam=0;

        for (int i = 0; i < sayiArr.length; i++) {
            toplam+=sayiArr[i];

        }

        double ortalama= toplam/sayiArr.length;
        System.out.println("ortalama = " + ortalama);










    }
}
