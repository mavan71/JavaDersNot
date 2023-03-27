package J25_Inheritance.inheritance04;

public class SubClass extends SupperClass{

    int sayi= 17;

    public SubClass() {

    }
    public static void main(String[] args){

        SubClass sb1= new SubClass();
        sb1.javaCAN();

    }
    public void javaCAN(){
        System.out.println("ebikGabik() = " + ebikGabik());
        System.out.println("super.ebikGabik() = " + super.ebikGabik());
        System.out.println("sayi = " + sayi);
        System.out.println("super.sayi = " + super.sayi);

    }

    @Override
    public String ebikGabik() {

        return "Agam SubClass'dan selam dewamkeee. ";
    }


}
