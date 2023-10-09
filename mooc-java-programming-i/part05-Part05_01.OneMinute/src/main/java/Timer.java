
public class Timer {

    private ClockHand centiseconds;
    private ClockHand seconds;

    public Timer() {
        this.centiseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);

    }

    public void advance() {
        centiseconds.advance();
        if (centiseconds.value() == 0) {
            seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.centiseconds;
    }
}
