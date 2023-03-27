package J07_StringManipulation;

public class Task_14_String_methods11 {
    public static void main(String[] args) {


        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */



        String myve= "apple";
        String myve2 ="APPLE";

        System.out.println("myve.equalsIgnoreCase(myve2) = " + myve.equalsIgnoreCase(myve2));


    }
}
