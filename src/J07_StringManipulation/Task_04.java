package J07_StringManipulation;

public class Task_04 {
    public static void main(String[] args) {
/*
        Task->
                Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
        ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
                name1= Java
        name2= haluk
        Print ==> Jahalukva
                */


            String name1 = "Java";
            String name2 = "haluk";

            if (name1.length()%2 == 0) {
                System.out.println(name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2));
            } else System.out.println("name2 name 1'e eklenemez");























    }
}
