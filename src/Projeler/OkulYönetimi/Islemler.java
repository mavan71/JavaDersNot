package Projeler.OkulYönetimi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

  static List<Ogretmen> ogretmenList = new ArrayList<Ogretmen>(); // oluşturulacak öğretmenleri saklayacak data type list oluşturuldu.
  static List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>(); // oluşturulacak öğretmenleri saklayacak data type list oluşturuldu.

   static Scanner scan = new Scanner (System.in);

   static String kisiTuru;

   public static void girişPaneli(){
       System.out.println("********************************** \n OGRENCI VE OGRETMEN ANA MENÜ \n ********************************** \n 1- OGRENCI ISLEMLERİ MENÜSÜ \n 2- OGRETMEN ISLEMLERi MENÜSÜ \n Q- CIKIS \n Lutfen yapmak istediginiz islemi giriniz : ");

        switch (scan.next().toUpperCase()) {
            case "1":
                kisiTuru="OGRENCİ";
                islemMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız \n Lütfen tekrar deneyiniz");
                girişPaneli();
                break;
        }
   }

    private static void islemMenusu() {
        System.out.println("Sectiginiz kisi turu: " +kisiTuru+ " MENÜ Lutfen asagidaki islemlerden tercih yapiniz.\n *********** "+kisiTuru+" MENÜ ISLEMLER ************\n 1-EKLEME \n 2-ARAMA \n 3-LISTELEME \n 4-SILME \n 0-ANA MENU");
        System.out.print("Islem Terciniz : ");
        switch (scan.nextInt()){
            case 1:
                ekle();
                break;
            case 2:
                ara();
               break;
            case 3:
                listele();
                break;
            case 4:
                sil();
                break;
            case 0:
                girişPaneli();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız, \n Lütfen tekrar deneyiniz");
                islemMenusu();
                break;
        }


    }

    private static void sil() {
        System.out.println("*** "+kisiTuru+ " SİLME SAYFASINA HOŞGELDİNİZ***");
        if(kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("Silinecek öğrencinin kimlik numarasını giriniz");
            for (Kisi k:ogrenciList) {
                if (k.getKimlikNo().equals(scan.next())){
                    ogrenciList.remove(k);
                    System.out.println("öğrencimiz başarıyla silinmiştir \n" +
                            " öğrenci işlemleri menüsüne yönlendiriliyorsunuz" );
                    break;
                } else {
                    System.out.println("girdiğiniz numarada listede bulunmamaktadır");
                }
            }



        }else {
            System.out.println("Silinecek öğretmenin kimlik numarasını giriniz");
            String silinecekogretmen=scan.next();
            for (Kisi p:ogretmenList) {
                if (p.getKimlikNo().equals(silinecekogretmen)){
                    ogretmenList.remove(p);
                    System.out.println("öğretmenimiz başarıyla silinmiştir \n" +
                            " öğretmen işlemleri menüsüne yönlendiriliyorsunuz" );
                    break;
                } else {
                    System.out.println("girdiğiniz numarada listede bulunmamaktadır");
                }
            }

        }


        islemMenusu();

    }

    private static void listele() {
        System.out.println("*** "+kisiTuru+ " LİSTELEME SAYFASINA HOŞGELDİNİZ***");
       if(kisiTuru.equalsIgnoreCase("OGRENCI")){
           System.out.println(ogrenciList);
       }else {
           System.out.println(ogretmenList);
       }
        islemMenusu();
    }

    private static void ara() {
        System.out.println("*** "+kisiTuru+ " EKLEME SAYFASINA HOŞGELDİNİZ***");
        if (kisiTuru.equalsIgnoreCase("OGRENCİ")){
            scan.nextLine();
            System.out.println("Aranan öğrencinin kimlik numarasını yazınız");
            for (Kisi e:ogrenciList) {
                if(e.getKimlikNo().equals(scan.next())){
                    System.out.println("Aradığınız öğrenci " + e.getAdSoyad() + " listemizde mevcuttur");
                    break;
                }else {
                    System.out.println("Aradığınız öğrenci " + e.getAdSoyad() + " listemizde mevcut değildir");
                }

            }
        } else {
            scan.nextLine();
            System.out.println("Aranan öğretmenin kimlik numarasını yazınız");
            for (Kisi f : ogrenciList) {
                if (f.getKimlikNo().equals(scan.next())) {
                    System.out.println("Aradığınız öğrenci " + f.getAdSoyad() + " listemizde mevcuttur");
                    break;
                } else {
                    System.out.println("Aradığınız öğrenci " + f.getAdSoyad() + " listemizde mevcut değildir");
                }

            }
        }

    }

    private static void ekle() {
        System.out.println("*** "+kisiTuru+ " EKLEME SAYFASINA HOŞGELDİNİZ***");
        if(kisiTuru.equalsIgnoreCase("OGRENCI")){
            scan.nextLine();// dumy
            System.out.println("öğrencinin adını-soyadını giriniz");
            String ogrAdSoyad=scan.nextLine();
            System.out.println("öğrencinin kimlik no giriniz");
            String ogrKimlikNo=scan.next();
            System.out.println("öğrencinin yaşını giriniz");
            int ogrYas=scan.nextInt();
            System.out.println("öğrencinin numarasını giriniz");
            String ogrNo=scan.next();
            System.out.println("öğrencinin sınıfını giriniz");
            String ogrSınıf=scan.next();
            Ogrenci ogrenci=new Ogrenci(ogrAdSoyad,ogrKimlikNo,ogrYas,ogrNo,ogrSınıf);
            ogrenciList.add(ogrenci);
            System.out.println("öğrencimiz " +ogrAdSoyad+ " başarıyla eklenmiştir. \n öğrenci işlemleri menüsüne yönlendiriliyorsunuz" );

        }else {
            System.out.println("öğretmenin adını-soyadını giriniz");
            scan.nextLine();// dumy
            String ogretmenAdıSoyadı=scan.nextLine();
            System.out.println("öğretmenin kimlik no giriniz");
            String ogretmenKimlikNo=scan.next();
            System.out.println("öğretmenin yaşını giriniz");
            int ogretmenYas=scan.nextInt();
            System.out.println("öğretmenin sicil numarasını giriniz");
            String ogretmenSicil=scan.next();
            System.out.println("öğretmenin sınıfını giriniz");
            String ogretmenBolum =scan.next();
            Ogretmen ogretmen=new Ogretmen(ogretmenAdıSoyadı,ogretmenKimlikNo,ogretmenYas,ogretmenSicil,ogretmenBolum);
            ogretmenList.add(ogretmen);
            System.out.println("öğretmenimiz " +ogretmenAdıSoyadı+ " başarıyla eklenmiştir. \n öğretmen işlemleri menüsüne yönlendiriliyorsunuz" );

            System.out.println(ogretmenList);
        }
        islemMenusu();
       
    }

    private static void cıkıs() {
        System.out.println("İyi günler diler, Yine Bekleriz");
    }


}
