package Projeler.FilmProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmProjesi {
    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static Scanner scan = new Scanner(System.in);
     /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.


      1. adım: kullanıcıya film listesinden bir film seçtir.
      kullanıcı filmi seçerken hangi film olduğunu görmeyecek,
      numarasına göre seçecek.

      2. adım: filmGetir(); metodu oluştur.

      3. adım: harfleri "-" ile değiştir ve yazdır,
      filmin kaç harfli olduğunu yazdır.
      "JOKER" seçildiyse "-----" olarak gözüksün

      4. adım: filmdeki harf sayısına göre tahmin hakkı verilir.
        5 harfli film için 5*2 yani 10 tahmin hakkı

      5. adım: yanlış tahmin sayısını say

      6. adım: film için tahmin edilen harf al

      7. adım: harf filmin içinde bulunmuyorsa yanlış
       tahmin sayısını bir artır,
       bulunuyorsa harfin yerini göster

      8. adım: kazandınız veya kaybettiniz yazdır
     */

    public static void main(String[] args) {
        System.out.println("Lütfen bir filim seçiniz" +
                        " \n 1-? \n 2-? \n 3-? \n 4-? \n 5-? \n 6-? \n 7-? \n 8-? " );
        int filmSecim= scan.nextInt();

        switch (filmSecim){
            case 1:
                filmGetir(filmSecim);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            default:
                System.out.println("Hatalı giriş..Lütfen tekrar deneyiniz.");
                break;
        }


    }

    private static void filmGetir(int movieSecim) {

       if (movieSecim==1) {
           System.out.println(filmler.get(0).replaceAll("\\w", "_"));
       } else if (movieSecim==2) {
           System.out.println(filmler.get(1).replaceAll("\\w", "_"));
       } else if(movieSecim==3){
           System.out.println(filmler.get(2).replaceAll("\\w", "_"));
       } else if(movieSecim==4){
           System.out.println(filmler.get(3).replaceAll("\\w", "_"));
       }


    }
}
