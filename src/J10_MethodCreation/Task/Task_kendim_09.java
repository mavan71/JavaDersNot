package J10_MethodCreation.Task;

public class Task_kendim_09 {

    public static void main(String[] args) {


        /*
        Bir cümlede belirli bir alt dizeyi başka bir String ile değiştirmek için bir program yazın.
         Örneğin, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.
         */

            kelimeDeğiştirme("A batman with bat");





    }

    private static void kelimeDeğiştirme(String str) {
     //   str= "A batman with bat";
      System.out.println(str.replaceAll("bat", "snow"));

    }
}
