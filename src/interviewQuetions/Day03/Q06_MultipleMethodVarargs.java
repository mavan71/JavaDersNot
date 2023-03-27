package interviewQuetions.Day03;

import java.util.ArrayList;
import java.util.List;

public class Q06_MultipleMethodVarargs {
    public static void main(String[] args) {

/*
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */




        notOrtalaması("Ahmet",60,80,45,85,100);
        notOrtalaması("Ayşe",40,20,45,75,10);
        notOrtalaması("Hüseyin",60,80,45,55,30);
        notOrtalaması("Kazım",60,80,45,65,90);






    }

    private static void notOrtalaması(String name , int ... notlar) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int a  :notlar) {
            list.add(a);
        }
        double toplam=0;

        for (int i = 0; i < list.size(); i++) {
            toplam+=list.get(i);

        }
        double ortalama=toplam/list.size();
        System.out.println(name + " isimli öğrencinin not ortalaması " + ortalama);
    }
}
