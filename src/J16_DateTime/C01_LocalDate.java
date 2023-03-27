package J16_DateTime;

import java.time.LocalDate;

import static java.time.Month.MAY;

public class C01_LocalDate {

    public static void main(String[] args) {



        //Local Date ---> Sadece gün - ay- yıl datalarını store eder.

        LocalDate bugün = LocalDate.now();// sistemden mevcut tarih datası bugün e atandı.

        System.out.println("bugün = " + bugün);//2023-03-01 (mevcut günün tarihi, değişebilir yani)

        System.out.println("bugün.getYear() = " + bugün.getYear());//2023
        System.out.println("bugün.getMonth() = " + bugün.getMonth());// march
        System.out.println("bugün.getMonthValue() = " + bugün.getMonthValue()); //3
        System.out.println("bugün.getDayOfWeek() = " + bugün.getDayOfWeek()); // WEDNESDAY
        System.out.println("bugün.getDayOfMonth() = " + bugün.getDayOfMonth());//1
        System.out.println("bugün.getDayOfYear() = " + bugün.getDayOfYear());//60


        LocalDate date1 = LocalDate.of(2016,3,23);
        LocalDate date2 = LocalDate.of(2014,MAY,19);

        // tanımlanan bir date in öncesi -> minus () ve sonrası --> plus () gitme

        System.out.println("date1.plusDays(45) = " + date1.plusDays(45));

        System.out.println("date2.minusMonths(33) = " + date2.minusMonths(33));

        System.out.println("bugün.plusDays(11).minusWeeks(7).plusMonths(3).minusYears(5) = " + bugün.plusDays(11).minusWeeks(7).plusMonths(3).minusYears(5));




    }
}
