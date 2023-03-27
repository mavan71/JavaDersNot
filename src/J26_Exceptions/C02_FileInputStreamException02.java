package J26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {


        try {// file erişme exception u
            FileInputStream fis = new FileInputStream("C:/Users/Abdi Arman/IdeaProjects/FirstJavaProject/src/J26_Exceptions/deneme");
            int k;
                try {// erişilen file daki data okuma exception u
                    while (((k = fis.read()) != -1)) {
                        System.out.print((char) k );
                    }
                    System.out.println("inner try çalıştı");
                } catch (IOException e) {
                    System.out.println("dosya okunmuyor boş");
                    System.out.println("inner cath çalıştı");
                }
            System.out.println("outher try çalıştı");
        } catch (FileNotFoundException e) {
            System.out.println("dosyaya ulaşılamıyor");
            System.out.println("outher cath çalıştı");
        }

        System.out.println("****************** code çalıştı ****************************");
    }
}
