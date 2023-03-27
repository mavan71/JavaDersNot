package J15_Varargs;

import java.util.Scanner;

public class Task01 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.

input : "h", "a", "l", "u", "k";
output : haluk

input : "a", "l", "i";
output : ali

 */
        String strArr1 []= {"h", "a", "l", "u", "k"};
        String strArr2 []= {"a", "l", "i"};

        concatVarargs(strArr1);
        concatVarargs(strArr2);
        concatVarargs("j","a","v","a","T","A","R");





    }

    private static void concatVarargs(String ...str) {
        String cümle="";
        for (String w:str) {
           // cümle+=w;
            cümle=cümle.concat(w);
        }
        System.out.println("cümle = " + cümle);
    }
}
