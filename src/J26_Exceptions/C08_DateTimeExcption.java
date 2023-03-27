package J26_Exceptions;

import java.time.LocalDate;

public class C08_DateTimeExcption {

    public static void main(String[] args) {

            /*
            Date time exception --> tarih zaman valuelerde oluşan RTE
             */

        //LocalDate d1=LocalDate.of(2023,04,31); // DateTimeException

        //System.out.println(d1);

        try{
            LocalDate d1=LocalDate.of(2023,02,29);
            System.out.println("bu satırı okuduysan code exception fırlatmadı");
        }catch (RuntimeException e){
            System.out.println("hatalı giriş " + e.getMessage());
            System.out.println("bu satırı okuduysan code excepition fırlattı ama handle ettik");

        }

        System.out.println("************************** code app çalıştı ********************************");
    }
}
