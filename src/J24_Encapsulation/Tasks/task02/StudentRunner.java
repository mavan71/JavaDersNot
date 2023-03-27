package J24_Encapsulation.Tasks.task02;

import java.util.Scanner;

public class StudentRunner {

    static java.util.Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("adınızı giriniz");
        String ad = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

        Student ogr1=new Student(ad,yas);
        System.out.println(ogr1);
        System.out.println("Student name is " + ogr1.getName()+ "\n He/She is " + ogr1.getAge());

      Student ogr2=new Student("vedat",35);
        System.out.println(ogr2);


    }
}
