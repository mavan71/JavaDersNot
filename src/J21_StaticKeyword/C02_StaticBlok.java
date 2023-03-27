package J21_StaticKeyword;

public class C02_StaticBlok { // class level

    static String isim="Haluk Hoca";

    static { // static block
        System.out.println("1. static block run edildi");
        System.out.println("1. blok update öncesi isim :" + isim);
        isim="Celine hanım";
        System.out.println("1. blok update sonrası isim :" + isim);
    }


    public static void main(String[] args) { // main level

        /*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */

        System.out.println("main method başladı");
        isim="Mustafa bey";
        System.out.println("isim :"+ isim);
        System.out.println("main method bitti");


    }

    static {
        System.out.println("2. static block  run edildi");
        System.out.println("2. blok update öncesi isim :" + isim);
        isim="Ceren patron";
        System.out.println("2. blok update sonrası isim :" + isim);
    }
}
