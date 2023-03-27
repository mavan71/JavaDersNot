package CodeChallengeLessons.Lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q08_ArrayList {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        ArrayList<String> nameList = new ArrayList<>(List.of("Ahmet", "Mehmet", "Yakup", "Ali", "Ayşe", "Fatma", "Hayriye", "Zeliha", "Yusuf"));

        System.out.println("Lütfen kullanıcı adınızı giriniz.");

        ArrayList<String> inputName = new ArrayList<String>();
        String input = scan.nextLine().trim();


            if (nameList.contains(input)) {
                System.out.println("girdiğiniz isim alınmış");
                int randomSayi = new Random().nextInt(100);
                input = input + randomSayi;
                System.out.println("yeni kullanıcı adınız :" + input);
                nameList.add(input);
            } else {
                System.out.println("girdiğiniz " + input + " ismi alınmamış kullanabilirsiniz");
                nameList.add(input);
            }




        System.out.println("nameList = " + nameList);

    }
}