package J10_MethodCreation;

import java.util.Scanner;

public class C04_ATM_Method {
    static   int bakiye =1500;
    static Scanner input = new Scanner(System.in);

    public static void islemTercihi(){
        System.out.print("yapacağınız işlemi seçiniz :");
        int secim = input.nextInt();


        switch (secim) {

            case 1://bakiye sorgu
                bakiyeSorgula();
                sonKarar();
                break;
            case 2://para yatırma
                System.out.println("*****para yatırma işleminiz yapılıyor*****");
                System.out.print("yatıracağınız miktarı giriniz :");
                int yatanMiktar=input.nextInt();
                bakiye+= yatanMiktar;
                System.out.println(yatanMiktar+ " $ para yatırma işleminiz tamamlanmıştır***");
                bakiyeSorgula();
                sonKarar();
                break;
            case 3://para çekme
                paraCek();
                sonKarar();
                break;
            case 4://çıkış
                cikis();
                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz");
        }


    }

    private static void paraCek() {
        System.out.print("çekmek istediğiniz miktarı giriniz :");
        int cekilen = input.nextInt();
        if (cekilen <= bakiye){
            bakiye-= cekilen;
            System.out.println("****işleminiz yapılıyor****");
            System.out.println("****para çekme işleminiz tamamlanmıştır***");
        }else {
            System.out.println("bakiyeniz yetersiz");
        }

    }

    public static void bakiyeSorgula(){
        System.out.println("**** bakiye sorgulama sayfasındasınız***");
        System.out.println("****işleminiz yapılıyor****");
        System.out.println("bakiyeniz :"+ bakiye);
        System.out.println("****bakiye sorgulama işleminiz tamamlanmıştır***");
    }

    public static void cikis() {
        System.out.println("****işleminiz yapılıyor****");
        System.out.println("****çıkış işleminiz tamamlanmıştır***");
    }

    public static void sonKarar () {
        System.out.println("devam etmek için :1 \n bitirmek için : 0");
        int sonKarar=input.nextInt();
        if (sonKarar==1){
            islemTercihi();
        } else if (sonKarar==0) {
            cikis();
        }

    }


}
