package J08_Loops.Loop02_WhileLoop.J08_WhileLoop_Task;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {



        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen şifrenizi oluşturunuz :");

        String pas = scan.nextLine();

        int uzunluk =pas.length();
        int count =0;



        while (count<=2) {

            if (pas.charAt(0) >= 'A' && pas.charAt(0) <= 'Z') {
                System.out.println("Lütfen girilen ilk harfi küçük harf giriniz.");
            } else if (pas.charAt(pas.length() - 1) >= 'a' && pas.charAt(pas.length()-1) <= 'z') {
                System.out.println("Lütfen son karakteri sayı giriniz.");
            } else if (pas.contains(" ")){
                System.out.println("Lütfen boşluk bırakmayınız");
            } else if (uzunluk < 10) {
                System.out.println("Lütfen en az 10 karakter giriniz");
            } else {
                System.out.println("Tebrikler şifre başarıyla kaydedildi");
            }
            break;

        }


















    }
}
