package CodeChallengeLessons.Lesson02;

import java.util.Scanner;

public class Q07_IfStatement {
    public static void main(String[] args) {


           /*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu aliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		 */


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz :");
        int yas = scan.nextInt();
        System.out.print("Lütfen kilonuzu giriniz :");
        int kilo = scan.nextInt();

            if (yas >=18) {
                if (kilo >= 50) {
                    System.out.println("kan bağışı YAPABİLİR");
                } else  {
                    System.out.println("kilonuz yetersiz olduğundan kan bağışı YAPAMAZSINIZ!!");
            }
            }else System.out.println("yaşınız küçük olduğundan kan bağışı YAPAMAZSINIZ!!");


    }






    }
