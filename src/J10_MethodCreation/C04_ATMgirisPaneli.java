package J10_MethodCreation;

import static J10_MethodCreation.C04_ATMapplication.islemTercihi;


public class C04_ATMgirisPaneli {


    public static void girisEkranı(){
        System.out.println("******************************** ");

        System.out.println("*** JavaBanka Hoşgeldiniz ***");

        System.out.println("İşlem Menü \n Bakiye Sorgu :1 \n Para Yatırma :2 \n Para Çekme  :3 \n Çıkış :4");
        islemTercihi();
    }
}
