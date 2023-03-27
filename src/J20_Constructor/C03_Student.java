package J20_Constructor;

public class C03_Student {
/*
fields:
aşağıdaki lerle 2 farklı obj.  ile oratalama 50 üstü ise mezun oldunuz

*/
String ad="";
String soyAd="";
String sınıf ="";
double ortalama=0;
String okulNo="";
boolean takdirBelgesi = false;


    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", sınıf='" + sınıf + '\'' +
                ", ortalama=" + ortalama +
                ", okulNo='" + okulNo + '\'' +
                ", takdirBelgesi=" + takdirBelgesi +
                '}';
    }




//    public static void main(String[] args) {
//
//
//        C03_Student öğrenci1 = new C03_Student();
//
//        öğrenci1.ad ="Ahmet";
//        öğrenci1.soyAd="Gelen";
//        öğrenci1.okulNo="1345";
//        öğrenci1.sınıf="7/A";
//        öğrenci1.ortalama=4.95;
//        öğrenci1.takdirBelgesi=true;
//        öğrenci1.mezunKontrol(öğrenci1.ortalama);
//        öğrenci1.sosyalFaaliyet();
//
//        System.out.println(öğrenci1);
//
//        C03_Student öğrenci2 = new C03_Student();
//
//        öğrenci2.ad ="Merve";
//        öğrenci2.soyAd="Koşan";
//        öğrenci2.okulNo="1745";
//        öğrenci2.sınıf="7/B";
//        öğrenci2.ortalama=5.00;
//        öğrenci2.takdirBelgesi=true;
//        öğrenci2.mezunKontrol(öğrenci2.ortalama);
//        öğrenci2.sosyalFaaliyet();
//
//        System.out.println(öğrenci2);
//
//
//
//
//
//
//
//
//    }

    public void mezunKontrol(double ortalama) {
        if (ortalama>=50) {
            System.out.println("mezun oldunuz");
        } else {
            System.out.println("Mezun değilsin");
        }
    }

    public void sosyalFaaliyet() {
        System.out.println("Mangala selam, gezmeye devam");
    }
}

