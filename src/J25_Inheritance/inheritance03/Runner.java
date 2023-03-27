package J25_Inheritance.inheritance03;

public class Runner {
    public static void main(String[] args) {

        A a1=new A();
        System.out.println(a1.str);//bad practice
        System.out.println(A.str);// best practice
        A a2=new B();


        B b1=new B();
        System.out.println(B.str);


    }



}
