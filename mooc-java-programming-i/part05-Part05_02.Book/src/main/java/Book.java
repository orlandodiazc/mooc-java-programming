
public class Book {

    private String author;
    private String name;
    private int pageCount;

    public Book(String bookAuthor, String bookName, int bookPageCount) {
        this.author = bookAuthor;
        this.name = bookName;
        this.pageCount = bookPageCount;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pageCount;
    }

    public String toString() {
        return this.author + ", " + this.name + ", " + this.pageCount + " pages";
    }

}
