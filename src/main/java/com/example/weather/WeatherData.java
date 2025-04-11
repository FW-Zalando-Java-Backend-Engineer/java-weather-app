public class WeatherData {
    private double temperature;
    private boolean isCelsius = true; // New field

    public WeatherData(double temperature, boolean isCelsius) {
        this.temperature = temperature;
        this.isCelsius = isCelsius;
    }

    public double getTemperature() {
        if (isCelsius) return temperature;
        else return temperature * 9/5 + 32; // Convert to Fahrenheit
    }

    public void setUnit(boolean isCelsius) {
        this.isCelsius = isCelsius;
    }
}