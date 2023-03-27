package J16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

    public static void main(String[] args) {


// Local DateTime --> yıl ay gün saat dakika saniye datalarını tutar

        LocalDateTime ldt = LocalDateTime.now(); // sistemden mevcut date ve time datası ldt ye atandı.

        System.out.println("ldt = " + ldt);

        LocalDate date = LocalDate.of(2022,12,25);
        LocalTime time = LocalTime.of(17,23,40);
        LocalDateTime ldt2 = LocalDateTime.of(date,time);

        System.out.println("ldt2 = " + ldt2);

        LocalDateTime ldt3 = LocalDateTime.of(2022,10,14,16,45,10);

        System.out.println("ldt3 = " + ldt3);

        System.out.println(ldt3.minusHours(4).plusDays(45).minusYears(4).plusMonths(4));


    }

}
