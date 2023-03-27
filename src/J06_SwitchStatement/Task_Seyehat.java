package J06_SwitchStatement;

import java.util.Scanner;

public class Task_Seyehat {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

      //   İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
        İşlemlerde direkt bunları cağırabilirsiniz.

         İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
         KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


      // Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.

         */
        System.out.println("----ClarusWay Turizm'e Hoşgeldiniz----");
        System.out.println("Lütfen nereye gitmek istdeğinizi yazınız");
        System.out.println("Frankfurt:60 Km -- Köln:80 KM \n(20 km başına 5 euro bilet parası alınmaktaktadır)");

        String nereye = scan.nextLine().toUpperCase();
        System.out.println("Rota :" + nereye);
        int fiyatF = (60/20)*5;
        int fiyatK = (80/20)*5;
        double bakiye = 100.00;


                    switch (nereye) {
                        case "KÖLN" :
                            System.out.println("kaç kişilik bilet istiyorsunuz ? (maximum 2 kişilik olabilir)");
                            int kisiK = scan.nextInt();
                            switch (kisiK) {
                                case 1 :
                                    System.out.println("ödemeniz gereken tutar :" + fiyatK);
                                    System.out.println("paranızın üstü :" + (bakiye-fiyatK));
                                break;
                                case 2 :
                                    System.out.println("ödemeniz gereken tutar :" +2*fiyatK);
                                    System.out.println("paranızın üstü :" + (bakiye-(2*fiyatK)));
                                break;
                                default:
                                    System.out.println(" tek seferde maximum iki kişilik bilet alabilirsiniz");
                            } default:
                        case "FRANKFURT" :
                            System.out.println("kaç kişilik bilet istiyorsunuz ? (maximum 2 kişilik olabilir)");
                            int kisiF = scan.nextInt();
                            switch (kisiF) {
                                case 1 :
                                    System.out.println("ödemeniz gereken tutar :" + fiyatF);
                                    System.out.println("paranızın üstü :" + (bakiye-fiyatF));
                                    break;
                                case 2 :
                                    System.out.println("ödemeniz gereken tutar :" +2*fiyatF);
                                    System.out.println("paranızın üstü :" + (bakiye-(2*fiyatF)));
                                    break;
                                default:
                                    System.out.println(" tek seferde maximum iki kişilik bilet alabilirsiniz");












                    }








        }







































































    }
}
