package J06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //task_ girilen ay numarasına göre kaç gün çektiğini print eden cod creating ediniz.

        System.out.print("Lütfen ay numarası giriniz :");

            int aySayisi = scan.nextInt();

                switch (aySayisi) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println("girilen ay 31 gündür");
                            break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("girilen ay 30 gündür");
                        break;
                    case 2:
                        System.out.print("hangi yılda olduğunuzu giriniz :");
                        int yil = scan.nextInt();
                         if (yil%4==0) {
                            System.out.println("girilen ay 29 gündür");
                        }else System.out.println("girilen ay 28 gündür");
                        break;
                    default://switch hiç bir case için calışmzsa devreye girer.switch blok'da yeri önemli değildir.
                        System.out.print("lütfen 1-12 arası bir sayı giriniz!!");


























                }



































    }
}
