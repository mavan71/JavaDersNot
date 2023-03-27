package J19_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {

    public static void main(String[] args) {


/*
String = > daha yavas ,Immutable==> degismez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

    */


        String name ="";
        name+="QA tester";
        name+="Ali bey"; // String variable çok fazla method call için performansı zayıftır.(yavaştır)

        /*
 Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olanStringBuilder kullanılır.
yapısı gereği hızlı çalışır.Fakat paralel çalışan uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.
StringBuilder; Dolmus söföru gibi önüne geleni aliyor
StringBuffer de TAKSİ ler gibi çalışır
 */
        System.out.println("method öncesi " +name); // method öncesi

        strBirlestir(); // name makyaja dublörü gitti


        System.out.println("method sonrası " +name);// immutable

        //task: --> 3333 tekrarlı loop ile String variable ve String builder obj run time sürelerini karşılaştıran code create ediniz.

        String str = "";

        StringBuilder sb = new StringBuilder();

        LocalTime strBaslangıc= LocalTime.now(); // str başlama zamanı

        for (int i = 0; i <= 3333; i++) {       // str aksiyonu
            str+=i;
            
        }

        LocalTime strBitis = LocalTime.now(); // str bitiş zamanı
        System.out.println("String hızı= " + (strBitis.getNano()- strBaslangıc.getNano()) );


        System.out.println("*************sb builder loop*****************");

        LocalTime sbBaslangıc= LocalTime.now();// sb başlama zamanı

        for (int i = 0; i <=3333; i++) { // sb
            sb.append(i);

        }

        LocalTime sbBitis = LocalTime.now();// sb bitiş zamanı

        System.out.println("String Builder hızı= " + (sbBitis.getNano()- sbBaslangıc.getNano()) );

    }

    private static void strBirlestir() {

        System.out.println("method call başarılı çalıştı devam kee ");
    }
}
