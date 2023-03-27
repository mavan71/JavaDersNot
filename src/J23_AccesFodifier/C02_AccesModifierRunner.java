package J23_AccesFodifier;

public class C02_AccesModifierRunner {

    public static void main(String[] args) {



     //  C01_AccesModifier obj1 = new C01_AccesModifier();

        C01_AccesModifier obj1 = new C01_AccesModifier(45,34); // public olan constructor farklı

        C02_AccesModifierRunner obj2= new C02_AccesModifierRunner(); // default prametresiz constructor obj2 create edildi.

        System.out.println("obj1.defaultYas = " + obj1.defaultYas);
        System.out.println("obj1.publicYas = " + obj1.publicYas);
      //  obj1.protectedYas
        obj1.protectedMethod();
      //  obj1.priviteYas
     //   obj1.privateMethod()

     //   C01_AccesModifier.privateMethod();

    }

}
