package CodeChallengeLessons.Lesson03;

public class Q10_StringManipulation {
    public static void main(String[] args) {


        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.


        String s ="   Java ogrenmek123 Cok guzel@      ";
        System.out.println(s.replaceAll("\\d", "").replaceAll("C", "c").replaceAll("@", "").trim());


    }
}
