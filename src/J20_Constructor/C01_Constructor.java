package J20_Constructor;

public class C01_Constructor {


        String str;
        String selam= "selam Javacanlar";

    //    C01_Constructor obj1 =  new C01_Constructor();
    public static void main(String[] args) {
            String maindekiVariable="";


    /*
            1- consturctor ismi Calss name ile aynı olmalı.Cons name Buyuk harf ile başlamalı
2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
            3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
            5-Class tanımlandığında java default cons. kendi create eder.
6-Fields-> obj'nin uretilirken alacagı değer variables
            7-bir class'da bir den çok cons. tanımlanabiliR

            */


        C01_Constructor obj1 = new C01_Constructor();

        C01_Constructor obj2 = new C01_Constructor();

        C01_Constructor obj3 = new C01_Constructor();

        obj1.selam="selam JavaTar :)";
        obj2.selam="sefil Haluk'a bol samırsaklı atom kelle-paça çeek";

        System.out.println("obj1.selam = " + obj1.selam);//
        System.out.println("obj2.selam = " + obj2.selam);
        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj3.selam = " + obj3.selam); //selam Javacanlar

        // selam // class leveldeki bir variable obj olmadan call edilemez
        
        obj1.agamaSelam(); // obj1 üzerinden non-static method call edildi. //ağama bolcana selamkee :))
        obj2.agamaSelam();// obj1 üzerinden non-static method call edildi. //ağama bolcana selamkee :))
        obj3.agamaSelam();// obj1 üzerinden non-static method call edildi. //ağama bolcana selamkee :))
        //    agamaSelam(); // non static method lar obje olmadan call edilemez


    }

    private void agamaSelam() {//non static
        System.out.println("ağama bolcana selamkee :))");
    }

}