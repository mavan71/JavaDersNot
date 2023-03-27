package J15_Varargs;

public class Task04 {

    public static void main(String[] args) {



// Task 04 -> Stringlerin istenilen kadar ilk harflerini birleştirerek yazdıran method create ediniz.



        ilkHarfler(2,"ilkbahar","sonbahar","yaz","kış");


    }

    private static void ilkHarfler(int ilkharf , String...str) {
        String birleşmiş="";
        for (String w :str) {
         birleşmiş=birleşmiş.concat(w.substring(0,ilkharf));
        }
        System.out.println("birleşmiş hali = " + birleşmiş);
    }
}
