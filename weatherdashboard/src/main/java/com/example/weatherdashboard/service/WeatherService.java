package com.example.weatherdashboard.service;

import com.example.weatherdashboard.model.WeatherResponse;
import org.springframework.web.client.RestTemplate;

public class WeatherService {

    private static final String apikey = "154b969694f9612c3fe24336ff839532";

    public static WeatherResponse fetchWeather(String city) {

        // Build url
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apikey + "&units=imperial";

        // Fetch response
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

}
