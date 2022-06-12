import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Simyacı",188,"Paulo Coelho",1988);
        Book book2 = new Book("Olasılıksız",472,"Adam Faver",2005);
        Book book3 = new Book("1984",352,"George Orwell",1949);
        Book book4 = new Book("Empati",690,"Adam Faver",2007);
        Book book5 = new Book("Dorian Gray'in Portresi",279,"Oscar Wilde",1890);

        TreeSet<Book> bookSetName = new TreeSet<>();

        bookSetName.add(book1);
        bookSetName.add(book2);
        bookSetName.add(book3);
        bookSetName.add(book4);
        bookSetName.add(book5);

        for (Book book:bookSetName){
            System.out.printf("Book Name: %-25s Page: %4d\n", book.getBookname(), book.getPageNumber());
        }

        System.out.println("===============================");

        TreeSet<Book> bookSetPageNumber = new TreeSet<>(((Comparator<Book>) Comparator.comparingInt(Book::getPageNumber)).reversed());
        bookSetPageNumber.add(book1);
        bookSetPageNumber.add(book2);
        bookSetPageNumber.add(book3);
        bookSetPageNumber.add(book4);
        bookSetPageNumber.add(book5);

        for (Book book:bookSetPageNumber) {
            System.out.printf("Book Name: %-25s Page: %5d\n", book.getBookname(), book.getPageNumber());
        }

    }
}
