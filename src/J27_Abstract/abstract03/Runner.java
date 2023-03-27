package J27_Abstract.abstract03;

public class Runner {

    public static void main(String[] args) {

        Cember c1 = new Cember(12);
        c1.name="gül oya";
        System.out.println("c1.name = " + c1.name);
        System.out.println("c1.alan() = " + c1.alan());
        System.out.println("c1.cevre() = " + c1.cevre());
        c1.ciz();
        System.out.println("c1.getName() = " + c1.getName());
        System.out.println("c1.toString() = " + c1.toString());


        System.out.println("****************************");
        Dikdörtgen d1 = new Dikdörtgen(15,30);
        d1.name = "dört köşe";
        d1.ciz();
        System.out.println("d1.alan() = " + d1.alan());
        System.out.println("d1.cevre() = " + d1.cevre());
        System.out.println("d1.getName() = " + d1.getName());
        System.out.println("d1.toString() = " + d1.toString());


    }





}
