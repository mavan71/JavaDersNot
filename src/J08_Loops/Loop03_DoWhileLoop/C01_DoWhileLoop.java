package J08_Loops.Loop03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        /*
While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise döngü devam eder.
sart false ise loop kırılır ve loop dan sonraki ilk satır çalışır.
do-While loop->  game app. de daha çok kullanılır.
Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
en az bir kez çalışır..

 */

//                  ******    while loop ******
//        int yas= 41;
//
//        while (yas>40) {
//            System.out.println("İsmail bey :) yaşınız " + yas+ " gayet başarılı while bady action aldı." );
//            yas--;
//        }


         //****** do while loop ******


        int yas =41;
        do {
            System.out.println("İsmail bey :) yaşınız " + yas+ " gayet başarılı do while bady action aldı." );
            yas--;
        }while (yas>40);
































    }
}
