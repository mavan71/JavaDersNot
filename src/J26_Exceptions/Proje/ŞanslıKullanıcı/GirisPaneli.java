package J26_Exceptions.Proje.ŞanslıKullanıcı;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {


    public void giris(){

        Scanner scan = new Scanner(System.in);

        Kayıt yeniKayıt = new Kayıt();

        ArrayList<Kullanıcı> kisi = new ArrayList<>();
        boolean cıkılsınMI = true;
        while (cıkılsınMI){
            System.out.println("Lütfen işlemlerden birini seçiniz \n Kullanıcı Kayıt Al 1 \n Şanslı Kullanıcı Bul 2 \n Listele 3 \n Cıkış 4");
            int tercih = scan.nextInt();
            switch (tercih){
                case 1:
                    kisi= yeniKayıt.kayıtAl();
                    break;
                case 2:
                   yeniKayıt.sansliKullanici(kisi);
                   break;
                case 3:
                    yeniKayıt.listele(kisi);
                    break;
                case 4:
                    cıkılsınMI = false;
                    break;
                default:
                    System.out.println("Hatalı giriş, Lütfen tekrar deneyiniz");
                    break;

            }
        }




    }

}
