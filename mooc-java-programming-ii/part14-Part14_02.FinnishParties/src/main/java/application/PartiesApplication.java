package application;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage window) {
        Map<String, Map<Integer, Double>> values = new HashMap();
        try (Scanner fileReader = new Scanner(Paths.get("partiesdata.tsv"))) {
            while (fileReader.hasNext()) {
                String years = fileReader.nextLine();
                String[] yearParts = years.split("\t");
                while (fileReader.hasNext()) {
                    String partyData = fileReader.nextLine();
                    String[] partyParts = partyData.split("\t");
                    Map<Integer, Double> pairs = new HashMap();
                    for (int i = 1; i < yearParts.length; i++) {
                        if (partyParts[i].equals("-")) {
                            continue;
                        }
                        int year = Integer.parseInt(yearParts[i]);
                        double relativeSupport = Double.parseDouble(partyParts[i]);
                        pairs.put(year, relativeSupport);

                    }
                    String party = partyParts[0];
                    values.put(party, pairs);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");

        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            lineChart.getData().add(data);
        });

        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
