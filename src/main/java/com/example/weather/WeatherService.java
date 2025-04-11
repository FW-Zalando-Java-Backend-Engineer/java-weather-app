package com.example.weather;

public class WeatherService {

    // Simulate fetching current temperature
    public WeatherData fetchWeather(String city) {
        // In a real app, you'd hit an API here
        double simulatedTempCelsius = 22.0;
        System.out.println("Fetching weather for " + city + "...");
        return new WeatherData(simulatedTempCelsius);
    }
}
