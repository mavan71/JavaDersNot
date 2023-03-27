package J27_Abstract.abstract03;

public class Cember extends Sekil{
    public Cember(double yarıCap) {
        this.yarıCap = yarıCap;
    }

    double yarıCap;
    final double pi=3.14;
    @Override
    public double alan() {
            double alan= pi*yarıCap*yarıCap;
        return alan;
    }

    @Override
    public double cevre() {
        double cevre= 2*pi*yarıCap;
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

