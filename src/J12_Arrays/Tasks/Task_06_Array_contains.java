package J12_Arrays.Tasks;

public class Task_06_Array_contains {

    public static void main(String[] args) {

 /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String furitArr[] = {"Apple", "Orange", "Banana", "Pineapple"};

        boolean flag = false;
        for (int i = 0; i <furitArr.length; i++) {
            if (furitArr[i].equals("Apple")) {
                System.out.println(flag = true);
                break;
            }else {
                System.out.println(flag = false);
                break;
            }
        }


    }
}
