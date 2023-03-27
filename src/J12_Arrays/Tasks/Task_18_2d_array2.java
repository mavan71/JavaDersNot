package J12_Arrays.Tasks;

public class Task_18_2d_array2 {

    public static void main(String[] args) {


 /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.

        
        int sayiArr [][]= {{5,2,1} , {10,2,3,6} , {1,2}};

        int toplam=0;
        for (int i = 0; i < sayiArr.length; i++) {
            for (int j = 0; j < sayiArr[i].length; j++) {
                toplam+=sayiArr[i][j];
                
            }
            
        }
        System.out.println("toplam = " + toplam);







        
    }
}
