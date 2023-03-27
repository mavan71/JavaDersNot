package J22_Scope;

public class C01_InstenceVariable {
    /*                                     INSTANCE VARIABLE

      1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
         olusturulan variable'lara "instance variable" denir.
      2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
      3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
         Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
         Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
            "yas" variable'i initialize edildi, digerleri initialize edilmedi.
      4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
               byte, short, int, long icin default value 0'dir.
               float, double --> default value 0.0'dir.
               char --> default value 0'dir.
               boolean --> default value false'dur.
               String --> default value "null" dir.

   */

    static String kurs="ClarusWay"; // initial edilmiş
    static String language; // initial edilmemiş

    // fields;---> instance variables

    int yas=48;// initalize variable
    int tecrube; // default value =0
    String name;
    boolean developerMı;
    double boy;
    char unvan;
    public static void main(String[] args) {

     //   static int a=17; // local variable static olamaz!!!
        // static blok da  static variable tanımlanamaz!!!
        int a=17; // local variable (initial edilmiş)
        System.out.println(a);
        int b; // local variable (initial edilmemiş)
       // System.out.println("b = " + b); // initial edilmemiş variable local de action almaz
        b=46; // value ataması yapıldı
        System.out.println("b = " + b);

        //    System.out.println("yas = " + yas); initialize edilmemiş instance variable obj olmadan call edilemez.

        System.out.println("kurs = " + kurs); // initialize edilmiş static variable static blok a doğrudan call edilebilir.

        System.out.println("language = " + language); // default değeri gelir

        static_method();
      //  non_static_method(); // static blok a non static method call edilemez!!
        C01_InstenceVariable obj = new C01_InstenceVariable();
        obj.non_static_method(); // non static method call edildi

        System.out.println("obj.developerMı = " + obj.developerMı); // non static instance variable static blok a obj. ile call edilir.


    }
    public void non_static_method(){
        System.out.println("non-static method çalıştı");
    }
    public static void static_method (){
        System.out.println("static method çalıştı");
    }
}
