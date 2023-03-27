package J25_Inheritance.inheritance02;

public class Koyun extends Memeliler{

    int c=2;
    int d=7;


    public Koyun() {
        super();
        System.out.println("Parametresiz Koyun constructor çalıştı");
    }

    public Koyun(String str) {
        this();
       // this("a")// CTE recursive  constructor TANIMLANAMAZ!!
        System.out.println(super.c); // parent class c variable call edildi.
        System.out.println("Parametreli koyun constructor çalıştı");
    }

    @Override // annotation --> overriden (ezilen) meth ile overriding (ezen) method ilişkilendirildi
    public void mC() {
        System.out.println("mc--> Koyun class method call edildi");

    }

    @Override
    public String toString() {
        return "Koyun{" +
                "c=" + c +
                ", d=" + d +
                ", m=" + m +
                ", c=" + c +
                ", a=" + a +
                ", m=" + m +
                "} " + super.toString();
    }
}
