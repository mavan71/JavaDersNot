package J10_MethodCreation.Task;

public class Task_kendim04 {

    public static void main(String[] args) {


        // f(x) = (x+4)*6 şeklindeki fonksiyonu parametreli method olarak create ediniz.


        System.out.println(f(888, 45));


    }

    static int f (int x, int y) {
        int sonuc =(x+y)*6;
       // System.out.println("girilen x ve y değeri için fonksiyonun sonucu: " + sonuc);
        return sonuc;
    }
}
