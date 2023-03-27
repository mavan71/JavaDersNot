package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {

//        *
//     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
//                *
//     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
//                *         Output : Cesaret insana sinirlarini ogretir.
//     *
//     */
//
//


        Scanner scan = new Scanner(System.in);

        System.out.println("Cümle oluşturmak için 4 kelime giriniz");

        String k1 = scan.next();
        String k2 = scan.next();
        String k3 = scan.next();
        String k4 = scan.next();

        System.out.println(k1.substring(0, 1).toUpperCase() + k1.substring(1) + " " + k2 + " " + k3 + " " + k4);


    }
}
