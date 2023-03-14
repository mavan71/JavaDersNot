package Projeler.OkulYönetimi;

public class Kisi {
   private String adSoyad;
    private  String kimlikNo;
    private  int yas;

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad.toUpperCase();
        this.kimlikNo = kimlikNo;
        this.yas = Math.abs(yas);
    }

    public Kisi() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return  "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas
                ;
    }
}





