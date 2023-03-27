package J19_StringBuilder;

public class C03_SB_Soru01 {
    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder();
        sb1.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb1); // B ) abbaccca
    }
}
