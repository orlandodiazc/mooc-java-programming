package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(2007, 2017, 1);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Rank");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinski global ranking 2007-2017, according to SRC");

        XYChart.Series helsinskiData = new XYChart.Series();
        helsinskiData.setName("UoH");
        helsinskiData.getData().add(new XYChart.Data(2007, 73));
        helsinskiData.getData().add(new XYChart.Data(2008, 68));
        helsinskiData.getData().add(new XYChart.Data(2009, 72));
        helsinskiData.getData().add(new XYChart.Data(2010, 72));
        helsinskiData.getData().add(new XYChart.Data(2011, 74));
        helsinskiData.getData().add(new XYChart.Data(2012, 73));
        helsinskiData.getData().add(new XYChart.Data(2013, 76));
        helsinskiData.getData().add(new XYChart.Data(2014, 73));
        helsinskiData.getData().add(new XYChart.Data(2015, 67));
        helsinskiData.getData().add(new XYChart.Data(2016, 56));
        helsinskiData.getData().add(new XYChart.Data(2017, 56));

        lineChart.getData().add(helsinskiData);

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
