package J26_Exceptions;

public class C03_ClassCastException {

    public static void main(String[] args) {

        // ClassCastException --> birbirine dönüştürülemeyen (convert edilemeyen) data type lar dönüştürme işleminde oluşan run time exception dur.


        Object obj = "JavaCanlara Selam";
        System.out.println("obj = " + obj);//JavaCanlara Selam
        String str= (String) obj; // object data type String data type casting yapıldı
        System.out.println("str = " + str);//JavaCanlara Selam

        Object sayi=33;
       // String str1= (String) sayi;//object data type String data type casting yapıldı
       // System.out.println("str1 = " + str1);//.ClassCastException
        try {
            String str1= (String) sayi;
            System.out.println("try blok çalıştı");
        }catch (ClassCastException e){
            System.out.println("cath blok çalıştı");
        }

        System.out.println("****************** code çalıştı ****************************");
    }
}
