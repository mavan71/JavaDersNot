package J11_Debugging;

public class C01_Debugger {
    /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir...


İki durumda debugger gerekli olabilir:
*  Mevcut kod devralındığında.
*  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
*/
    static  int ebikGabık=17;
    public static void main(String[] args) {



 method01(); // ev temizliği

























    }


    private static void method01() {
        ebikGabık++;
        int a=0;
        for (int i = 0; i <=10 ; i++) {
            System.out.print(i+" ");
            a+=2*i;
        }
        System.out.println();

        System.out.println("*** method01 exit***"); // method exit

        System.out.println("*** method02 call***"); // method02 call
        method02(); // mutfak temizliği

        System.out.println("*** method03 call***"); // method03 call
        method03(); // balkon temizliği
        
    }



    private static void method02() {
        System.out.println("*** method02 çalışıyor***"); // method02 start
        ebikGabık+=5;
        for (int x = 0; x <=7; x++) {
            System.out.print(x + " ");
            
        }
        System.out.println();
        System.out.println("**** method02 exit***"); // method02 exit
    }

    private static void method03() {
        System.out.println("** method03 start***"); // method03 start
        ebikGabık-=3;
        for (int y = 0; y<=5  ; y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("** method03 exit***"); // method03 exit
        System.out.println("*** method01 exit***");
    }



}
