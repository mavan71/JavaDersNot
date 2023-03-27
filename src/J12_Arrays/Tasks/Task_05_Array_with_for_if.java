package J12_Arrays.Tasks;

public class Task_05_Array_with_for_if {

    public static void main(String[] args) {

          /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.


        int sayiArr[] = {5,6,8,12,14,19};
        int sonuc=0;


        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]%2==0){
                sonuc+=sayiArr[i];
            } else {
                sonuc-=sayiArr[i];
            }
        }

        System.out.println("sonuç = " + sonuc);
    }
}
