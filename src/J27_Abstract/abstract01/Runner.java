package J27_Abstract.abstract01;

public class Runner {

    public static void main(String[] args) {


        Cıvıc c1= new Cıvıc();

        c1.motorHacmi();
        c1.kapı();
        c1.koltuk();
        c1.lastikEbat();
        c1.sunRoof();
        c1.isim="typeR";
        System.out.println(c1.isim);
        System.out.println("*******************************************");
        Honda c2= new Accord();
        c2.isim="consolCar";
        c2.koltuk();
        c2.kapı();
        c2.sunRoof();
        c2.motorHacmi();
        System.out.println(c2.isim);


    }
}
