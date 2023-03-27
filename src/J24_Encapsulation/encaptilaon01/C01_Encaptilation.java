package J24_Encapsulation.encaptilaon01;

public class C01_Encaptilation {


    /*
      1) Encapsulation kisaca "data hiding" demektir

      2) Basarili bir Encapsulation için :
         a)Nasil kullanilacagi ve hedefi net olmalidir.(Direksiyon gibi)
         b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
          karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
         c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

      3) Encapsulation yapısı  tanımlanması için
         a)Access modifier'lari private tanımlanmalı
         b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
          update edilebilmeli(setter)    .
          c) uygun constructor tanımlanmalı.
          d) toString() method tanımlanmalı


      4) Encapsulation'in faydalari
         a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
         b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
           tum classlar'dan istenildiği kadar kullanabiliri.
         c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
          hale getirebilir.
         d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
          (setter() olusturma) yapabilir.

          ahan da  TRICK : Tum variable'lar private ve sadece getter() method tanımlanan  class'da
           data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

      5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

    */
    public static void main(String[] args) {


        C02_Encaptilation obj1 = new C02_Encaptilation();
        obj1.name="Ali Osman";

//        System.out.println(obj1.mailVer());//mail@ebikgabık
//
//        System.out.println(obj1.IdVer());//1001

        obj1.soyad="Çirkin"; // encaptilation edilmeyen variable obje yardımıyla update edildi.


        System.out.println(obj1.getId()); //1001
        obj1.setId(9999); // Id primitive variable set edildi
        System.out.println(obj1.getId()); //9999
    }
}
