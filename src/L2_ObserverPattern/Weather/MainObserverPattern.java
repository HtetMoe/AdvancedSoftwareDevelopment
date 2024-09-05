package L2_ObserverPattern.Weather;

/*
    This simple example demonstrates the Observer pattern by allowing multiple display
    elements to automatically update and display new weather information
    whenever the weather station’s data changes.
 */

import L2_ObserverPattern.Weather.observers.CurrentConditionsDisplay;
import L2_ObserverPattern.Weather.observers.ForecastDisplay;
import L2_ObserverPattern.Weather.subject.WeatherStation;

public class MainObserverPattern {
    public static void main(String[] args) {
        //concrete subject
        WeatherStation weatherStation = new WeatherStation();

        //concrete observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        //register observers
        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forecastDisplay);

        // Simulate new weather measurements
        weatherStation.setMeasurements(25.0f, 65.0f, 1012.0f);
        weatherStation.setMeasurements(27.0f, 70.0f, 1013.5f);
        weatherStation.setMeasurements(22.0f, 90.0f, 1009.0f);
    }
}
