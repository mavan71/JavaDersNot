package J26_Exceptions.Task;

import java.util.Scanner;

public class Task01 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
 */

        System.out.println("Passwordunuzu giriniz");
        String password = scan.nextLine();

       try{
           if (password.length()<6 || password.length()>10){
               throw new IllegalArgumentException("pasword 6 karakterden az 10 karakterden fazla olamaz");
           }else{
               System.out.println("Giriş başarılı");
           }
       } catch (IllegalArgumentException e){
           System.out.println(e.getMessage() + " Lütfen passwordunuzu tekrar deneyiniz");
           System.out.println("Bu satırı okuduysan code exception fırlattı ama handle ettik");
       }

        System.out.println("************************** app  code çalıştı ********************************");

    }

}
