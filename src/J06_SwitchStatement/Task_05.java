package J06_SwitchStatement;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {


      Scanner scan = new Scanner(System.in);

/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        System.out.print("Lütfen notunuzu giriniz :");

        int not = scan.nextInt();

            if ((0<=not) && (not< 50)) {
                not= 1;
            } else if ((50 <= not) && (not < 60)) {
                not=2;
            }else if ((60 <= not) && (not < 80)) {
                not=3;
            }else if ((80 <= not) && (not <=100)) {
                not=4;
            }else System.out.println("Lütfen 0-100 arası bir not giriniz");

            switch (not) {
                case 1:
                    System.out.println("Notunuz : D");
                    break;
                case 2:
                    System.out.println("Notunuz : C");
                    break;
                case 3:
                    System.out.println("Notunuz : B");
                    break;
                case 4:
                    System.out.println("Notunuz : A");
                    break;
                default:
                    System.out.println("Lütfen tekrar deneyiniz");

            }










































































    }
}
