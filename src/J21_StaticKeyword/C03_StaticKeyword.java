package J21_StaticKeyword;

public class C03_StaticKeyword {

    int studentId;
    static int ogrenciSayisi;

    public C03_StaticKeyword(){
        ogrenciSayisi++; // bu contract her obj create edildiğinde öğrenciSayisi 1 artırılır
        studentId+=ogrenciSayisi; //bu contract her obj create edildiğinde studentId create edilen obje değeri olarak atanır.
    }

    public static void main(String[] args) {

        System.out.println("obje a öncesi öğrenci sayısı  "+ ogrenciSayisi);
        C03_StaticKeyword a = new C03_StaticKeyword();
        System.out.println("obje a sonrası öğrenci sayısı "+ ogrenciSayisi);
            C03_StaticKeyword b=   new C03_StaticKeyword();
            C03_StaticKeyword c=   new C03_StaticKeyword();
            C03_StaticKeyword d=   new C03_StaticKeyword();
        System.out.println("obje a-b-c-d sonraso öğrenci sayısı "+ ogrenciSayisi);

        C03_StaticKeyword e; // declaration var ama assaingment yok
        System.out.println("öğrenci sayısı "+ ogrenciSayisi);
        System.out.println("a.studentId = " + a.studentId);
        System.out.println("b.studentId = " + b.studentId);
        System.out.println("c.studentId = " + c.studentId);
        System.out.println("d.studentId = " + d.studentId);
      //  System.out.println("e.studentId = " + e.studentId);
        System.out.println("ogrenciSayisi = " + ogrenciSayisi);


    }
}
