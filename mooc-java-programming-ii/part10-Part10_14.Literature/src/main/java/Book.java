
public class Book implements Comparable<Book> {

    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    @Override
    public int compareTo(Book book) {
        if (this.ageRecommendation == book.ageRecommendation) {
            return this.name.compareTo(book.name);
        }
        return this.ageRecommendation - book.ageRecommendation;
    }

    public String toString() {
        return name + " (recommended for " + ageRecommendation + " year-olds or older)";
    }

}
