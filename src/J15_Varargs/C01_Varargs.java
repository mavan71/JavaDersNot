package J15_Varargs;



public class C01_Varargs {

    public static void main(String[] args) {

/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

           1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
          2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

  */
        // Task01--> verilen iki int value toplayan method create ediniz.

        System.out.println("*********** task01 ***********");
        int sayi1= 25;
        int sayi2= 30;
        int sayi3= 46;
        int sayi4= 34;

        sayiTopla(sayi1,sayi2);
        sayiTopla(sayi2,sayi3);
        sayiTopla(sayi3,sayi4);
        sayiTopla(255,564);
        System.out.println("****** Varargs method *********");
        toplaVarargs(46,85,74,55,65,20);

        System.out.println("************* task02 ************");

        // task02: verilen String value ların en çok karaktere sahip olanını print eden code create ediniz.

        enUzuunKelime("javacandır","bu","memleket","gibisi","yoğğğ");
    }

    private static void enUzuunKelime(String ...cumle) {
        String enUzunKelime = "";
        for (String b:cumle) {
            if (b.length()>enUzunKelime.length()) {
                enUzunKelime = b;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);
    }


    private static void toplaVarargs(int ...num) {
       int toplamVarargs=0;
        for (int b:num) {
            toplamVarargs+=b;
        }
        System.out.println("toplamVarargs = " + toplamVarargs);
    }

    private static void sayiTopla(int num1, int num2) {
        int toplam =num1+num2;
        System.out.println("toplam = " + toplam);

    }


}
