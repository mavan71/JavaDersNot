package J07_StringManipulation;

public class C10_isEmpty {
    public static void main(String[] args) {

        /*
 StringIsEmpty
  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
 isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
 Yani o String'in length() 0 demektir.
 length()==0 demek isEmpty() true verir demektir.
 Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin

*/
        String str ="JavaCanlar'a selam bolcana offer.";
        System.out.println(str.isEmpty());
        System.out.println(str.length());

        String str1 = " ";

        System.out.println(str1.isEmpty()); // false

        String str2 = "";
        System.out.println(str2.isEmpty()); // true


        // isBlank() --> hem boş tanımlanan String için hem de sadece space içeren Stringler için "true" diğerlerinde "false" verir.


        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true

        String str4 = "     b       ";
        System.out.println(str4.isBlank()); // false **boş değil**


















    }
}
