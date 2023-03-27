package J13_ArrayList.Tasks02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        ArrayList<String> nameList=new ArrayList<String>(List.of("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("nameList = " + nameList);

        System.out.println("nameList 3. eleman = " + nameList.get(2));//Kemal
        System.out.println("nameList 8. eleman = " + nameList.get(7));//Furkan

        nameList.set(2,"Furkan");
        nameList.set(7,"Kemal");
        System.out.println("nameList = " + nameList);





    }
}
