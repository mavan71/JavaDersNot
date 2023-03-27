package J06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //task_ girilen ay numarasına göre hangi mevsimde olduğunu  print eden cod creating ediniz.

        System.out.print("Lütfen ay numarası giriniz :");

            int aySayisi = scan.nextInt();

                switch (aySayisi) {
                        case 12:
                        case 1:
                        case 2:
                            System.out.println("girilen ay 'kış' mevsimindedir");
                            break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("girilen ay 'ilkbahar' mevsimindedir.");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("girilen ay 'yaz' mevsimindedir.");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("girilen ay 'son bahar' mevsimindedir.");
                    default://switch hiç bir case için calışmzsa devreye girer.switch blok'da yeri önemli değildir.
                        System.out.print("lütfen 1-12 arası bir sayı giriniz!!");



                }

        System.out.println("code cıncık");

































    }
}
