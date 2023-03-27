package CodeChallengeLessons.Lesson04;

import java.util.Scanner;

public class Q20_Arrays {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */


        MdArrayCiftSayiTopla();


    }

    private static void MdArrayCiftSayiTopla() {
        System.out.println("Lütfen kaç elemanlı bir sayı listesi yazmak istdeğinizi giriniz:");
        int i = scan.nextInt();
        System.out.println("Lütfen her sayı dizisi için ");
    }
}
