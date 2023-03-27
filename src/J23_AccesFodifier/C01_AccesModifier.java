package J23_AccesFodifier; // packet level


/*
        1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
        Diğer class'lardan "private" class member'lara erişilemez

            2) Diğer package'lerden   olusturulan object için class'i import edilmeli

            3) Diğer package'lerden default class memberlara erişilemez.
             "default"  "package private" sağlar

            4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

             5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
            için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

             6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
             Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

    */
public class C01_AccesModifier { // class level

    private int priviteYas=33;

    int defaultYas=24; // access modifier yazılmazsa default olarak JVM tarafından tanımlanır.

    protected int protectedYas= 40;

    public int publicYas= 48;

   private C01_AccesModifier (){// default parametresiz constractre
       System.out.println("private parametresiz constract çalıştı");
    }

    public C01_AccesModifier (int ilkYas, int sonYas){
        System.out.println("public parametreli constractor çalıştı");
    }




    private static void privateMethod() {
        System.out.println("private method çalıştı");
    }

    protected void protectedMethod(){
        System.out.println("protected method çalıştı");
    }

//    C01_AccesModifier obj=new C01_AccesModifier();
}
