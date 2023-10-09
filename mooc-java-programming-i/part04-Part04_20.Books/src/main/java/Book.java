
public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String bookTitle, int bookPagesAmount, int bookPublicationYear) {
        this.title = bookTitle;
        this.pages = bookPagesAmount;
        this.publicationYear = bookPublicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
