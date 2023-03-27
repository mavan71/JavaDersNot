package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {


        // girilen tam sayı için çarpım tablosu print eden cod creat edniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int carpan = scan.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(carpan+ " x "+ i + " = " +i*carpan);
            i++;
        }




























    }
}
