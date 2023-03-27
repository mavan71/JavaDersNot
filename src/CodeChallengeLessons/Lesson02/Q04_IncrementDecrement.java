package CodeChallengeLessons.Lesson02;

public class Q04_IncrementDecrement {
    public static void main(String[] args) {


         /*
      Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
      Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
     */


        int x = 1;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(--y);
        System.out.println(y--);
        System.out.println(y);

        int a= 20;
        int b = 15;

        System.out.println(++a + b--);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(++a + --b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        int z = 5;
        System.out.println(++z + z++ + z++ + --z + z-- + z);
        System.out.println("z = " + z);


    }




}
