package FlightControl;

import FlightControl.logic.FlightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlightControl fc = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI ui = new TextUI(fc, scanner);
        ui.start();
    }
}
