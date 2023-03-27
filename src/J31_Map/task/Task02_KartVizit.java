package J31_Map.task;

public class Task02_KartVizit { // kartvizit objesinin field ve methods ları bulunacak

    String isim;
    String adres;
    String email;
    String telefon;
   static int id=100;

    public Task02_KartVizit(String isim, String adres, String email, String telefon) {
        this.isim = isim;
        this.adres = adres;
        this.email = email;
        this.telefon = telefon;
        this.id++;
    }

    @Override
    public String toString() {
        return "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\''
                ;
    }
}
