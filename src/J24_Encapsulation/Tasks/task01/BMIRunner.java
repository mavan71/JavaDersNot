package J24_Encapsulation.Tasks.task01;

public class BMIRunner {
    /* Task->
     Bmi class fields -> name, age, weight,height: encapsulated
     getBMI() method -> bmi=weight/(height*height) return type olmalı
     getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal,
     30 dan kucukse kilolu, 30 ustu obez return type
     Runner class obj ile dataları print eden code create ediniz
     */

    public static void main(String[] args) {



        Bmi adam1 =new Bmi("ahmet",33,93,185);

        System.out.println("adam1 = " + adam1);

        Bmi cerenHanım = new Bmi("ceren",34,65,170);

        System.out.println("ceren hanım" + cerenHanım);



    }
}
