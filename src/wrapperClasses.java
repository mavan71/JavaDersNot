public class wrapperClasses {

    public static void main(String[] args) {

        String x = "su";        // task1 //
        String y= "kola";
        System.out.println("x =" +x);
        System.out.println("y =" +y);

        String temp;

        temp= x;
        x= y;
        y= temp;

      System.out.println ("x =" +x);
      System.out.println ("y =" +y);

      int a= 45;                // task2 //
            a += 15;
            System.out.println("a = " + a);
            a -= 5;
            System.out.println("a = " + a);
            a *= 2;
            System.out.println("a = " + a);
            a++;
            ++a;
            System.out.println("a = " + a);

        double dd = 1.0* a/3;

            System.out.println("a = " + dd);

        int alininYasi = 15;    // task3 //
        int velininYasi = 25;

        System.out.println("alininYasi = " + alininYasi);
        System.out.println("velininYasi = " + velininYasi);

        alininYasi = alininYasi + velininYasi;
        System.out.println("alininYasi = " + alininYasi);

        velininYasi = alininYasi - velininYasi;
        alininYasi = alininYasi - velininYasi;

        System.out.println("alininYasi = " + alininYasi);
        System.out.println("velininYasi = " + velininYasi);








    }

}