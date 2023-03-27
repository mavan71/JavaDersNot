package J27_Abstract.abstract04;

public class Runner {

    public static void main(String[] args) {

        Baklava havucDilimi = new Baklava();
        havucDilimi.name="Fıstıklı";
        havucDilimi.madeIn();
        havucDilimi.taste();
        System.out.println("havucDilimi = " + havucDilimi);

        System.out.println("****************** ");

        SezarSalad s = new SezarSalad();
        s.name ="Gavur dağı";
        s.madeIn();
        s.taste();
        System.out.println("s = " + s);

    }
}
