package J27_Abstract.abstract02;

public class Isci extends  Personel{
    @Override
    public void maasHesapla() {
        System.out.println("maaşınız = 30 gün x 500tl");

    }

    @Override
    public void maasBilgisi() {
        System.out.println("işci maaşı : 15.000");

    }

    @Override
    public void sigorta() {
        System.out.println("işci sigorta kesintisi aylık 1000 tl");
    }
}
