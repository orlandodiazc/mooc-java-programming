
public class Bird {

    private String name;
    private String latin;
    private int observations;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public void addObservation() {
        observations++;
    }

    @Override
    public String toString() {
        String observationOutput = " observations";
        if (observations == 1) {
            observationOutput = " observation";
        }
        return name + " (" + latin + "): " + observations + observationOutput;
    }

}
