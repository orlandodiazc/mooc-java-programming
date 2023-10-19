package application;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList();
        this.readings = new ArrayList();

    }

    public void addSensor(Sensor newSensor) {
        sensors.add(newSensor);
    }

    @Override
    public boolean isOn() {
        return sensors.stream().map(s -> s.isOn()).allMatch(val -> val == true);
    }

    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("There must be atleast a sensor added and the sensors must be on");
        }
        int avg = (int) sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        this.readings.add(avg);
        return avg;

    }

}
