package CodeChallengeLessons.Lesson03;

import java.util.Scanner;

public class Q18_NestedForLoop {
    public static void main(String[] args) {


/*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Satır sayısı veriniz :");
        int satir= scan.nextInt();
        System.out.println("Sütun sayısı veriniz : ");
        int sutun = scan.nextInt();



        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }































    }
}
