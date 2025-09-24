package com.example.weatherdashboard.service;

import com.example.weatherdashboard.model.WeatherResponse;
import org.springframework.web.client.RestTemplate;

public class WeatherService {

    public static WeatherResponse fetchWeather(String city) {

        // Read API key from environment variable
        String apikey = System.getenv("OWM_API_KEY");
        if (apikey == null || apikey.isBlank()) {
            System.out.println("❌ Missing API key. Set OWM_API_KEY environment variable and rerun.");
            return null;
        }

        // Build url
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apikey + "&units=imperial";

        // Fetch response
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, WeatherResponse.class);
    }

}
