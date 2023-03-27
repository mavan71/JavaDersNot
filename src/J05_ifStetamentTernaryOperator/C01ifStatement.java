package J05_ifStetamentTernaryOperator;

public class C01ifStatement {

    // if stantment blok; belli durum ve aksiyonları belirli şarta bağlı olarak çalıştırmak için kullanılır

    public static void main(String[] args) {

    int abdiYas = 33;
    int mstfYas = 41;
     if (abdiYas == mstfYas) {
         System.out.println("yaşdaş arkadaşlar ");
         System.out.println("yoksam siz kardeş misiniz?");


     }


    if (mstfYas >= abdiYas) {
        System.out.println("kırk yas dırt yas");

    }

    if (abdiYas+mstfYas >100) System.out.println("bir asırlık yas");
    // if blok ta {} kullanılmazsa bad practise olur, kod ; e kadar if  ile çalışır. if den sonrası bağımsız çalışır.
        System.out.println("agam devamke code sorunsuz calişti");

        // bağımsız if blokları sadece kendi scop (kapsam) run eder
        // birden fazla if blokların hepsinin body çalışabileceği gibi şart sağlanmazsa hiç biri çalışmayabilir.






    }
































    }

