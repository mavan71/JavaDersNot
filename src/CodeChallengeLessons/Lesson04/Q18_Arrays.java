package CodeChallengeLessons.Lesson04;

public class Q18_Arrays {

    public static void main(String[] args) {

        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int sayiArr[][]={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int enKucuk=10;
        for (int i = 0; i < sayiArr.length; i++) {
            for (int j = 0; j < sayiArr[i].length; j++) {
                if(sayiArr[i][j]<enKucuk){
                    enKucuk=sayiArr[i][j];
                }

            }

        }
            System.out.println("en küçük sayı = " + enKucuk);

    }
}
