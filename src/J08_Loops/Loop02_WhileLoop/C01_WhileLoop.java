package J08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*
        başlama, bitiş ve değişim değerleri net bilinen tekrarlarda for loop ama adım sayısı ya da değişim değeri net bilinmeyen, belli bir şarta (duruma-boolean) bağlı tekrarlarda while loop kullanılır.
         */


// TASK01: 3den 20 ye kadar olan tam sayıları prin ediniz.

        int i=3;

        while ( i <=20) {
    //        System.out.println(i);
            i++;
        }



// TASK02: 7 Kere "JavaCan" print eden cod yazınız.


        int a = 1;

        while ( a <=7){
     //       System.out.println(a+ ". JavaCan");
            a++;
        }



// task 03: iki basamaklı tek sayıları print edniz.

        int t = 11;

        while ( t <=99){
     //       System.out.println(t);
            t+=2;
        }


// task 04 : bir basamaklı sayma sayıları print ediniz.

        int bir = 1;
        while(bir<10) {
    //        System.out.print(bir+" ");
            bir++;
        }



// task 05 : girilen ifadeyi tersten print eden cod yazınız.


        Scanner scan = new Scanner(System.in);

//        System.out.println("bir metin giriniz : ");
   //     String aa = scan.nextLine();
 //       int aaUzunluk = aa.length();

 //       while (aaUzunluk >=1) {
      //      System.out.println(aa.charAt(aaUzunluk-1));
  //          aaUzunluk--;

 //       }


//task 06: girilen tam sayıya kadar sayıların toplamını print ediniz




    //    System.out.println("Lütfen bir tam sayı giriniz :");

   //     int task6 = scan.nextInt();
   //     int toplam = 0;

   //     while (task6 >=0) {
   //         toplam+=task6;
   //         task6--;

  //      }System.out.println(toplam);



// task 07 : girilen tam sayının faktöriyelini prin eden cod yazınız.
        System.out.print("Lütfen bir tam sayı giriniz :");
        int task7 = scan.nextInt();
        int fak = 1;

        while (task7 >0) {
            fak*=task7;
            task7--;
        }
        System.out.println(fak);























    }
}
