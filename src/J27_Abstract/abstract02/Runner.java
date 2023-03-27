package J27_Abstract.abstract02;

public class Runner {

    public static void main(String[] args) {


        Personel p1 =new Isci();
        Personel p2 = new IderiPersonel();
        System.out.println("işci bilgileri****************************");
        p1.maasHesapla();
        p1.maasBilgisi();
        p1.sigorta();
        p1.name="Şesu";
        System.out.println("p1.name = " + p1.name);

        System.out.println("***************************");
        System.out.println("idari personel bilgileri");
        p2.maasHesapla();
        p2.maasBilgisi();
        p2.sigorta();
        p2.name="BiloCan";
        System.out.println("p2.name = " + p2.name);


    }
}
