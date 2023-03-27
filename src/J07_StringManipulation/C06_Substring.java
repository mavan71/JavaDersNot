package J07_StringManipulation;

public class C06_Substring {
    public static void main(String[] args) {

        // substring : String i istediğimiz şartlarda parçalamaya yarar. sonuç yine String dir.
        // substring(i) metodu girilen index den sonra kalan parçayı return eder.
        // : String (başlangıç indexi , bitiş indexi )  olabilir.
        // başlangıç : dahil
        // bitiş : dahil değil

        String str = "Madem geldin dünyaya otur çalış Java'ya";

        System.out.println(str.substring(5));

        System.out.println(str.substring(5, 9)); // 5-6-7-8 . karakterleri verir

        // str deki son 10 karakteri print ediniz

        System.out.println(str.substring(str.length() - 10));

        // str deki ilk 10 karakteri print ediniz

        System.out.println(str.substring(0, 10));
        System.out.println(str.substring(0, 1)); //ilk karakter
        System.out.println(str.substring(str.length() - 1));  // son karakter


        /// task : girilen 4 harfli kelimeyi tersten yazdıran program print edin.





    }
}
