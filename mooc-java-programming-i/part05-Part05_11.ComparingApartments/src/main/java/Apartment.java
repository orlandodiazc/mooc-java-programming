
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int ownPrice = squares * pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        int difference = ownPrice - comparedPrice;
        if (difference < 0) {
            return difference * -1;
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ownPrice = squares * pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        return ownPrice > comparedPrice;
    }
}
