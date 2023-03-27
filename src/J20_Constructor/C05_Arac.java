package J20_Constructor;

public class C05_Arac {

//Fields-> obj'nin uretilirken alacagı değer variables
//bir class'da bir den çok cons tanımlanabilir
 /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */

    // fields:

    String model;
    int maxHiz;

    public C05_Arac(String model, int maxHiz) {// full parametreli (teleskopic) constructer
        this.model = model;
        this.maxHiz = maxHiz;
        System.out.println("bu yazıyı okuduysan zengin constructer çalışmıştır");
    }

    public C05_Arac() {
        System.out.println("bu yazıyı okuduysan parametresiz constructer call edilmiştir.");
    }

    @Override
    public String toString() {
        return "C05_Arac{" +
                "model='" + model + '\'' +
                ", maxHiz=" + maxHiz +
                '}';
    }

    public C05_Arac(int maxHiz) {
        this("hacıMurat",124);
        this.maxHiz = maxHiz;
        System.out.println("bu yazıyı okuduysan tek parametreli constructer call edilmiştir");
    }
}
