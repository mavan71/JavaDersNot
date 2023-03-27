package CodeChallengeLessons.Lesson02;

import java.util.Scanner;

public class Q12_SwitchCase {
    public static void main(String[] args) {



           /*
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir büyük harf giriniz :");
        char harf = scan.next().charAt(0);


            switch (harf){
                case 'A':
                    System.out.println("A : Java is easy"); break;
                case 'B':
                    System.out.println("B : Java is fun"); break;
                case 'C':
                    System.out.println("C : I need to study :)"); break;
                default:
                    System.out.println("bu harfla ilgili bir önerme yok!");


            }











































    }


}
