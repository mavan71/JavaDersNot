package J08_Loops.Loop03_DoWhileLoop.Task;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

// task: x karakteri girilene kadar "JavaCan" x basıldıktan sonra "JavaTar" yazan cod creat ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Agam bir metin giresen : ");
        String str ="";
        do {
            System.out.println("javaCAN");

            //System.out.print("Agam bir metin giresen : ");
            str=scan.nextLine();



        }while (!str.equalsIgnoreCase("x"));//x girmediği sürece :x girene kadar şartı
        System.out.println("javaTAR");

























    }
}
