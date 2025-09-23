package com.example.weatherdashboard.model;

import java.util.List;

// Define required columns
public class WeatherResponse {

    // Define objects required from JSON object
    private Main main;
    private List<Weather> weather;

    // Getters and Setters

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
