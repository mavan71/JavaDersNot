package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_kendim02 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // girilen isim ve soy ismi ilk harfleri büyük diğerleri küçük olarak print eden bir method create edniz.


        String liste = isimVeSoyisim("ahmet", "gelen");
        System.out.println("liste = " + liste);


    }

    private static String isimVeSoyisim(String name, String surName ) {
     //   System.out.println("Lütfen adınızı giriniz: ");
        //String name= scan.nextLine().toLowerCase();
      //  System.out.println("Lütfen soyadınızı girinizi :");
      //  String surName= scan.nextLine().toLowerCase();
       // name= "ahmet";
      //  surName = "yalçın";
        String nameilk= name.toUpperCase().charAt(0)+name.substring(1);
        String surNameilk= surName.toUpperCase().charAt(0)+surName.substring(1);
        String methodName= (nameilk + " " + surNameilk);
       // System.out.println("methodName = " + methodName);
        return methodName;

    }


}
