package J12_Arrays.Tasks;

public class Task_03_Create_array3 {

    public static void main(String[] args) {

        /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..

        int sizeArr [] = {25,30,30,35,100};
        int toplam=0;

        for (int i = 0; i < sizeArr.length; i++){
            toplam+=sizeArr[i];
        }
        System.out.println("toplam = " + toplam);
    }
}
