package J24_Encapsulation.encaptilation03;

public class Arac { // pojo


    //1-private fields
    //2-constructer
    //3- getter and setter
    //4- to-String
/*
 1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
  */

private String model;
private String renk;
private int motor;
private int yil;

    public Arac(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        setMotor(motor);
        setYil(yil);
    }

    public Arac(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if(motor<1000){
            System.out.println("1000cc den küçük aracımız olamaz");
        } else this.motor = motor;

    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<1886){
          yil= Math.abs(yil);
            System.out.println("arac yılı hatalı!!");
        } else this.yil = yil;

    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
