package J24_Encapsulation.Tasks.task05;

import java.util.Scanner;

public class Book {
    /*
    * task->
    Book class'ında valuelari girilen bookName ve authorName (String ) İ
    ki tane attributes oluşturunuz.
    Book class'ını datahiding yapınız. (Encapsulate)
    Main class'ın içine object  create edip print eden code create ediniz.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
     */

    private String bookName;
    private String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

}
class Runner{
    static java.util.Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Book k1=new Book("kaşağı", "ömer seyfettin");

        System.out.println(k1);

        System.out.println("Lütfen kitap isnini giriniz");
        String kName=scan.nextLine();
        System.out.println("Kitabın yazarını giriniz");
        String kYazar=scan.nextLine();

        Book k2=new Book(kName, kYazar);
        System.out.println("k2 = " + k2);


    }
}

