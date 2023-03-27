package J27_Abstract.abstract03;

public abstract class Sekil {

    String name;

    public abstract double alan();

    public abstract double cevre();


    public String getName() {

        return this.name;
    }

    public void ciz(){
        System.out.println(this.name + " çizildi");

    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name  +
                "\n alan =" + this.alan() +
                "\n çevre =" + this.cevre();
    }
}
