package Projeler.OkulYönetimi;

public class Ogrenci  extends Kisi{

    private String numara;
    private String sınıf;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        this.sınıf = sınıf;
    }

    public Ogrenci() {
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    @Override
    public String toString() {
        return    super.toString()+ " numara='" + numara + '\'' +
                ", sınıf='" + sınıf + '\''
                ;
    }

}
