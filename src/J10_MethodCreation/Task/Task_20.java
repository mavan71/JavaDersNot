package J10_MethodCreation.Task;

public class Task_20 {
    static String para = "$1 $12 €34 €56 $45 €78";
    static int toplamDolar =0;
    static String dolarStr = "";
    static int toplamEuro= 0;
    static String euroStr = "";
    
    public static void main(String[] args) {

          /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

        paraBrimiAyir();

       


    }

    private static void paraBrimiAyir() {
        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == '€'){
                euroStr=para.substring(i+1,i+3);
                int euroInt =Integer.parseInt(euroStr);
                toplamEuro+= euroInt;
            }

        }
        System.out.println("toplam Avro miktarı: "+ toplamEuro+ " €");

        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == '$') {
                dolarStr=para.substring(i+1, para.indexOf(' ', i+1));
                int dolarInt=Integer.parseInt(dolarStr);
                toplamDolar+= dolarInt;
            }

        }
        System.out.println("toplam dolar miktarı: "+ toplamDolar+ " $");
    }




    }

