package J20_Constructor;

public class C03_StudentRunner {

    public static void main(String[] args) {

        C03_Student ogr1 = new C03_Student(); // student class dan obj create edildi

            ogr1.ad="Bahtiyar";
            ogr1.soyAd="Sazcalar";
            ogr1.okulNo = "352";
            ogr1.sınıf="8/B";
            ogr1.mezunKontrol(ogr1.ortalama);

        System.out.println(ogr1);


                C03_Student ogr2 = new C03_Student();


                ogr2.ad="Ali";
                ogr2.soyAd="Kaçar";
                ogr2.ortalama=51;
                ogr2.mezunKontrol(ogr2.ortalama);
        System.out.println(ogr2);


    }
}
