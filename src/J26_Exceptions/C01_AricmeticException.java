package J26_Exceptions;

import java.util.Scanner;

public class C01_AricmeticException {

    public static void main(String[] args) {



        /*
        Aritmetik işlemlerde (matematiksel) oluşan Run Time Exception dur
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayi1=scan.nextInt(); //15
        System.out.println("2. sayıyı giriniz");
        int sayi2=scan.nextInt();//0
        //int bolum=sayi1/sayi2;//ArithmeticException/by zero
        //System.out.println("bölme işlemi sonucu :"+bolum );

        try{// dene --> exception olma ihtimalinin denendiği blok(istisnai durum)
            int bolum=sayi1/sayi2;
            System.out.println("bölme işlemi sonucu :"+bolum );
            System.out.println("try blok çalıştı");
        } catch (ArithmeticException ex) {// try blok daki durum gerçekleşirse yapılacak islem
            System.out.println("bir sayının sıfıra bölümü tanımsızdır"+ ex.getMessage());
            System.out.println("1. cath blok çalıştı");
        } catch (ArrayIndexOutOfBoundsException ebik){
            System.out.println("olmayan Array elemanını istiyorsunuz");
            System.out.println("2. cath blok çalıştı");
        }catch (Exception e){// bütün exceptionları kapsayan exception clas tır.. ama bad practise dir.
            e.getStackTrace();// tüm açıklamanın referans değerini verir
            e.printStackTrace();// tüm açıklamayı yazar.
            System.out.println("3. cath blok çalıştı");
        }
        finally {// ne yaparsan yap bu blok çalışır yani cath bloklardan sonra olması istenen aksiyon  için tanımlanır.
/*
try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
hata alınır ama finaly tanımlanırsa catch çalışmasa bile
pr akışı devam eder.finally block hata olsa da olmasa da calışır.
Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
 */
            System.out.println("finally block çalıştı");
        }


        System.out.println("************kod sonu*****************");

       /*
        1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz.catch block try block exception yakalarsa calışır
        2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
        aynı anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
        3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE

                */

    }
}
