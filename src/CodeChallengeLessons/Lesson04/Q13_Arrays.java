package CodeChallengeLessons.Lesson04;

public class Q13_Arrays {

    public static void main(String[] args) {

        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        int sayiArr[]={1,2,3,4,5,6,7};
        int toplam=0;

        for (int i = 0; i < sayiArr.length; i++) {
            toplam+=sayiArr[i];
        }
        int ortalama = toplam/sayiArr.length;
        System.out.println("ortalama: " + ortalama);

        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]> ortalama) {
                System.out.print(sayiArr[i] + ",");
            }

        }
    }
}
