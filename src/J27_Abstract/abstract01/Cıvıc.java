package J27_Abstract.abstract01;

public class Cıvıc extends Lastik{

    /*
extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
java CTE verdi
çözüm:
a) Unımplemented (uyarlanmamış) method implement edilmeli
b)parent Honda class'dan abstarct keyword kaldırılmalı
c)concrete olan child Civic class abstract tanımlanmalı
 */

    // concerete class'da abstract method tanımlanır mı?
    // public  abstract void absMethod();// ya class abs olmalı yada method concrete body olmalı..
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli

    @Override
    public void motorHacmi() {
        System.out.println("cıvıc motor hacmi 1.6 olmalıdır");
    }

    @Override
    public void kapı() {
        System.out.println("kapılar otomatic değil");
    }

    @Override
    public void koltuk() {
        System.out.println("koltuklar süvet deridir");
    }

    @Override
    public void lastikEbat() {
        System.out.println("16 inc lastik kullanır");

        // polymorphisim --> obj nin çok biçimliliği

        Cıvıc c1 = new Cıvıc(); // cıvıc child class data type

        Honda c2 = new Cıvıc();

    }

//    @Override
//    public void motorHacmi() {
//        System.out.println("cıvıc motor hacmi 1.6 olmalıdır");
//    }
//
//    @Override
//    public void kapı() {
//        System.out.println("kapılar otomatic değil");
//
//    }
//
//    @Override
//    public void koltuk() {
//        System.out.println("koltuklar süvet deridir");
//
//    }
}
