package CodeChallengeLessons.Lesson02;

import java.util.Scanner;

public class Q06_IfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    	/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin.
        Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        System.out.print("Lütfen job title'nızı yazınız :");
        String jobTitle = scan.nextLine().toLowerCase();

        if (jobTitle.equals("qa")){
            System.out.println("iş unvanınız :Quality Analyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("iş unvanınız : Developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("iş unvanınız : Business");
        } else if (jobTitle.equals("pm")) {
            System.out.println("iş unvanınız : Project Manager");
        } else
            System.out.println("girdiğiniz title'a uyan unvan bulunamadı");


    }





}