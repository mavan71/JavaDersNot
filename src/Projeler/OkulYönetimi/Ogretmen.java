package Projeler.OkulYönetimi;

public class Ogretmen extends Kisi {

    private String sicilNo;
    private String bolum;

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {
        super(adSoyad, kimlikNo, yas); // super full parametreli constructer
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    public Ogretmen() {
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " sicilNo='" + sicilNo + '\'' +
                ", bolum='" + bolum + '\'' ;
    }
}


































