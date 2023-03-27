package J26_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {

        /*
        null ataması yapılan bir String variable length() method call edildiğinde
        ortaya çıkan exception  dur
         */

    String str1="";
        System.out.println("str1.length() = " + str1.length());//0

    String str2=null;
      //  System.out.println("str2.length() = " + str2.length());// NullPointerException // code kırılır,

     try {
         System.out.println("str2.length() = " + str2.length());
         System.out.println("try blok çalıştı yani code exception fırlatmadı");
     }catch (NullPointerException e) {
         System.out.println("null değerinin length i olmaz...");

     }

        System.out.println("************************** code app çalıştı ********************************");
    }
}
