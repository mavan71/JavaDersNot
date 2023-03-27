package J10_MethodCreation;

public class C01_MethotCreation {// class başlangıcı
    public static void main(String[] args) {//main başlangıcı


/*
    code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tercih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/



       topla();

        System.out.println(topla1(23, 58));

        topla2(45,1.5,"JavaCan");
        // bir metod main blok dışına create edilir, main blok call edilmezse method run olmaz
        // best practice--> methodlar main metoddan sonra creat edilir.

        System.out.println(topla3());

    }// main sonu

    private static String topla3() {
       int a =23;
       int b= 31;
        return "toplamınız" +(a+b);
    }

    private static void topla2(int sayi, double boy, String name) {

        System.out.println(sayi+boy);
        System.out.println("ağam hoşgelmişsen:" + name);
    }

    private static int topla1(int ebik, int gabık) {


        return (ebik+ gabık)/2; //  iki int değeri topla ve 2ye bölerek return et
    }

    public static void topla(){
        int a= 23;
        int b= 58;
        System.out.println(a + b);
        System.out.println("ağam topla methodundan selam");
    }









}// class sonu
