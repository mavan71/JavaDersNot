package J12_Arrays.Tasks;

public class Task15 {

    public static void main(String[] args) {

        int arr3 [][] = {
                {3,5},
                {2,4,1},
                {6,1,2,2},
        };// array elemanların çarpımını create ediniz


        int carpım=1;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                carpım*=arr3[i][j];
            }

        }
        System.out.println("çarpım " + carpım);
    }
}
