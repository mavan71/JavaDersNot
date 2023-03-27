package CodeChallengeLessons.Lesson03;

public class Q15_ForLoop {
    public static void main(String[] args) {


        //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

//        System.out.println("***for ile***");
//        for (int i = 0; i <= 255 ; i++) {
//            char karakter = (char) i;
//            System.out.println(i+ "karakter :" + karakter);
//
//        }

        System.out.println("*****while ile*****");

        int x = 0;
        while (x<=255){
            char kk = (char) x;
            System.out.println(x + ". karakter :" + kk);
            x++;
        }
















    }
}
