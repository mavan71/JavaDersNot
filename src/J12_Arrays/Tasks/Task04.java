package J12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        //task: // task-> girilen bir int array elamanlarından  ortlaamadan buyuk olan eleman sayısını print eden code create ediniz


        System.out.print("Agam kaç elemanlı array istirsen : ");
        int arrayBoyut = scan.nextInt();
        int arr[] = new int[arrayBoyut];//girilen eleman kadar boş array create edildi

        for (int i = 0; i < arrayBoyut; i++) {
            System.out.print(i + ". index array elemanınını giriniz : ");
            arr[i] = scan.nextInt();
        }
        System.out.println("agam ahan da arrayin : " + Arrays.toString(arr));

        int arrToplam=0;


        for (int i = 0; i < arr.length; i++) {
            arrToplam+=arr[i];
        }
        int arrOrtalama= arrToplam / arrayBoyut;

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arrOrtalama ){
                count++;
            }
        }
        System.out.println("ortalama :" + arrOrtalama + " ortalamadan büyük eleman sayısı = " + count);


    }
}
