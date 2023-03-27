package J09_BreakContinue;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {


// task: girilen  bir ifadedeki c karakterine kadar a karakter sayısını print eden code creat ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz :");

        String cumle = scan.nextLine();

        int sayac = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)== 'a') {
                sayac++;
            } else if (cumle.charAt(i)== 'c') {
                break;
            }

        }
        System.out.println("girilen cümledeki c karakterine kadar olan a sayısı :"+ sayac);





























    }
}
