package com.example.weatherdashboard.controller;

import com.example.weatherdashboard.model.WeatherResponse;
import com.example.weatherdashboard.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return WeatherService.fetchWeather(city);
    }
}
