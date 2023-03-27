package J06_SwitchStatement;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        /*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */

        System.out.print("Ay ismini küçük harfle ve Türkçe karakterlerle giriniz : ");
        String ayAdi= scan.nextLine();

        switch (ayAdi){
            case "ocak" :
            case "mart" :
            case "mayıs" :
            case "temmuz" :
            case "ağustos" :
            case "ekim" :
            case "aralık" :
                System.out.println("girdiğiniz ay 31 gündür.");
            break;
            case "nisan":
            case "haziran" :
            case "eylül" :
            case "kasım" :
                System.out.println("girdiğiniz ay 30 gündür.");
            break;
            case "şubat" :
                System.out.print("Lütfen hangi yılda olduğumuzu giriniz:");
                int year = scan.nextInt();
                if (year % 4 == 0) {
                    System.out.println("girdiğiniz ay 29 gündür");
                } else System.out.println("girdiğiniz ay 28 gündür");
                break;
            default:
                System.out.println("lütfen doğru yazdığınıza emin olunuz.");

        }












































    }
}
