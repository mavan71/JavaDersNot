package J23_AccesFodifier.Başkapackage;

import J23_AccesFodifier.C01_AccesModifier;

public class C03_AccesModifierRunner {

    private String namePrivate ="İsmail bey";

    protected String nameProtected= "Ceren Hanım";

    String nameDefault ="Vedat bey";

    public String namePublic = "Haluk Hoca";

    public static void main(String[] args) {


        C01_AccesModifier obj5= new C01_AccesModifier (45, 70);

        System.out.println("obj5.publicYas = " + obj5.publicYas); // farklı package

     //   obj5.defaultYas // farklı package public hariç (default, private, protec) default variable call edilemez

      //  obj5.namePrivate // farklı package obj erişilemez.
      //  obj5.nameProtected // farklı package obj erişilemez.
      //  obj5.nameDefault // farklı package obj erişilemez.
      //  obj5.namePublic // farklı package obj erişilemez.

        C03_AccesModifierRunner obj6= new C03_AccesModifierRunner();
        System.out.println("obj6.nameDefault = " + obj6.nameDefault);
        System.out.println("obj6.namePrivate = " + obj6.namePrivate);
        System.out.println("obj6.nameProtected = " + obj6.nameProtected);
        System.out.println("obj6.namePublic = " + obj6.namePublic);


    }
}
