package J25_Inheritance.inheritance02;

public class Runner {

    public static void main(String[] args) {

        Koyun k1= new Koyun(); // Koyun Data type obj

        System.out.println(k1.a);//0 Hayvanlar class dan
        System.out.println(k1.c);//2 // koyun class dan
        System.out.println(k1.d);//7 // koyun class dan
        System.out.println(k1.m);//1 // memeliler class dan

        Memeliler k2= new Koyun("pamuk"); // Memeliler Data type object

        System.out.println(k2.a);
        System.out.println(k2.c);
      //  System.out.println(k2.d); inherited edilmiş herhangi bir obje variable Data type göre
        System.out.println(k2.m);

        Hayvanlar k3 = new Koyun("kahveli"); // Hayvanlar Data type object
        System.out.println(k3.a);
        System.out.println(k3.m);
     //   System.out.println(k3.c);
    //    System.out.println(k3.d);

        System.out.println("************");
        k1.mA();//mA --> Hayvanlar class method çalıştı
        k1.mC();//mc--> Koyun class method call edildi
        k1.mM();//mM ---> Memeliler class method call edildi
        System.out.println("************");
        k2.mA();//mA --> Hayvanlar class method çalıştı
        k2.mC();//mc--> Koyun class method call edildi
        k2.mM();//mM ---> Memeliler class method call edildi
        System.out.println("************");
        k3.mA();//mA --> Hayvanlar class method çalıştı
        k3.mM();//mM ---> Memeliler class method call edildi

        // inheritance edilmiş bir obj. method call edilirken önce kendinden başlanır.





    }
}
