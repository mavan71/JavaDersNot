package J22_Scope;

public class C03_Scope {



    public static void main(String[] args) {

        C01_InstenceVariable obj1= new C01_InstenceVariable();

        C02_StaticVariable obj2= new C02_StaticVariable();

        obj1.non_static_method(); //non-static method çalıştı
        C01_InstenceVariable.static_method();//static method çalıştı

        obj1.developerMı=true;
        System.out.println("obj1.developerMı = " + obj1.developerMı);//obj1.developerMı = true
        System.out.println("C01_InstenceVariable.kurs = " + C01_InstenceVariable.kurs);//C01_InstenceVariable.kurs = ClarusWay


    }
}
