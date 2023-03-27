package J10_MethodCreation;

import java.util.Scanner;

public class C04_ATMapplication {
    static Scanner input = new Scanner(System.in);
    static   int bakiye =1500;
    public static void main(String[] args) {


       /*
       bakiye sorgu,(başlangıç bakiye $1500) para çekme-yatırma ve çıkış işlemleri  yapan bir ATM application create ediniz.

        */


        System.out.println("****** ClarusWay Banka Hoşgeldiniz ******" );

        sonKarar();





    }



        public static void sonKarar() {

            System.out.println("işlem seçiniz \n devam etmek için: 1 \n çıkış için : 0");
            int seçim = input.nextInt();
            if (seçim==1){
                System.out.println("işlem menüsü: \n bakiye sorgu: 1 \n para çekme : 2\n para yatırma :3 \n çıkış :4");
                islemTercihi();
            } else if (seçim==0){
                cıkıs();
            } else System.out.println("lütfen 0 veya 1 giriniz");
        }


        public static void islemTercihi() {
            System.out.println("Lütfen işleminizi seçiniz");
            int islemSecim = input.nextInt();

            switch (islemSecim){
                case 1: // 1.işlem bakiye sorgu
                bakiyeSorgula();
                sonKarar();
                break;
                case 2: // 2.işlem para çekme

                 break;
                case 3: // 3. işlem para yatırma
                paraYatir();
                sonKarar();
                 break;
                 case 4: // 4.işlem çıkış
                  cıkıs();
                 break;

            }










        }

    private static void paraYatir() {
        System.out.print("yatıracağınız miktarı giriniz :");
        int yatanMiktar = input.nextInt();
        bakiye+=yatanMiktar;
        System.out.println("Hesabınıza " + yatanMiktar + " geçmiştir");
    }

    static void cıkıs() {
        System.out.println("çıkış işleminiz başarıyla yapılmıştır \n yine bekleriz");
    }

    private static void bakiyeSorgula() {
        System.out.println("Güncel bakiyeniz :" + bakiye);
    }


}
