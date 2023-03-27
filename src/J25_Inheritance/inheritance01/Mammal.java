package J25_Inheritance.inheritance01;

public class Mammal extends Hayvancık{// Hayvancık parent class ın child class ı


    public Mammal() {
        System.out.println("Parametresiz mammal cons call edildi");
    }
    public void sutBeslen(){
        System.out.println("bebeklerini süt ile besler");
    }

    public void dogum(){
        System.out.println("yavrusunu doğurur");
    }

}
