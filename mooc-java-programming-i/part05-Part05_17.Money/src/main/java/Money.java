
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newCents = cents + addition.cents;
        int newEuros = euros + addition.euros;
        if (newCents > 100) {
            newCents = newCents - 100;
            newEuros++;
        }
        return new Money(newEuros, newCents);

    }

    public boolean lessThan(Money compared) {
        return euros < compared.euros || euros == compared.euros && cents < compared.cents;
    }

    public Money minus(Money decreaser) {
        int newCents = cents - decreaser.cents;
        int newEuros = euros - decreaser.euros;
        if (newEuros < 0) {
            newCents = 0;
            newEuros = 0;
        } else if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }
        return new Money(newEuros, newCents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
