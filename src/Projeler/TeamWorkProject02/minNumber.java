package Projeler.TeamWorkProject02;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayinin min number print eden code create ediniz.

     */




    public static void main(String[] args) {

        int minNumber[][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int min = minNumber[0][0];
        for (int i = 0; i < minNumber.length; i++) {
            for (int j = 0; j < minNumber[i].length; j++) {
                if (minNumber[i][j] < min){
                    min = minNumber[i][j];
                }
            }
        }
        System.out.println(min);


    }

}

