package J12_Arrays.Tasks;

public class Task17 {
    public static void main(String[] args) {

        //task: arr3  deki en büyük elemanı create ediniz.


        int arr3 [][] = {
                {3,5},
                {2,4,1},
                {6,1,2,2},
        };

        int enBuyuk= arr3[0][0]; // herhangi bir elemana 'en büyük' diye atadık

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if(arr3[i][j]> enBuyuk){
                    enBuyuk=arr3[i][j];
                }

            }

        }
        System.out.println("en büyük sayı :" + enBuyuk);











    }
}
