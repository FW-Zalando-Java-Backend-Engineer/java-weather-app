package com.example.weather;

import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherService service = new WeatherService();

        System.out.println("🌤️ Welcome to the Java Weather App!");
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        WeatherData data = service.fetchWeather(city);

        System.out.println("Current temperature in " + city + ": " + data.getTemperature() + " °C");
    }
}
