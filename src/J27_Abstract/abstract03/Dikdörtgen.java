package J27_Abstract.abstract03;

public class Dikdörtgen extends Sekil {

    double a;

    public Dikdörtgen(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double b;
    @Override
    public double alan() {
        double alan=a*b;
        return alan;
    }

    @Override
    public double cevre() {
        double cevre=2*(a+b);
        return cevre;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void ciz() {
        super.ciz();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
