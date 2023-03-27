package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        // task: Bir listte istenen sayının varlığını kontrol eden code create ediniz.


        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,46,44,27,21,79,31,20,58,38,59,33));

        System.out.println("Hangi sayının varlığını sorgulamak istersiniz?");
        int aranan = scan.nextInt();
        boolean sayıVarMı= false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)== aranan) {
              sayıVarMı= true;
                System.out.println("aranan sayı listede var");
               break;
            }

            }
            if (!sayıVarMı){
                System.out.println("aranan sayı listede yok");
        }

    }
}
