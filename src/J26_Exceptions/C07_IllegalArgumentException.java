package J26_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        /*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */


// IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
// ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..

        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

        try {
            if (yas<18){
                throw new IllegalArgumentException(yas+ " yaşınız henüz yeterli değil ");
                //throw key word ile exc. obj oluşturularak hata tanımlanır ve fırlatılır
                // böylece şartımıza uymayan velue için cath blok a düşürülerek hata handling edilir.
            }
            System.out.println("bu satırı okuduysan code exception fırlatmadı");
        }catch (IllegalArgumentException e) {
            System.out.println("18 yaşından küçüklere ehliyet verilememektedir.");
            System.out.println("bu satırı okuduysan code excepition fırlattı ama handle ettik");
            System.out.println(e.getMessage() + (18-yas) + " yıl beklemeniz lazım");
        }



    }
}
