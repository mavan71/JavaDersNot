package J13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {

    public static void main(String[] args) {

        int age = 48; // tek bir primitive data depolayan variable
        int ageArr[] = new int [10];
        int ageArr1 [][] = new int [10][3];

        ArrayList<Integer> ageList = new ArrayList<>(); // istenildiği kadar primitive data depolar

        // <>: generic diamond operator

/*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper class gibi object türünden olmalidir


            2.  - Arrayler degistirilemez sabit bir .length;'de tanimlanir.
                - ArrayList'ler degistirilebilir size(); belirleme zorunlulugu olmadan tanimlanır.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<Wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile print edilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */

        // List create etme ve değer atama ;

        ArrayList <Integer> listSayi = new ArrayList <>();
        // 1. yol add()

        listSayi.add(31); // liste ilk eleman olarak 31 eklendi

        listSayi.add(46); //
        listSayi.add(79); //
        listSayi.add(44); //
        listSayi.add(2); //
        listSayi.add(1); //
        listSayi.add(63); //
        listSayi.add(46); // list tekrarlı elemanı kabul eder.

        System.out.println("listSayi = " + listSayi);

        // 2. yol Arrays.asList() -> çuval

        ArrayList <String> ülkeList = new ArrayList<>(Arrays.asList("Alamanya", "Fransa", "Amerika", "İngiltere", "Gana"));

        System.out.println("ülke listesi = " + ülkeList);

        //3. yol --> List.of() -> çuval

        ArrayList <String> isimList =  new ArrayList<>(List.of("Aydın", "Ceren", "Cihat", "İsmail", "Furkan", "Tuğba"));

        System.out.println("isimList = " + isimList);

        // List print etme;

        System.out.println("isimList = " + isimList); // gibi

        // for döngüsüyle eleman atama:

        ArrayList <Integer> ebikGabık = new ArrayList<> (){
            {
                for (int i = 0; i <10 ; i++) {
                    add(i);
                    
                }
            }

        };
        System.out.println("ebik gabık list = " + ebikGabık);




    }
}
