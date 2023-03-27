package interviewQuetions.Day03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q03_HackerLanguage {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)


        hackerDili();






    }

    private static void hackerDili() {
        System.out.println("Lütfen bir cümle giriniz");
        String input = scan.nextLine();
        ArrayList <String> lines = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
           lines.add(input.substring(i,i+1));
        }

        System.out.println(lines);
        for (int i = 0; i <lines.size(); i++) {
            if (lines.get(i).contains("s")){
                lines.set(i,"5");
            } else if (lines.get(i).contains("a")) {
                lines.set(i,"4");
            }else if (lines.get(i).contains("e")){
                lines.set(i,"3");
            }else if (lines.get(i).contains("i")){
                lines.set(i,"1");
            }else if (lines.get(i).contains("o")){
                lines.set(i,"0");
            }
        }
        System.out.println(lines);
        for (int i = 0; i < lines.size(); i++) {
            System.out.print(lines.get(i));

        }
    }
}
