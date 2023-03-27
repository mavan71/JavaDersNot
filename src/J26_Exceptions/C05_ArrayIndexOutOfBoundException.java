package J26_Exceptions;

public class C05_ArrayIndexOutOfBoundException {

    public static void main(String[] args) {

    /*
    Array Index Out Of Bound Exception--> Array de olmayan elemanle ilgili işlem yapıldığında oluşan RTE
     */

        int sayiArr []={33,58,55,31,44,02,63,21};
        System.out.println(sayiArr[5]); //02

      //  System.out.println("sayiArr[12] = " + sayiArr[12]);//ArrayIndexOutOfBoundsException

        try {
            System.out.println("sayiArr[12] = " + sayiArr[12]);
            System.out.println("bu satır okunuyorsa code RTE fırlatmadı ");
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("array in olmayan elemanı isteniyor "+ e.getMessage());
            System.out.println("bu satırları okuyorsanız code exception fırlattı ama handle ettik");

        }
    }
}
