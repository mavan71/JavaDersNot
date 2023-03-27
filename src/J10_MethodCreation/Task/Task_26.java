package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_26 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // girilen bir ifadenin tekrarlı ifadeleri yalnızca bir kez print eden method create ediniz.
        // input--> Javacanlara selam olsun output---> javcnlrsmou


        tekrarlariSil();






    }

    private static void tekrarlariSil() {
        System.out.println("Lütfen bir ifade giriniz :");
        String str = scan.nextLine();
        String bos ="";
        for (int i = 0; i < str.length(); i++) {
           if (!bos.contains(""+str.charAt(i)));
            bos+= str.charAt(i);


        }System.out.println(bos);


    }
}
