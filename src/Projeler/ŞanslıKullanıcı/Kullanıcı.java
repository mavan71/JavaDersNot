package Projeler.ŞanslıKullanıcı;


import java.time.LocalDateTime;

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
