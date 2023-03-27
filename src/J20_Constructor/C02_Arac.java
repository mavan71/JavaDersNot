package J20_Constructor;

public class C02_Arac {
// fields--instens

    String marka="";
    String model="";
    int km = 0;
    double motorHacim=0;
    boolean vitesAoto=false;
    boolean ikinciEl=false;



    public static void main(String[] args) {

/*
Task-- fields ; marka model, km, motor hacim, vitesAoto, ikinciel, yıl olan
3 obj ler create ederek print eden code yazınız
 */
        
        
      C02_Arac arac1 = new C02_Arac();

      arac1.marka="volvo";
      arac1.model= "S80";
      arac1.km= 100000;
      arac1.motorHacim =1.4;
      arac1.vitesAoto=true;
      arac1.ikinciEl=false;

     //   System.out.println(arac1); // referans değeri verir

        System.out.println(arac1.model+""+arac1.marka+""+arac1.vitesAoto+""+arac1.motorHacim+""+arac1.km+arac1.ikinciEl); // amele code

        System.out.println(arac1);


        C02_Arac arac2 = new C02_Arac();

        arac2.marka="mercedes";
        arac2.model= "a60";
        arac2.km= 200000;
        arac2.motorHacim =2.0;
        arac2.vitesAoto=false;
        arac2.ikinciEl=true;

        System.out.println(arac2);


        C02_Arac arac3 = new C02_Arac();

        arac3.marka="wolsvagen";
        arac3.model= "passat";
        arac3.km= 1000;
        arac3.motorHacim =3.0;
        arac3.vitesAoto=true;
        arac3.ikinciEl=false;

        System.out.println(arac3);


    }// main sonu
    @Override
    public String toString() { // bu method obj datalarını String e convert eder.
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAoto=" + vitesAoto +
                ", ikinciEl=" + ikinciEl +
                '}';
    }
}// class sonu
