package J26_Exceptions;

public class C06_NumberFormatException {

    public static void main(String[] args) {

        /*
        Number Format Exception--> nümerik formatta olmayan bir value parseInt() meth call edilirse oluşan RTE dir
         */

        String icardi="1905";

        System.out.println("icardi = " + icardi);
        System.out.println("(icardi+1903) = " + (icardi + 1903));

        int vanda = Integer.parseInt(icardi);

        System.out.println("vanda = " + vanda);

        System.out.println("(vanda+1907) = " + (vanda + 1907));

        String id="98765432l";

      //  int invalid = Integer.parseInt(id);
       // System.out.println("invalid = " + invalid); //NumberFormatException
            int invalid;
        try {
            invalid = Integer.parseInt(id);
            System.out.println("bu satırı okuyorsanız exception fırlatmadı");

        }catch (NumberFormatException e){
                id="987654321";
                invalid = Integer.parseInt(id);
            System.out.println("yeni Id " + invalid);
            System.out.println("bu satırları okuyorsanız exception fırlattı ama handle ettik");

        }
    }
}
