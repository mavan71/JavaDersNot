package J27_Abstract.abstract02;

public class IderiPersonel extends Personel{
    @Override
    public void maasHesapla() {
        System.out.println("maaşınız = 22 gün x 500tl");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("idari personel maaşı = 11000");

    }

    @Override
    public void sigorta() {
        System.out.println("idari personel sigorta kesintisi = 500 tl");
    }
}
