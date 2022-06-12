public class Book implements Comparable<Book> {

    private final String Bookname;
    private final int pageNumber;
    private final String AuthorName;
    private final int releaseDate;


    public Book(String Bookname, int pageNumber, String AuthorName, int releaseDate) {
        this.Bookname = Bookname;
        this.pageNumber = pageNumber;
        this.AuthorName = AuthorName;
        this.releaseDate = releaseDate;
    }

    public String getBookname() {
        return Bookname;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    @Override
    public int compareTo(Book b2) {
        return (this.getBookname()).compareTo(b2.getBookname());
    }


}