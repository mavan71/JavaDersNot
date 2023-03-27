package J26_Exceptions.Proje.ŞanslıKullanıcı;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Kullanıcı {


   String name;

    LocalDateTime kayıtZamanı;

    public Kullanıcı() {

    }

  public Kullanıcı(String name, LocalDateTime kayıtZamanı) {
    this.name = name;
    this.kayıtZamanı = kayıtZamanı;
  }

    @Override
    public String toString() {
        return "name= " + name +
                ", kayıtZamanı=" + kayıtZamanı ;
    }
}
