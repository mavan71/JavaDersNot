package CodeChallengeLessons.Lesson02;

public class Q02_Modulus {
    public static void main(String[] args) {


        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
        // Hint: use / and %
        //    input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5


        int sayi = 12345;

        int birler = 12345%10;
        int onlar = (12345/10)%10;
        int yüzler = (12345/100)%10;
        int binler = (12345/1000)%10;
        int onbinler = (12345/10000);
        System.out.println(onbinler+ "\n" +binler+"\n" +yüzler+"\n" + onlar+"\n" + birler);
















    }




}
