package J16_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {

    public static void main(String[] args) {

        LocalTime gece = LocalTime.of(0,23);

        LocalTime gunduz = LocalTime.of(13,17);

        Duration fark = Duration.between(gunduz, gece);
        Duration fark2 = Duration.between(gece, gunduz);


        System.out.println("fark = " + fark);
        System.out.println("fark2 = " + fark2);

        System.out.println("fark.getSeconds() = " + fark.getSeconds());






    }
}
