package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    private void updateSum(double monthlySaving, XYChart.Series data) {
        data.getData().clear();
        int saving = 0;
        double yearlySaving = monthlySaving * 12;
        for (int i = 0; i < 31; i++) {
            data.getData().add(new XYChart.Data(i, saving));
            saving += yearlySaving;
        }
    }

    private void updateInterest(double monthlySaving, double interest, XYChart.Series data) {
        data.getData().clear();
        double saving = 0;
        double rate = interest / 100.0;
        double yearlySaving = monthlySaving * 12;

        for (int i = 0; i < 31; i++) {
            data.getData().add(new XYChart.Data(i, saving));
            saving = (saving + yearlySaving) * (1.0 + rate);
        }
    }

    @Override
    public void start(Stage window) {

        Slider monthlySlider = new Slider(25, 250, 25);
        Label monthlyLabel = new Label(Double.toString(monthlySlider.getValue()));
        monthlySlider.setShowTickMarks(true);
        monthlySlider.setShowTickLabels(true);
        monthlySlider.setMajorTickUnit(25);
        monthlySlider.setBlockIncrement(1);

        Slider interestSlider = new Slider(0, 10, 0);
        Label interestLabel = new Label(Double.toString(interestSlider.getValue()));
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setMajorTickUnit(1);
        interestSlider.setBlockIncrement(0.1f);

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");

        XYChart.Series sumData = new XYChart.Series();
        sumData.setName("Savings");
        lineChart.getData().add(sumData);

        XYChart.Series interestData = new XYChart.Series();
        interestData.setName("Savings with interest");
        lineChart.getData().add(interestData);

        monthlySlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            monthlyLabel.setText(String.format("%.1f", newValue));
            updateSum(newValue.doubleValue(), sumData);
            updateInterest(newValue.doubleValue(), interestSlider.getValue(), interestData);
        });

        interestSlider.valueProperty().addListener((obs, oldValue, newValue) -> {
            interestLabel.setText(String.format("%.2f", newValue));
            updateInterest(monthlySlider.getValue(), newValue.doubleValue(), interestData);
        });

        BorderPane monthlyContainer = new BorderPane();
        monthlyContainer.setLeft(new Label("Monthly savings"));
        monthlyContainer.setCenter(monthlySlider);
        monthlyContainer.setRight(monthlyLabel);

        BorderPane interestContainer = new BorderPane();
        interestContainer.setLeft(new Label("Yearly interest rate"));
        interestContainer.setCenter(interestSlider);
        interestContainer.setRight(interestLabel);

        VBox sliderView = new VBox(monthlyContainer, interestContainer);
        sliderView.setPadding(new Insets(20, 20, 20, 20));
        sliderView.setSpacing(20);

        updateSum(monthlySlider.getValue(), sumData);
        updateInterest(monthlySlider.getValue(), interestSlider.getValue(), sumData);

        BorderPane layout = new BorderPane();
        layout.setTop(sliderView);
        layout.setCenter(lineChart);

        Scene view = new Scene(layout, 320, 300);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
}
