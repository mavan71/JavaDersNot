package J28_Interface;

public class Runner {
    public static void main(String[] args) {


        Sahin araba = new Sahin();

        araba.kapi();
        araba.kaporta();
        araba.jant();
        araba.ebat();
        araba.koltuk();
        araba.klima();
        araba.motor();
        araba.yakit();
        araba.sisLamp();
        araba.sunRuf();
        DısDonanım.anten();


        System.out.println("Dış Donanım Renk : " + DısDonanım.RENK);
        System.out.println("İç donanım Renk : " + IcDonanım.RENK);
        System.out.println("Lastik renk : " + lastik.RENK);

        System.out.println("IcDonanım.KUMAS = " + IcDonanım.KUMAS);
        System.out.println("IcDonanım.MUSİC = " + IcDonanım.MUSİC);




    }
}
