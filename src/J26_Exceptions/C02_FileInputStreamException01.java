package J26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    public static void main(String[] args) throws IOException {



    FileInputStream fis = new FileInputStream("C:/Users/Abdi Arman/IdeaProjects/FirstJavaProject/src/J26_Exceptions/deneme");
        // FileNotException --> ulaşılmak istenen file ın yolu yanlışsa
        //IOException -->

    int k;
    while ((k=fis.read())!=-1) {// fis.read() ile ulaşılan file deki ascii değerlerin -1 olmama şartı
        System.out.print((char) k);
    }
        System.out.println("****************** code çalıştı ****************************");
    }
}
