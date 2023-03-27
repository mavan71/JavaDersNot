package Projeler.MarketDeneme;

import java.util.Scanner;

public class Müşteri {

    MarketHesabı a;

    Scanner scanner = new Scanner(System.in);
    void alışVeris(){
        System.out.println("Kaç ekmek almak istersiniz");
        int x = scanner.nextInt();
        System.out.println("ekmek fiyat :" +a.ekmekAl(x)/x + " TL" );
        System.out.println("Almış Olduğunuz " + x + " tane ekmek için ödemeniz gereken ücret " + a.ekmekAl(x));


    }

}
