package J10_MethodCreation.Task;

import java.util.Scanner;

public class Task_15_UcusProject {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */



        ucusProject01();









    }

    private static void ucusProject01() {
        System.out.println("**** ClarusWay Hava Yollarına Hoşgeldiniz ****" );
        System.out.println("Lütfen seyehat etmek istediğiniz şehri giriniz: \n B şehri için 1 : \n C şehri için 2 : \n D şehri için 3 : ");
        int sehir= input.nextInt();
        double toplamUcret=0;
        switch (sehir) {
            case 1:
                System.out.println("Lütfen yaşınızı giriniz :");
                int yas= input.nextInt();
                if (yas<12){
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                   switch (yon) {
                       case 4:
                           toplamUcret = bSehriUcret() * ogrenci();
                           System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                       break;
                       case 8:
                           toplamUcret = ((bSehriUcret() * ogrenci()) * gidisDonus());
                           System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                       break;
                       default:
                           System.out.println("Lütfen geçerli bir yön seçiniz");
                   }
                } else if (yas > 12 && yas < 24) {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4:
                            toplamUcret = bSehriUcret() * indrimli();
                            System.out.print("toplam ücretiniz:" + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = (bSehriUcret() * indrimli()) * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                } else if (yas > 65) {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4:
                            toplamUcret = bSehriUcret() * emekli();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = (bSehriUcret() * emekli()) * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                } else {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4:
                            toplamUcret = bSehriUcret();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = bSehriUcret() * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                }break;
            case 2:
                System.out.println("Lütfen yaşınızı giriniz :");
                yas = input.nextInt();
                if (yas<12){
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon) {
                        case 4:
                            toplamUcret = cSehriUcret() * ogrenci();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = (cSehriUcret() * ogrenci()) * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                } else if (yas > 12 && yas < 24) {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4:
                            toplamUcret = cSehriUcret()* indrimli();
                            System.out.print("toplam ücretiniz:" + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = cSehriUcret() * indrimli() * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                } else if (yas > 65) {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4:
                            toplamUcret = cSehriUcret() * emekli();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = (cSehriUcret() * emekli()) * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                } else {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4:
                            toplamUcret = cSehriUcret();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = cSehriUcret() * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                }break;
            case 3:
                System.out.println("Lütfen yaşınızı giriniz :");
                yas= input.nextInt();
                if (yas<12){
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon) {
                        case 4:
                            toplamUcret = dSehriUcret() * ogrenci();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = (dSehriUcret() * ogrenci()) * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                } else if (yas > 12 && yas < 24) {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4:
                            toplamUcret = dSehriUcret() * indrimli();
                            System.out.print("toplam ücretiniz:" + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = (dSehriUcret() * indrimli()) * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                } else if (yas > 65) {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4 :
                            toplamUcret = dSehriUcret() * emekli();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = (dSehriUcret() * emekli()) * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                } else {
                    System.out.println(" biletinizi tek yön almak isterseniz 4 \n gidiş-dönüş almak isterseniz 8 tuşlayınız :");
                    int yon= input.nextInt();
                    switch (yon){
                        case 4:
                            toplamUcret = dSehriUcret();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        case 8:
                            toplamUcret = dSehriUcret() * gidisDonus();
                            System.out.print("toplam ücretiniz: " + toplamUcret+ " $");
                            break;
                        default:
                            System.out.println("Lütfen geçerli bir yön seçiniz");
                    }
                }break;
            default:
                System.out.println("Lütfen geçerli bir şehir seçiniz");
        }

    }

    private static double emekli() {
        double emekli = 0.70;
        return emekli;
    }

    private static double indrimli() {
        double indrimli= 0.90;
        return indrimli;
    }

    private static double ogrenci() {
        double ogrenci= 0.5;
        return ogrenci;
    }

    private static double gidisDonus() {
        double gidisDonus= 0.80*2;
        return gidisDonus;
    }

    private static double dSehriUcret() {
        double dSehriUcret = 0.10*900;
        return dSehriUcret;
    }

    private static double cSehriUcret() {
        double cSehriUcret = 0.10*700;
        return cSehriUcret;
    }

    private static double bSehriUcret() {
        double bSehriUcret = 0.10*500;
        return bSehriUcret;
    }


}



