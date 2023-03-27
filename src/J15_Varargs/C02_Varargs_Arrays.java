package J15_Varargs;

public class C02_Varargs_Arrays {

    public static void main(String[] args) {


        int sayiArr []= {31,21,33,44,46,58,2,1,79};


        // Task01:-->  verilen array elemanlarının toplamını print eden METHOD create ediniz.

        System.out.println(arrayTopla(sayiArr));
        System.out.println("********* Varargs Arrays ********");

        // Task01:-->  verilen array elemanlarının toplamını print eden METHOD u Varargs ile create ediniz.

        System.out.println(varargsTopla(45, 77, 12, 33, 1, 14, 15));


        // Trick : Varargs methodda girilen parametreler array gibi tanımlanıdğı için array parametre de alabilir.

    }

    private static int varargsTopla(int...a) {
        int toplam = 0;
        for (int b:a) {
            toplam+=b;
        }
        return toplam;
    }

    private static int arrayTopla(int sayiArr[]) {
        int toplam = 0;
        for (int a:sayiArr) {
            toplam+=a;
        }

        return toplam;
    }
}
