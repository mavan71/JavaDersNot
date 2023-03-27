package J10_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {//main başlangıcı



String JavaCan = "Ahmet bey";
String JavaTar = "Ceren hanım";
        System.out.println("JavaTar :" +JavaTar);
        selamVer();

/*
farklı class lardan method çağırmak için Classname.method() yazılır
aynı class da ise sadece method ismiyle call edilebilir.
 */

C03_MethodDepo.gecmeNotu(55);




    }// main sonu

public static void selamVer(){
    System.out.println("Javatar'a selam dewamkee");
}

} //class sonu

