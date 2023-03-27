package J10_MethodCreation.Task;

public class Task_kendim05 {

    public static void main(String[] args) {


        // iki int sayıdan ilkinin taban ikincisinin üs olacağı parametreli return type olan method crate ediniz.


        System.out.println(power(2, 5));// 2 üzeri 5i hesapladık
       // System.out.println("power(8,9) = " + power(8, 9));

    }
    static int power (int x, int y) {
        int result = 1;
        for (int i = 1; i <=y ; i++) {
            result*=x;
        }
        return result;
    }
}
