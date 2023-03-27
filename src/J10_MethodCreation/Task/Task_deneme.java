package J10_MethodCreation.Task;

public class Task_deneme {

    public static void main(String[] args) {

        method(null);
        
    }

    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method (String s) {
        System.out.println("String method");
    }
}
