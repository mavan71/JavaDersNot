package J25_Inheritance.inheritance02;

public class Hayvanlar { //Grand Parent --super


    int a; // ints variable
    int m=3;



    public Hayvanlar() {
        System.out.println("Hayvanlar parametresiz constructer çalıştı");
    }

    public Hayvanlar (int x){
        System.out.println("Hayvalar parametreli constructer çalıştı");
    }

    public void mA (){
        System.out.println("mA --> Hayvanlar class method çalıştı ");
    }

    public void mM (){// child de ezilen method
        System.out.println("mM --> Hayvanlar class method çalıştı ");
    }



}
