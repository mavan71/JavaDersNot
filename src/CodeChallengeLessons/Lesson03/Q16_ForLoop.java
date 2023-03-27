package CodeChallengeLessons.Lesson03;

public class Q16_ForLoop {
    public static void main(String[] args) {


        //Convert "Java" to "J*a*v*a*"

	/*	ForLoop
		print even numbers from 100 to 0 but do not use decrement(i--).

		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 ....2 0
      */


        String a ="Java";

        for (int i = 0; i < a.length() ; i++) {
            System.out.print(a.charAt(i)+ "*");
        }

        int number = 100;

        for (int i = 100; i >= 0; i-=2) {
            System.out.println(i+ " ");

        }






























    }
}
