package CodeChallengeLessons.Lesson02;

import java.util.Scanner;

public class Q11_SwitchCase {
    public static void main(String[] args) {


                 /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir gün ismi giriniz :");

        String gunler = scan.nextLine();



        switch (gunler) {
            case "pazartesi" :
            case "salı" :
                System.out.println("Bugün 'java' dersim var");
            break;
            case "perşembe" :
            case "cuma" :
                System.out.println("Bugün 'selenyum' dersim var");
            break;
            case "çarşamba" :
            case "cumartesi" :
                System.out.println("Bugün 'SQL' dersim var");
            break;
            case "pazar" :
                System.out.println("izin günü");
            break;
            default:
                System.out.println("böyle bir gün yok!!");
        }




































        {

        }





























    }


}