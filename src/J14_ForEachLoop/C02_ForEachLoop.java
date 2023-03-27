package J14_ForEachLoop;

public class C02_ForEachLoop {

    public static void main(String[] args) {

        // task array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
        
        int carpım=1;
        for (int a [] :arr) { // kat tekrarı
            for (int b :a) { // daire tekrarı
                carpım*=b;
            }

        }
        System.out.println("carpım = " + carpım); //5040 print









    }
}
