package J27_Abstract.abstract01;

public class Crv extends Honda {


    @Override
    public void motorHacmi() {
        System.out.println("CRV motor hacmi 2.4 turbo olmalıdır");
    }

    @Override
    public void kapı() {
        System.out.println("4 kapı otomatic olmalıdır");

    }

    @Override
    public void koltuk() {
        System.out.println("deri koltuk kolay silinebilir");
    }
}
