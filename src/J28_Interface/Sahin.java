package J28_Interface;

public class Sahin extends Tofaş implements DısDonanım, IcDonanım, lastik{
    @Override
    public void motor() {
        System.out.println("1.6 motor seçeneği mevcut");
    }

    @Override
    public void yakit() {
        System.out.println("LPG olsa daha iyi olur");
    }

    @Override
    public void kapi() {
        System.out.println("dört kapı otomatik");
    }

    @Override
    public void kaporta() {
        System.out.println("kaporta teneke");

    }

    @Override
    public String sisLamp() {
        return DısDonanım.super.sisLamp();
    }

    @Override
    public void koltuk() {
        System.out.println("deri koltuk bulunmamaktatdır");

    }

    @Override
    public void klima() {
        System.out.println("arabamızda AÇS vardır");

    }

    @Override
    public void ebat() {
        System.out.println("185/55/15");

    }

    @Override
    public void jant() {
        System.out.println("janti teker çok şeker");

    }


}
