package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {

        int sayi[][] = {{1,2,3},{19,-8}, {24,10,-41}};
        // iç arraylerin toplamını yeni bir arraya atan code create ediniz

      int yeniarr []= new int[sayi.length];

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                yeniarr[i]+=sayi[i][j];

            }

        }

        System.out.println("Arrays.toString(yeniarr) = " + Arrays.toString(yeniarr));
    }
}
