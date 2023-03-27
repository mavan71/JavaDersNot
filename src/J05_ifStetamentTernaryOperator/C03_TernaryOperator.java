package J05_ifStetamentTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

     /*   ternary ile yapılan tum actionlar if-else blok ile yapılır.
            ternary blok

      */



        // girilen bir tam sayının tek - çift olmasını kontrol edin

       //         System.out.println("Lütfen bir tam sayı giriniz :");

//                    int sayi = scan.nextInt();
//
//                            if (sayi%2 ==0){
//                                System.out.println("sayı çifttir");
//                            } else {
//                                System.out.println("sayı tek");
//                            }
//
//
//            String sonuc =  (sayi%2==0 ? "sayınız çifttir" : "sayınız tektir");
//                 System.out.println(sonuc);



        // girilen bir tam sayının pozitif negatif olmasını kontrol edin
//
//                        System.out.println ("Lütfen bir sayı giriniz");
//
//                             int xx = scan.nextInt();
//
//                          String snc = xx > 0 ? "pozitif" : "pozitif değildir";
//                                    System.out.println(snc);


//                        System.out.println ("Lütfen bir sayı giriniz");
//
//                        int yy= scan.nextInt();
//
//                        System.out.println ("Lütfen bir sayı daha giriniz");
//
//                        int zz = scan.nextInt();
//
//                        if (zz>yy) {
//                            System.out.println("büyük olan sayı " + zz  );
//                        } else {
//                            System.out.println("büyük olan sayı " + yy);
//                        }

     // System.println("büyük sayı " + zz>yy ? zz : yy);

                    // girilen iki sayının işaretleri farklı ise toplamını değilse devamke yazsın

                        System.out.println ("Lütfen bir sayı giriniz");
                        int s1 = scan.nextInt();
                        System.out.println ("Lütfen bir sayı daha giriniz");
                        int s2 = scan.nextInt();


        Object bisey =((s1 >0 && s2 <0) ||(s1 <0 && s2>0)) ? s1+s2 : "dewamke";
                System.out.println(bisey);


        // hepsini kapsayan (parent) clas'a object clas denir.
    }


// ternary true veya false sonucuna göre bir çıktı verir. eğer bu çıktı data type na göre bir veriable atanmazsa Compare Time Error verir.
    // çözüm olarak ya print komutuna alınmalı ya da bir variable ye atanmalıdır.

























    }

