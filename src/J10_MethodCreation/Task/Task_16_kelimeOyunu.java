package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_16_kelimeOyunu {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */



        kelimeOyunu();




























    }

    private static void kelimeOyunu() {
        System.out.println("*** Kelime Oyunumuz iki kişiliktir **** ");
        System.out.println("1. oyuncu \n Lütfen bir kelime yazınız:");
        String kelime = scan.nextLine().toLowerCase();
        System.out.println("****************************************************************");
        System.out.println("2. oyuncu olarak " + kelime + " kelimesini kabul ediyor musunuz?\n kabul ediyorsan 'evet'  etmiyorsan 'hayır' yazınız:");
        String onay = scan.nextLine().toLowerCase();
        int birinciOyuncuPuan =0;
        int ikinciOyuncuPuan =0;

        if ( onay.equals("evet")){
            birinciOyuncuPuan+=kelime.length();
            System.out.println("2. oyuncu; oyuna devam etmek istiyor musun? \n kabul ediyorsan 'evet'  etmiyorsan 'hayır' yazınız:");
            String onay2 = scan.nextLine();
            if (onay2.equals("evet")){
                System.out.println("Yeni kelimeyi başa mı sona mı eklemek istiyorsunuz? \n başa ise 1e \n sona ise 2ye basınız ");
                int onay3 = scan.nextInt();
                if (onay3==1){
                    System.out.println("2. oyuncu yeni kelime yazınız");
                    String kelime2 = scan.nextLine();
                    kelime2=kelime2+kelime;
                    ikinciOyuncuPuan=kelime2.length();
                    System.out.println("2. oyuncunun puanı :" + ikinciOyuncuPuan);
                } else if (onay3==2){
                    System.out.println("2. oyuncu yeni kelime yazınız");
                    String kelime3 = scan.nextLine();
                    kelime3=kelime+kelime3;
                    ikinciOyuncuPuan=kelime.length();
                    System.out.println("2. oyuncunun puanı :" + ikinciOyuncuPuan);
                }else {
                    System.out.println("geçersiz kelime");
                    System.out.println("*** oyun bitti ***");
                    System.out.println("1. oyuncunun puanı: " + birinciOyuncuPuan);

                }

                }
            } else {
            birinciOyuncuPuan+=kelime.length();
            System.out.println("geçersiz kelime");
            System.out.println("*** oyun bitti ***");
            System.out.println("1. oyuncunun puanı: " + birinciOyuncuPuan);
        }

        }


    }

