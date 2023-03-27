package J25_Inheritance.inheritance01;

public class Hayvancık {// grand parent supper class


    public Hayvancık() { // parametresiz supper constructor
        System.out.println("Parametresiz supper hayvancık constructor call edildi");
    }

    public void hareket(){
        System.out.println("hayvancık hareket eder");
    }

    public void beslen(){
        System.out.println("hayvancık beslenir");
    }

    public void içme(){
        System.out.println("hayvancık içer");
    }
}
