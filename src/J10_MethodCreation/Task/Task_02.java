package J10_MethodCreation.Task;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

// task-- girilen ad ve soy adların ilk harfleri büyük diğer harfleri küçük print eden methot create ediniz.


        Scanner input = new Scanner(System.in);

        System.out.println("adınızı giriniz :");
        String Name=input.nextLine();


        System.out.println("soy adınızı giriniz :");
        String surName=input.nextLine();

        adSoyadKontrol1(Name, surName);



        





















    }

    private static void adSoyadKontrol1(String Name, String surName) {
        System.out.println(Name.substring(0, 1).toUpperCase() + Name.substring(1).toLowerCase());
        System.out.println(surName.substring(0, 1).toUpperCase() + surName.substring(1).toLowerCase());
    }
}
