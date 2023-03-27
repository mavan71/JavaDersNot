package J24_Encapsulation.encaptilation03;

public class AracRunner {

    public static void main(String[] args) {


        Arac arac1= new Arac();
        Arac arac2= new Arac("test", "gri",1500,2014);
        Arac arac3= new Arac("böcek", "bej",3000,2005);


        System.out.println(arac1.getModel());
        System.out.println(arac1.getRenk());
        System.out.println(arac1.getYil());
        System.out.println(arac1.getMotor());

        arac1.setModel("serçedes");
        arac1.setRenk("civciv sarısı");
        arac1.setYil(-1974);
        arac1.setMotor(1300);

        System.out.println(arac1.getModel());
        System.out.println(arac1.getRenk());
        System.out.println(arac1.getYil());
        System.out.println(arac1.getMotor());

        System.out.println("arac2 = " + arac2);
        System.out.println("arac3 = " + arac3);

    }
}
