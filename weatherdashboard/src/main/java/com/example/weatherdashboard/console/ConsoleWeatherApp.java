package com.example.weatherdashboard.console;

import com.example.weatherdashboard.model.Main;
import com.example.weatherdashboard.model.Weather;
import com.example.weatherdashboard.model.WeatherResponse;
import com.example.weatherdashboard.service.WeatherService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ConsoleWeatherApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String city = "";

        // Loop until the user exits
        while (true) {

            System.out.println("Weather Dashboard");
            System.out.println("1. Chicago");
            System.out.println("2. London");
            System.out.println("3. Paris");
            System.out.println("4. Melbourne");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    city = "Chicago";
                    break;
                case "2":
                    city = "London";
                    break;
                case "3":
                    city = "Paris";
                    break;
                case "4":
                    city = "Melbourne";
                    break;
                case "5":
                    System.out.println("Thanks for using Weather Dashboard. Goodbye!");
                    return;
                default:
                    System.out.println("Please enter a valid entry.");
                    continue;
            }

            WeatherResponse response = WeatherService.fetchWeather(city);

            Main main = response.getMain();
            List<Weather> weatherList = response.getWeather();
            String description = weatherList.get(0).getDescription();

            System.out.println("Weather for " + city + ":");
            System.out.println("Temperature: " + main.getTemp() + "°F");
            System.out.println("Humidity: " + main.getHumidity() + "%");
            System.out.println("Description: " + description);

        }

    }

}
