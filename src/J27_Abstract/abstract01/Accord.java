package J27_Abstract.abstract01;

public class Accord extends Honda{// concrete implementation // Honda abs class'a extend


    @Override
    public void motorHacmi() {// abtract parent den zorunlu implementing edilmiş concrete metodh
        System.out.println("Accord modellerinde 2.0 motor hacmi vardır");
    }

    @Override
    public void kapı() {
        System.out.println("kapılar vakumlu olabilir");

    }

    @Override
    public void koltuk() {
        System.out.println("Koltuklar deri kaplama olsun");

    }

    @Override
    void sunRoof() {//override edilmiş abstract parent den zorunlu olmayan
        System.out.println("sun roof isteğe bağlıdır");
    }
}
