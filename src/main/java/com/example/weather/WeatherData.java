package com.example.weather;

public class WeatherData {
    private double temperature;
    private Boolean isCelsius = true;

    public WeatherData(double temperature, Boolean isCelsius) {

        this.temperature = temperature;
        this.isCelsius = isCelsius;
    }

    public double getTemperature() {
        if (isCelsius) return temperature;
        else return temperature * 9/5 + 32; // Convert to Fahrenheit
    }
    public void setTemperature(boolean isCelsius) {
        this.isCelsius = isCelsius;
    }
}
