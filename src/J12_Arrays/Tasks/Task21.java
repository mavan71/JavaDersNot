package J12_Arrays.Tasks;

public class Task21 {

    public static void main(String[] args) {


        /* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};


            int b=1;
            if (arr.length%2==0){
                for (int i = 0; i <arr.length/2; i++) {
                    if (arr[i]!=arr[arr.length-1-i]){
                        b=0;
                        break;
                   }
                }
            }

                if (b==1){
                    System.out.println("Verilen Array simetriktir");
                } else System.out.println("Verilen Array simetrik değildir");





    }
}
