package CodeChallengeLessons.Lesson03;

public class Q11_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.


        String name = "Abdi";
        String SurName= "Arman";

        System.out.println(name.length() > SurName.length() ? "name daha uzun" : "Surname daha uzun");


    }
}
