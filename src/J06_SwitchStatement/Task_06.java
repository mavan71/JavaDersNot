package J06_SwitchStatement;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz

        System.out.println("Lütfen harf yazınız");
        char harf = scan.next().charAt(0);

                switch (harf) {
                    case 'v':
                    case 'V':
                        System.out.println("VERY");
                        break;
                    case 'i':
                    case 'I':
                        System.out.println("IMPORTANT");
                        break;
                    case 'p':
                    case 'P':
                        System.out.println("PERSON");
                        break;
                    default:
                        System.out.println("lütfen başka bir harf yazınız");
                }


















































    }
}
