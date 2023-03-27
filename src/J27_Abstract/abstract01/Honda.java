package J27_Abstract.abstract01;

public abstract class Honda { // abstract parent class


    public abstract void motorHacmi(); // abstract method

    public abstract void kapı();

    public abstract void koltuk();


    void sunRoof(){//concrete method (somut metod) call edilebilir
        System.out.println("sun roof isteğe bağlı");

    }

        // abstract class'da da variables tanımlanabilir!!

     String isim="Murat Bey";

   // abstract String str="JavaCan"; // abstract class da abstract variables olmaz!!!!


        // final method ;

   // final void finalMetod(); // final  method bady siz call edilemez

 //   final abstract void finalMetod(); // final abstract method call edilemez

  //  private abstract void finalMetod(); // abstract method kısıtlanamaz yani private olamaz

   // static void gunesMethod(); // static concrete method body siz olamaz!!

    // static abstract void gunesMethod();  // abstract static method olmaz

   // Honda h1=new Honda(); abstract class dan obj üretilemez






}
