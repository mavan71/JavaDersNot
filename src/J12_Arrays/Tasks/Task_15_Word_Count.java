package J12_Arrays.Tasks;

public class Task_15_Word_Count {
    public static void main(String[] args) {

 /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String str="Removes white space from both ends of a string";

        String strArr []= str.split(" ");

        System.out.println("Kelime sayısı = " + strArr.length);

    }
}
