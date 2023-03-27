package J20_Constructor;

public class C04_TeacherRunner {// class level

    public static void main(String[] args) {// main level

        C04_Teacher ogretmen1 = new C04_Teacher();// parametresiz default cons. obj create edildi
        ogretmen1.ad="Haluk";
        ogretmen1.soyad="Bilgin";
        ogretmen1.brans="Java becend dev";
        ogretmen1.maas=4000;
        ogretmen1.tecrube=11;
        System.out.println(ogretmen1);


        C04_Teacher cıncıkOgretmen= new C04_Teacher("bahtiyar", "javacan","turkceci", 15,25,4000,true);
        System.out.println(cıncıkOgretmen);










    }//main sonu
}// class sonu
