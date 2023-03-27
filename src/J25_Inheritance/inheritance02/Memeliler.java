package J25_Inheritance.inheritance02;

public class Memeliler extends Hayvanlar{


    int m=1;
    int c=4;

    public Memeliler() {
        this('H'); //
        System.out.println("memeliler parametresiz constructer çalıştı");

    }

    public Memeliler(char y){
        super(34); // super class dan (ata) metod call edildi
        System.out.println("memeliler parametreli constructer çalıştı");
    }

    public void mC(){
        System.out.println("mC ---> Memeliler class method call edildi");
    }

    @Override// dip not
    public void mM(){// parent den ezen method
        System.out.println("mM ---> Memeliler class method call edildi");
    }

}
