package J08_Loops.Loop01_ForLoop;

public class C03_NestedLoop {
    public static void main(String[] args) {



/*
bir loop bady de farklı bir loop tanımlanmasıyla oluşan code bloka nasted loop denir.
site-->apartman--> daire gibi
iç loop dış loop un her step inde tekrar çalışır, ayrıca en içteki loop bitmeden dış loop bitmez. ilk önce en içteki loop run olur.
 */

        for (int apt = 1; apt < 10; apt++) {
            for (int daire = 1; daire <5 ; daire++) {
                System.out.println("apt :" +apt+ " için daire :" +daire);
                
            }
            
        }

















    }
}
