package J22_Scope;

public class C04_LocalVariable {


    public static void main(String[] args) {

        int yas=33; // main local de create edilen primitive variable
        System.out.println("yas = " + yas);

        yas=48; // local variable update edildi
        System.out.println("yas = " + yas);

        for (int i = 1; i <7; i++) {
            System.out.println(yas + " " +i);
            i+=3;// i loop variable aynı loop local de call edildi

        }
           // i  ---> i loop local dışı call edilemez!!!

    }

    // yas ---> main local de tanımlandığından local harici call edilemez.
}
