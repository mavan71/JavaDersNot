package J24_Encapsulation.encaptilaon01;

public class C02_Encaptilation { // pojo class
    /*
Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
basit bir veri nesnesi olabilirler. POJO'lar, genellikle diğer nesneler veya bileşenlerle
 işbirliği yapmak için kullanılırlar ve bu nedenle veri aktarım nesneleri (DTO) olarak da adlandırılabilirler.
 */


  String name="tuğba hanım";

   private  int id=1001;

private    String email="mail@ebikgabık";

String soyad="Güzel";

public C02_Encaptilation(){

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public C02_Encaptilation(String name, String email, int id){


}

//public String mailVer (){
//
//    return email;
//}
//
//    public Integer IdVer (){
//
//        return id;
//    }














}
