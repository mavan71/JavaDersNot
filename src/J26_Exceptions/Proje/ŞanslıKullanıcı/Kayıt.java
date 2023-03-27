package J26_Exceptions.Proje.ŞanslıKullanıcı;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {

    ArrayList<Kullanıcı> kullanıcıKisiler = new ArrayList<>();

    public Kayıt() {
    }

    public ArrayList<Kullanıcı> kayıtAl(){
        Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen adınızı giriniz");
       String ad = scan.nextLine();
       Kullanıcı k1= new Kullanıcı(ad, LocalDateTime.now());
        kullanıcıKisiler.add(k1);

       return kullanıcıKisiler;
   }

    public void sansliKullanici(ArrayList<Kullanıcı> kllObj){
        for (Kullanıcı k :kllObj) {

            if (k.kayıtZamanı.getSecond() <= 10){
                System.out.println(k.name + " Tebrikler!! Şanslı Kullanıcısınız");
            }else {
                System.out.println(k.name + " Maalesef Olmadı!!");
            }

        }
    }

    public void listele(ArrayList<Kullanıcı> kllObj) {
        System.out.println(kllObj);
    }
}
