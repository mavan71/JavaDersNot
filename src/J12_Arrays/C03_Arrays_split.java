package J12_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Arrays_split {

    public static void main(String[] args) {

// String data Array a çevirmek için ; split()--> girilen parametre değere göre string parçalanır

        String str = "JavaCanlara selam olsun";
        System.out.println("str = " + str);
        String strArr []= str.split(" ");
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
        System.out.println("strArr.length = " + strArr.length);








    }
}
