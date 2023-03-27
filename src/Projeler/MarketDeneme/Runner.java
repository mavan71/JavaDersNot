package Projeler.MarketDeneme;

public class Runner {
    public static void main(String[] args) {


        Müşteri m1 =new Müşteri();
        Müşteri m2 =new Müşteri();


        m1.a = new SuperMarket();
        m2.a = new MiniMarket();

        m1.alışVeris();
        m2.alışVeris();

    }
}
