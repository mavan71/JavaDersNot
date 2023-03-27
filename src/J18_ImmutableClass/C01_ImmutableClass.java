package J18_ImmutableClass;

public class C01_ImmutableClass {

    public static void main(String[] args) {

        String str1="Harika"; //initial yapılmış str1 variable
        String str2="Harika"; // str1 ve str2 aynı ilk değer atamaları yapıldığı için String pool ortak referans atanır.

        String str3 = new String ("Harika");//initial yapılmış String obje-- heap memory de saklanır
        String str4 = new String ("Harika");// initial yapılmış String obje-- heap memory de saklanır
        String str5 =str1+"";

        System.out.println("str1==str2" + (str1==str2));// true
        System.out.println("str1==str3" + str1==str3);// false
        System.out.println("str1.equals(str2) = " + str1.equals(str2));// true
        System.out.println("str3==str4" + str3==str4);// false
        System.out.println("str1==str5" + str1==str5);// false
        System.out.println("str1.equals(str5) = " + str1.equals(str5));// true


    }
}
