package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

          /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.

        */
         Scanner scan = new Scanner(System.in);
        ArrayList<Integer> sayiList = new ArrayList<>();

        for (int i = 1; i <6 ; i++) {
            System.out.println("Lütfen " + i + " . elemanı giriniz");
            sayiList.add(scan.nextInt());

        }

        tekElemanlar(sayiList);
    }

    private static void tekElemanlar(ArrayList <Integer> list) {
       ArrayList <Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==1){
                newList.add(list.get(i));
            }

        }
        System.out.println("Tek elemanlı yeni liste "+ newList);
    }
}
