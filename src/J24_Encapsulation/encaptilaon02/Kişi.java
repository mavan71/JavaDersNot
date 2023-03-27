package J24_Encapsulation.encaptilaon02;

public class Kişi {// pojo class

    /* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */

  private   String ad;
    private    String soyad;
    private    int yas;
    private String password;

    public Kişi() {

    }

    public Kişi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = Math.abs(yas);
        this.password = password;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Kişi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", password='" + password + '\'' +
                '}';
    }
}
