package interviewQuetions.Day04;

public class Q08_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

    public static void main(String[] args) {
        String str = "aaabbbbbcccccccc";

        int tekrar;
        String output="";
        for (int i = 0; i <str.length(); i++) {
            tekrar=0;
            for (int j = 0; j <str.length(); j++) {
                if(str.substring(i,i+1).equals(str.substring(j,j+1))){
                    tekrar++;
                }
            }
            if (!output.contains(str.substring(i,i+1))){
                output +=str.substring(i,i+1)+tekrar;
            }
        }

        System.out.println(output);

    }


}
