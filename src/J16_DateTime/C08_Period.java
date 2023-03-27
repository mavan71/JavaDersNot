package J16_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {

    public static void main(String[] args) {

// Period --> iki tarih arasındaki geçen tekrarlanan detayı tutar


        LocalDate bugün = LocalDate.now();

        LocalDate abdiBey = LocalDate.of(1983,10,8);

        Period p1 = Period.between(abdiBey, bugün);
        System.out.println("p1 = " + p1); // P39Y4M16D
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths()); //p1.toTotalMonths() = 472

        System.out.println("p1.getYears() = " + p1.getYears()); //39

        System.out.println("p1.getDays() = " + p1.getDays());//16

        Period p2 = Period.ofDays(9); // 9 günde bir tekrarlanan period

        Period p3 = Period.ofMonths(7);// 7 ayda bir tekrarlanan period

        Period p4 = Period.ofYears(5); // 5 yılda bir tekrarlanan period

        bugün = bugün.plus(p2); // bugünün 9 gün sonrası atandı
        System.out.println("bugün = " + bugün);
        bugün = bugün.minus(p3); // bugün 7 ay öncesi
        System.out.println("bugün = " + bugün);


        // task: 02.01.2023 tarihinde başlayan kursun süresi 9 ay olduğuna göre bitiş tarihini cerate ediniz

        LocalDate ld = LocalDate.of(2023,01,02);

            Period p5= Period.ofMonths(9);

        System.out.println("ld.plus(p5).format(DateTimeFormatter.BASIC_ISO_DATE) = " + ld.plus(p5).format(DateTimeFormatter.BASIC_ISO_DATE));


    }
}
