package J16_DateTime;

import java.time.LocalDate;

public class C07_ComparingDataTime {

    public static void main(String[] args) {

        LocalDate böyün = LocalDate.now();
        System.out.println("böyün = " + böyün);

        LocalDate falanGün = böyün.plusDays(58);
        System.out.println("falanGün = " + falanGün);

        LocalDate feşmekanGün = böyün.minusDays(23);
        System.out.println("feşmekanGün = " + feşmekanGün);

        LocalDate abdiBey = LocalDate.of(1983,10,8);
        System.out.println("abdiBey = " + abdiBey); //

        System.out.println("böyün.isAfter(abdiBey) = " + böyün.isAfter(abdiBey)); // true

        System.out.println("abdiBey.isBefore(feşmekanGün) = " + abdiBey.isBefore(feşmekanGün)); //true

        System.out.println("falanGün.isBefore(feşmekanGün) = " + falanGün.isBefore(feşmekanGün)); // false


        System.out.println("böyün.isLeapYear() = " + böyün.isLeapYear()); //false


        System.out.println("böyün.compareTo(abdiBey) = " + böyün.compareTo(abdiBey)); // 40

        System.out.println("böyün.compareTo(falanGün) = " + böyün.compareTo(falanGün)); // -2

        System.out.println("böyün.compareTo(feşmekanGün) = " + böyün.compareTo(feşmekanGün)); // 23


        /*     ComperaTo komutu işlevi:
2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */


    }
}
