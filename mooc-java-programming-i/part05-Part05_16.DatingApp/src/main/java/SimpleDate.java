
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);
        return newDate;
    }

    public void advance(int howManyDays) {
        int updatedDay = day + howManyDays;
        if (updatedDay > 30) {
            day = updatedDay - 30;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        } else {
            day = updatedDay;
        }

    }

    public void advance() {
        this.advance(1);
    }
}
