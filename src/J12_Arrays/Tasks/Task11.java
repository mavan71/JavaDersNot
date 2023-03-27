package J12_Arrays.Tasks;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {

 /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */


        String str [] = {"$1","$23","$134","$2","$7","$24","£32","£40","£2","£65","£4"};
        String dolar []={} ;
        String paund []={};
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("$")){
                dolar[i]=str[i];
            } else if (str[i].contains("£")){
                paund[i]=str[i];
            }

            
        }
            int dolarToplamı=0;
        for (int i = 0; i <dolar.length; i++) {
            dolarToplamı+=Integer.parseInt(dolar[i]);
        }
        System.out.println("dolarToplamı = " + dolarToplamı);

        
        int pauntToplamı=0;
        for (int i = 0; i < paund.length; i++) {
            pauntToplamı+=Integer.parseInt(paund[i]);
        }
        System.out.println("pauntToplamı = " + pauntToplamı);
        
        
        
        
        
        
        
        
    }
}
