package J22_Scope;

import J21_StaticKeyword.C02_StaticBlok;

public class C02_StaticVariable { // class level

     /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alınır

       Static variabler ise class variable olarak tanimlanir
       ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali
     */

    static String firmaIsim="ClarusWay"; // initial edilmiş static variable
    static int firmaId;  // initial edilmemiş static variable
    static boolean firmaIt; // initial edilmemiş static variable


    public static void main(String[] args) { // main level

        System.out.println("firmaIt = " + firmaIt);
        firmaIt=true; // static variable doğrudan call edilip value atandı // best practice
        System.out.println("firmaIt = " + firmaIt);

        C02_StaticVariable.firmaId=2021; // Class name ile static variable call edilip value atandı.//bad practice

        staticMethod(); // static method static blok a call edildi.

     //   nonStaticMethod(); // non static method doğrudan call edilemez!!!!!



    } // main sonu

    public static void staticMethod(){
        System.out.println("value ataması yapıladan önce firmaId = " + firmaId);
        firmaId=2023; // initial edilmemiş static variable static blok a doğrudan call edilip value atandı.
        System.out.println("value ataması yapıldıktan sonra firmaId = " + firmaId);



    }
    public void nonStaticMethod(){
        System.out.println("non static bloc update öncesi firmaIsim = " + firmaIsim);
        firmaIsim="ClarusWay";
        System.out.println("non static bloc call update sonrası firmaIsim = " + firmaIsim);
        staticMethod(); // non static method a doğrudan call edilir.

    }
}// class sonu
