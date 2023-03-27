package J16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

// Local Time--> saat dakika saniye datalarını tutar.

        LocalTime suAn = LocalTime.now(); // sistemden mevcut zaman bilgisi suAn 'a atandı

        System.out.println("suAn = " + suAn);


        System.out.println("suAn.getHour() = " + suAn.getHour());

        System.out.println("suAn.getMinute() = " + suAn.getMinute());

        System.out.println("suAn.getSecond() = " + suAn.getSecond());

        System.out.println("suAn.getNano() = " + suAn.getNano());

        // tanımlanan bir Time öncesi minus sonrası plus() gitme

        LocalTime time1 = LocalTime.of(17,23,55);

        System.out.println("time1.plusHours(5).minusMinutes(40).plusHours(20) = " + time1.plusHours(5).minusMinutes(40).plusHours(20));

        LocalTime loopBası= LocalTime.now(); // loop başlamadan mevcut time
        System.out.println("loopBası = " + loopBası);

        int sayi =0;
        for (int i = 0; i <1000; i++) {
            sayi+=i;

        }


        LocalTime loopSonu = LocalTime.now(); // loop bittikten sonraki time
        System.out.println("loopSonu = " + loopSonu);

        System.out.println("loop çalışma süresi = " + (loopSonu.getSecond() - loopBası.getSecond()));


    }
}
