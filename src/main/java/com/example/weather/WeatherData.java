package com.example.weather;

public class WeatherData {
    private double temperature;
    private boolean isCelsius = true; // Новое поле

    public WeatherData(double temperature, boolean isCelsius) {
        this.temperature = temperature;
        this.isCelsius = isCelsius;
    }

    public double getTemperature() {
        if (isCelsius) return temperature;
        else return temperature * 9/5 + 32; // Перевод в Фаренгейты
    }

    public void setUnit(boolean isCelsius) {
        this.isCelsius = isCelsius;
    }
}
