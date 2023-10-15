
public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int initialTacos) {
        tacos = initialTacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos > 0) {
            tacos--;
        }
    }

}
