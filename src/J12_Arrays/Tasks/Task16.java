package J12_Arrays.Tasks;

public class Task16 {

    public static void main(String[] args) {

        int arr3 [][] = {
                {3,5},
                {2,4,1},
                {6,1,2,2},
        }; // son elemanlarının çarpımını create ediniz.


        int carpım=1;
        for (int i = 0; i < arr3.length; i++) {
            carpım*=arr3[i][arr3[i].length-1];
        }
        System.out.println(carpım);
    }
}
