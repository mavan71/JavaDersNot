package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_11 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
         girilen ifadeyi 'hacker dilinde " print eden method create ediniz .
        a-->    7
        v-->   1
        c-->   -4
        e  --> 2
         */


        hackerDili1();
        System.out.println(hackerDilPrintEt2("başarı gayrete aşıktır :) ")); // return typ lı
        





    }

    private static String hackerDilPrintEt2(String goygoy) {
        return    goygoy.replace("a", "7").replace("v", "1").replace("c", "-4").replace("e", "2");
    }



    private static void hackerDili1() {
        System.out.println("Bir ifade giriniz :");
        String str = scan.nextLine();

        System.out.println(str.replaceAll("a", "7").replace("v", "1").replace("c", "-4").replace("e", "2"));


    }
}
