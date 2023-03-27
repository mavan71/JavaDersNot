package J18_ImmutableClass;

import java.util.ArrayList;

public class C02_ImmutableClass {
    public static void main(String[] args) {

        /*
        Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
        BigDecimal, BigInteger java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
       */

    String name="Aydın";
        System.out.println("******immutable class******");
        System.out.println("method öncesi name: " + name);

    name.concat("QA team leade");

        System.out.println("method sonrası name = " + name); // String ımmutable class olduğu için variable

        System.out.println("*** mutable class *****");
        ArrayList<String> isimList = new ArrayList<String>(); // boş String type list

        System.out.println("method öncesi isimList = " + isimList);

        isimList.add("Abdi");
        isimList.add("Ceren");
        isimList.add("Tuğba");

        System.out.println("method sonrası isimlist :" + isimList); // isim list mutable class olduğundan method call sonrası değişmiştir.














    }
}
