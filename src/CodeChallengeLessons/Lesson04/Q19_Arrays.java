package CodeChallengeLessons.Lesson04;

public class Q19_Arrays {

    public static void main(String[] args) {


        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        
        String strArr[][]={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double dolar = 0;
        double euro = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                if(strArr[i][j].contains("$")){
                    strArr[i][j] = strArr[i][j].replaceAll("\\W","");
                   dolar+=Double.parseDouble(strArr[i][j]);
                } else if(strArr[i][j].contains("€")){
                    strArr[i][j]=strArr[i][j].replaceAll("\\W","");
                    euro+=Double.parseDouble(strArr[i][j]);
                }
            }
            
        }

        dolar=dolar*3.2;
        euro=euro*4.2;
        System.out.println("dolar toplamı = " + dolar + "$");
        System.out.println("euro toplamı = " + euro + "€");
    }
}
