package J26_Exceptions.Task;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("AGAM haba buz gibi dışarı çıkma");

         */
        System.out.println("Hava sıcaklığını giriniz");
        double hava= scan.nextDouble();

        try {
            sıcaklıkKontrol(hava);
        }catch (Exception e){
            System.out.println(e.getMessage() + " : Havanın soğuk olduğu söylenmişti");
            System.out.println("Bu satırı okuduysan code exception fırlattı ama handle ettik");
        }

        System.out.println("************************** app  code çalıştı ********************************");
    }

    private static void sıcaklıkKontrol(double hava) throws IOException {
        if ( hava<10){
            throw new IOException("hava çok soğuk");
        } else System.out.println("hava gayet güzel");

    }


}
